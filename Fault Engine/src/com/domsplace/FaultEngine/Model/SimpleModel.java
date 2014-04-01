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
import com.domsplace.FaultEngine.Display.RenderPass;
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
        this.pivot = model.getPivotLocation().clone();
        this.faces = new ArrayList<Face>(model.getFaces());
        this.material = model.getMaterial();
        this.children = new ArrayList<Model>(model.getChildren());
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
    @Override public void removeFace(Face f) {this.faces.remove(f);}
    
    @Override public void setMaterial(Material m) {this.material = m;}
    @Override public void setParent(Model m) {this.parent = m;}
    @Override public void setScaleX(double x) {this.scaleX = x;}
    @Override public void setScaleY(double y) {this.scaleY = y;}
    @Override public void setScaleZ(double z) {this.scaleZ = z;}
    @Override public void setScale(double s) {this.scaleX = this.scaleY = this.scaleZ = s;}
    @Override public void setShaderProgram(ShaderProgram shaderProgram) {this.shaderProgram = shaderProgram;}
    
    public Material cloneMaterial() {this.setMaterial(this.getMaterial().clone()); return this.getMaterial();}
    
    @Override
    public void render(RenderPass pass) {
        glPushMatrix();
        
        this.getLocation().applyTranslations();
        this.getPivotLocation().applyTranslations();
        glScaled(this.scaleX, this.scaleY, this.scaleZ);
        
        Texture t = null;
        ShaderProgram sp = null;
        
        if(pass.equals(RenderPass.OUTLINE_RENDERING)) {
            if(this.getMaterial().getOutlined()) {
                //Unset Texture
                t = this.getMaterial().getTexture();
                this.getMaterial().setTexture(null);
                SimpleTexture.unbindTexture();

                //Unset ShaderProgram
                sp = this.getShaderProgram();
                this.setShaderProgram(null);
                ShaderProgram.unbindProgram();
                
                //Lighting Disable
                boolean lightingEnabled = LIGHTING_ENABLED;
                disableLighting();
                
                //Render Lines
                glLineWidth(this.getMaterial().getOutlineThickness());
                glPolygonMode(GL_BACK, GL_LINE);
                Color outline = this.getMaterial().getOutlineColor();
                glColor4f(outline.r, outline.g, outline.b, outline.alpha);
                this.renderMesh();
                
                //Reset Texture and Shader Program
                this.getMaterial().setTexture(t);
                this.setShaderProgram(shaderProgram);
                if(lightingEnabled) enableLighting();
            }
        }
        
        if(pass.equals(RenderPass.MESH_RENDERING)) {
            glPolygonMode(GL_BACK, GL_FILL);
            Color c = this.getMaterial().getColor();
            glColor3f(c.r, c.g, c.b);

            //Bind Texture if needed
            if(this.getMaterial().getTextured()) {
                t = this.getMaterial().getTexture();
                t.bindTexture();
            } else {
                SimpleTexture.unbindTexture();
            }

            //Bind Shader Program
            this.applyShader();

            //Render Mesh
            enableDepthTest();
            enableDepthMask();
            enableCullFace();
            setCullFrontFace(false);

            //IF this has some kind of alpha, only render the NON alpha stuff
            if((this.getMaterial().getTextured() && this.getMaterial().getTexture().isTransparent()) || this.getMaterial().getColor().hasAlpha()) {
                enableAlpha();
                textureAlphaSkip();
                this.renderMesh();
            } else {
                disableAlpha();
                this.renderMesh();
            }
        }
        
        //Render Texture Alpha Layer
        if(pass.equals(RenderPass.ALPHA_RENDERING)) {
            if((this.getMaterial().getTextured() && this.getMaterial().getTexture().isTransparent()) || this.getMaterial().getColor().hasAlpha()) {
                glPolygonMode(GL_BACK, GL_FILL);
                Color c = this.getMaterial().getColor();
                glColor4f(c.r, c.g, c.b, c.alpha);
                
                //Bind Texture if needed
                if(this.getMaterial().getTextured()) {
                    t = this.getMaterial().getTexture();
                    t.bindTexture();
                } else {
                    SimpleTexture.unbindTexture();
                }

                //Bind Shader Program
                this.applyShader();
                
                enableAlpha();
                textureNonAlphaSkip();
                this.renderMesh();
            }
        }
        
        for(Model m : this.children) {
            glPushMatrix();
            m.render(pass);
            glPopMatrix();
        }
        
        glPopMatrix();
        DisplayManager.CURRENT_RENDERED_MODELS++;
    }
    
    @Override public abstract void renderMesh();
    
    @Override public abstract Model clone();
    
    public void reInit() {
        for(Model m : this.getChildren()) {
            if(!(m instanceof SimpleModel)) continue;
            ((SimpleModel)m).reInit();
        }
    }
    
    public List<Vertice> getVertices() {
        List<Vertice> verts = new ArrayList<Vertice>();
        for(Face f : this.getFaces()) {
            verts.addAll(f.getVertices());
        }
        return verts;
    }
    
    public void applyShader() {
        if(this.getShaderProgram() != null) {
            //Set Variables
            this.getShaderProgram().setVariable("color", this.getMaterial().getColor().asFloatBuffer(1.0f));
            this.getShaderProgram().setVariable("textured", this.getMaterial().getTextured());
            this.getShaderProgram().setVariable("texture", this.getMaterial().getTextured() ? this.getMaterial().getTexture().getTextureID()-1 : 0);

            this.getShaderProgram().bind();
        } else {
            ShaderProgram.unbindProgram();
        }
    }
}
