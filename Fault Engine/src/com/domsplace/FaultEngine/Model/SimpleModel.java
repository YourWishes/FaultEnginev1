/*
 * Copyright 2014 Dominic Masters.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.domsplace.FaultEngine.Model;

import com.domsplace.FaultEngine.Display.Color;
import com.domsplace.FaultEngine.Display.DisplayManager;
import static com.domsplace.FaultEngine.Display.DisplayManager.*;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Material.Material;
import com.domsplace.FaultEngine.Model.Material.SimpleMaterial;
import com.domsplace.FaultEngine.Model.Material.Texture.SimpleTexture;
import com.domsplace.FaultEngine.Model.Material.Texture.Texture;
import com.domsplace.FaultEngine.Shader.ShaderProgram;
import java.util.ArrayList;
import java.util.List;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Dominic Masters
 */
public abstract class SimpleModel implements Model {
    private Location location = new Location();
    private Location pivot = new Location();
    private List<Face> faces = new ArrayList<Face>();
    private Material material = new SimpleMaterial();
    private List<Model> children = new ArrayList<Model>();
    private ShaderProgram shaderProgram;
    
    private double scaleX = 1.0;
    private double scaleY = 1.0;
    private double scaleZ = 1.0;
    
    private Model parent = null;
    
    //Instance
    public SimpleModel() {
        
    }
    
    public SimpleModel(Model model) {
        this();
        this.location = model.getLocation().clone();
        this.pivot = model.getLocation()    ;
        this.faces = model.getFaces();
        this.material = model.getMaterial();
        this.children = model.getChildren();
        this.shaderProgram = model.getShaderProgram();
        
        this.scaleX = model.getScaleX();
        this.scaleY = model.getScaleY();
        this.scaleZ = model.getScaleZ();
    }
    
    @Override public Location getLocation() {return this.location;}
    @Override public Location getPivotLocation() {return this.pivot;}
    @Override public Material getMaterial() {return this.material;}
    @Override public List<Face> getFaces() {return new ArrayList<Face>(this.faces);}
    @Override public List<Model> getChildren() {return new ArrayList<Model>(this.children);}
    public DisplayManager getDisplayManager() {return Game.GAME_INSTANCE.getDisplayManager();}
    @Override public Model getParent() {return this.parent;}
    @Override public void removeFromParent() {try {this.parent.removeChild(this);}catch(Throwable t) {}}
    @Override public double getScaleX() {return this.scaleX;}
    @Override public double getScaleY() {return this.scaleY;}
    @Override public double getScaleZ() {return this.scaleZ;}
    @Override public ShaderProgram getShaderProgram() {return this.shaderProgram;}
    
    @Override public void addFace(Face face) {this.faces.add(face);}
    @Override public void addFaces(List<? extends Face> face) {this.faces.addAll(face);}
    @Override public void addFaces(Face[] face) {for(Face f : face) {this.addFace(f);}}
    @Override public void addChild(Model m) {this.children.add(m); m.setParent(this);}
    
    @Override public void removeChild(Model m) {this.children.remove(m); m.setParent(null);}
    
    @Override public void setMaterial(Material m) {this.material = m;}
    @Override public void setParent(Model m) {this.parent = m;}
    @Override public void setScaleX(double x) {this.scaleX = x;}
    @Override public void setScaleY(double y) {this.scaleY = y;}
    @Override public void setScaleZ(double z) {this.scaleZ = z;}
    @Override public void setScale(double s) {this.scaleX = this.scaleY = this.scaleZ = s;}
    @Override public void setShaderProgram(ShaderProgram shaderProgram) {this.shaderProgram = shaderProgram;}
    
    public Material cloneMaterial() {this.setMaterial(this.getMaterial().clone()); return this.getMaterial();}
    
    @Override
    public void render() {
        //TODO: Finish translations
        glPushMatrix();
        
        this.getLocation().applyTranslations();
        this.getPivotLocation().applyTranslations();
        glScaled(this.scaleX, this.scaleY, this.scaleZ);
        
        Texture t = null;
        ShaderProgram sp = null;
        
        if(this.getMaterial().getOutlined()) {
            t = this.getMaterial().getTexture();
            this.getMaterial().setTexture(null);
            SimpleTexture.unbindTexture();
            
            sp = this.getShaderProgram();
            this.setShaderProgram(null);
            ShaderProgram.unbindProgram();
            
            boolean lighting = LIGHTING_ENABLED;
            
            disableLighting();
            glLineWidth(this.getMaterial().getOutlineThickness());
            glPolygonMode(GL_BACK, GL_LINE);
            Color outline = this.getMaterial().getOutlineColor();
            glColor3f(outline.r, outline.g, outline.b);
            this.renderMesh();
            
            if(lighting) enableLighting();
        }
        
        glPolygonMode(GL_BACK, GL_FILL);
        Color c = this.getMaterial().getColor();
        glColor3f(c.r, c.g, c.b);
        
        if(t != null) this.getMaterial().setTexture(t);
        if(this.getMaterial().getTextured()) {
            t = this.getMaterial().getTexture();
            t.bindTexture();
        } else {
            SimpleTexture.unbindTexture();
        }
        
        if(sp != null) this.setShaderProgram(sp);
        if(this.getShaderProgram() != null) {
            this.getShaderProgram().bind();
        } else {
            ShaderProgram.unbindProgram();
        }
        
        this.renderMesh();
        
        for(Model m : this.children) {
            m.render();
        }
        
        glPopMatrix();
        Game.GAME_INSTANCE.getDisplayManager().renderLights(this);
        DisplayManager.CURRENT_RENDERED_MODELS++;
    }
    
    @Override public abstract void renderMesh();
    
    @Override public abstract Model clone();
    
    public List<String> toClassableModel() {
        List<String> strings = new ArrayList<String>();
        
        strings.add("DynamicFace f = null;");
        strings.add("Vertice v = null;");
        strings.add("Location l = null;");
        
        for(Face f : this.faces) {
            strings.add("f = new DynamicFace();");
            
            
            String location = "l = new Location(";
            Location l = f.getLocation();
            location += l.getX() + "," + l.getY() + "," + l.getZ() + ",";
            location += l.getPitch() + "," + l.getYaw() + "," + l.getRoll();
            location += ");";
            strings.add(location);
            strings.add("f.setLocation(l);");
            
            for(Vertice v : f.getVertices()) {
                String vert = "v = new Vertice(";
                vert += v.getX() + "," + v.getY() + "," + v.getZ() + ",";
                vert += v.getPitch() + "," + v.getYaw() + "," + v.getRoll();
                vert += ");";
                strings.add(vert);
                strings.add("f.addVertice(v);");
            }
            
            strings.add("this.addFace(f);");
        }
        
        return strings;
    }
}
