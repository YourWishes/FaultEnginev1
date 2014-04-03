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
    
    public boolean cullFaced = true;
    public boolean depthTested = true;
    public boolean depthMasked = true;
    public boolean isLighted = true;
    public boolean render3D = true;
    public boolean render2D = this instanceof Model2D;
    
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
        
        if(model instanceof SimpleModel) {
            SimpleModel sm = (SimpleModel) model;
            this.cullFaced = sm.cullFaced;
            this.depthTested = sm.depthTested;
            this.depthMasked = sm.depthMasked;
            this.isLighted = sm.isLighted;
            this.render3D = sm.render3D;
            this.render2D = sm.render2D;
        }
        
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
    @Override public void setShaderProgram(ShaderProgram shaderProgram) {this.shaderProgram = shaderProgram; for(Model m : this.children) {m.setShaderProgram(shaderProgram);}}
    
    public Material cloneMaterial() {this.setMaterial(this.getMaterial().clone()); return this.getMaterial();}
    
    @Override
    public void render(RenderPass pass) {
        List<Model> children = this.children;
        if(pass.is3D() && !this.render3D && children.size() < 1) return;
        if(!pass.is3D() && !this.render2D && children.size() < 1) return;
        
        glPushMatrix();
        
        this.getLocation().applyTranslations();
        this.getPivotLocation().applyTranslations();
        glScaled(this.scaleX, this.scaleY, this.scaleZ);
        
        if(pass.equals(RenderPass.MESH_RENDERING) && render3D) {
            //Set Mesh Properties
            this.setMeshProperties();
            
            //Render Outlines as Needed
            if(this.getMaterial().getOutlined()) {
                //Unset Texture
                SimpleTexture.unbindTexture();
                ShaderProgram.unbindProgram();
                
                //Lighting Disable
                boolean lightingEnabled = LIGHTING_ENABLED;
                disableLighting();
                
                //Render Lines
                setOutlineThickness(this.getMaterial().getOutlineThickness());
                
                setPolygonMode(GL_BACK, GL_LINE);
                setPolygonOffset(-this.getMaterial().getOutlineThickness(), -this.getMaterial().getOutlineThickness());
                setColor(this.getMaterial().getOutlineColor());
                this.renderMesh();
                
                //Reset Texture and Shader Program
                if(lightingEnabled && this.isLighted) enableLighting();
            }
            
            //Render Normally
            setColor(this.getMaterial().getColor());
            setPolygonMode(GL_BACK, GL_FILL);

            //Bind Texture if needed
            this.bindTexture();

            //Bind Shader Program
            this.applyShader();
            
            //IF this has some kind of alpha, only render the NON alpha stuff
            if((this.getMaterial().getTextured() && this.getMaterial().getTexture().isTransparent()) || this.getMaterial().getColor().hasAlpha()) {
                enableAlpha();
                textureAlphaSkip();
            } else {
                disableAlpha();
            }
            this.renderMesh();
        }
        
        if(pass.equals(RenderPass.MATRIX_2D_MESH_RENDERING) && render2D) {
            //Set Mesh Properties
            this.setMeshProperties();
            
            //Render Normally
            setColor(this.getMaterial().getColor());
            setPolygonMode(GL_BACK, GL_FILL);

            //Bind Texture if needed
            this.bindTexture();
            
            //IF this has some kind of alpha, only render the NON alpha stuff
            if((this.getMaterial().getTextured() && this.getMaterial().getTexture().isTransparent()) || this.getMaterial().getColor().hasAlpha()) {
                enableAlpha();
                textureAlphaSkip();
            } else {
                disableAlpha();
            }
            this.renderMesh();
        }
        
        //Render Texture Alpha Layer
        if(pass.equals(RenderPass.ALPHA_RENDERING) && render3D) {
            if((this.getMaterial().getTextured() && this.getMaterial().getTexture().isTransparent()) || this.getMaterial().getColor().hasAlpha()) {
                setPolygonMode(GL_BACK, GL_FILL);
                if(!this.getMaterial().getTextured()) setColor(this.getMaterial().getColor());
                
                //Bind Texture if needed
                this.bindTexture();

                //Bind Shader Program
                this.applyShader();
                
                enableAlpha();
                textureNonAlphaSkip();
                this.renderMesh();
            }
        }
        
        //Render Children
        for(Model m : children) {
            m.render(pass);
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
            this.getShaderProgram().bind();
            
            this.getShaderProgram().setVariable("color", this.getMaterial().getColor().asFloatBuffer(1.0f));
            this.getShaderProgram().setVariable("textured", this.getMaterial().getTextured());
            this.getShaderProgram().setVariable("texture", this.getMaterial().getTextured() ? this.getMaterial().getTexture().getTextureID()-1 : 0);
        } else {
            ShaderProgram.unbindProgram();
        }
    }
    
    public void bindTexture() {
        if(this.getMaterial().getTextured()) {
            this.getMaterial().getTexture().bindTexture();
        } else {
            SimpleTexture.unbindTexture();
        }
    }
    
    public void setMeshProperties() {
        if(depthTested) {
            enableDepthTest();
        } else {
            disableDepthTest();
        }
        
        if(depthMasked) {
            enableDepthMask();
        } else {
            disableDepthMask();
        }
        
        if(cullFaced) {
            enableCullFace();
        } else {
            disableCullFace();
        }
        
        if(isLighted && DisplayManager.LIGHTING_ENABLED) {
            enableLighting();
        } else {
            disableLighting();
        }
    }
}
