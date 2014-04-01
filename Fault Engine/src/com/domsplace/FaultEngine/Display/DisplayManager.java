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

package com.domsplace.FaultEngine.Display;

import com.domsplace.FaultEngine.Display.Camera.Camera;
import com.domsplace.FaultEngine.Display.Camera.SimpleCamera;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Lighting.Light;
import com.domsplace.FaultEngine.Model.Model;
import com.domsplace.FaultEngine.Model.Primitives.Lightbulb;
import com.domsplace.FaultEngine.Shader.ShaderProgram;
import java.awt.Canvas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.opengl.Display;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;

/**
 *
 * @author Dominic Masters
 */
public class DisplayManager {
    public static long CURRENT_RENDERED_MODELS = 0;
    public static long CURRENT_RENDERED_FACES = 0;
    public static long CURRENT_RENDERED_VERTICES = 0;
    
    public static long RENDERED_MODELS = 0;
    public static long RENDERED_FACES = 0;
    public static long RENDERED_VERTICES = 0;
    
    //Static Methods
    public static boolean DEPTH_TEST_ENABLED = false;
    public static boolean CULL_FACE_ENABLED = false;
    public static boolean POLYGON_OFFSET_ENABLED = false;
    public static boolean TEXTURES_ENABLED = false;
    public static boolean LIGHTING_ENABLED = false;
    public static boolean ALPHA_ENABLED = false;
    public static boolean DEPTH_MASK_ENABLED = true;
    public static boolean CULL_FRONT_FACE = false;
    
    public static Map<Integer, Boolean> LIGHTS_ENABLED = new HashMap<Integer, Boolean>();
    
    public static void setCullFrontFace(boolean front) {
        if(CULL_FRONT_FACE == front) return;
        glFrontFace(front ? GL_CW : GL_CCW);
    }
    
    public static void enableDepthTest() {
        if(DEPTH_TEST_ENABLED) return;
        glEnable(GL_DEPTH_TEST);
        DEPTH_TEST_ENABLED = true;
    }
    
    public static void enableCullFace() {
        if(CULL_FACE_ENABLED) return;
        glEnable(GL_CULL_FACE);
        CULL_FACE_ENABLED = true;
    }
    
    public static void enablePolygonOffset() {
        if(POLYGON_OFFSET_ENABLED) return;
        glEnable(GL_POLYGON_OFFSET_FILL);
        POLYGON_OFFSET_ENABLED = true;
    }
    
    public static void enableTextures() {
        if(TEXTURES_ENABLED) return;
        glEnable(GL_TEXTURE_2D);
        glActiveTexture(GL_TEXTURE0);
        TEXTURES_ENABLED = true;
    } 
    
    public static void enableLighting() {
        if(LIGHTING_ENABLED) return;
        glEnable(GL_LIGHTING);
        LIGHTING_ENABLED = true;
    }
    
    public static void enableLight(int id) {
        if(isLightEnabled(id)) return;
        glEnable(id);
        LIGHTS_ENABLED.remove(id);
        LIGHTS_ENABLED.put(id,true);
    }
    
    public static void enableAlpha() {
        if(ALPHA_ENABLED) return;
        glEnable(GL_BLEND);
        glEnable(GL_ALPHA_TEST);
        ALPHA_ENABLED = true;
    }
    
    public static void enableDepthMask() {
        if(DEPTH_MASK_ENABLED) return;
        glDepthMask(DEPTH_MASK_ENABLED = true);
    }
    
    
    
    public static void textureAlphaBlending() {
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    }
    
    public static void textureAlphaSkip() {
        glAlphaFunc(GL_EQUAL, 1.0f);
    }
    
    public static void textureNonAlphaSkip() {
        glAlphaFunc(GL_LESS, 1.0f);
    }
    
    
    
    public static void disableDepthTest() {
        if(!DEPTH_TEST_ENABLED) return;
        glDisable(GL_DEPTH_TEST);
        DEPTH_TEST_ENABLED = false;
    }
    
    public static void disableCullFace() {
        if(!CULL_FACE_ENABLED) return;
        glDisable(GL_CULL_FACE);
        CULL_FACE_ENABLED = false;
    }
    
    public static void disablePolygonOffset() {
        if(!POLYGON_OFFSET_ENABLED) return;
        glDisable(GL_POLYGON_OFFSET_FILL);
        POLYGON_OFFSET_ENABLED = false;
    }
    
    public static void disableTextures() {
        if(!TEXTURES_ENABLED) return;
        glDisable(GL_TEXTURE_2D);
        TEXTURES_ENABLED = false;
    }
    
    public static void disableLighting() {
        if(!LIGHTING_ENABLED) return;
        glDisable(GL_LIGHTING);
        LIGHTING_ENABLED = false;
    }
    
    public static void disableAlpha() {
        if(!ALPHA_ENABLED) return;
        glDisable(GL_BLEND);
        glDisable(GL_ALPHA_TEST);
        ALPHA_ENABLED = false;
    }
    
    public static void disableDepthMask() {
        if(!DEPTH_MASK_ENABLED) return;
        glDepthMask(DEPTH_MASK_ENABLED = false);
    }
    
    public static void disableLight(int id) {
        if(!isLightEnabled(id)) return;
        glDisable(id);
        LIGHTS_ENABLED.remove(id);
        LIGHTS_ENABLED.put(id,false);
    }
    
    
    public static boolean isLightEnabled(int id) {
        if(!LIGHTS_ENABLED.containsKey(id)) return false;
        return LIGHTS_ENABLED.get(id);
    }
    
    //Instance
    private Canvas gameCanvas;
    private Camera camera;
    
    private long lastFrame = 0;
    private double fps;
    
    private final List<Model> renderList = new ArrayList<Model>();
    private final List<Light> lightsList = new ArrayList<Light>();
    
    public boolean drawGrid = false;
    public Color gridColor = Color.fromHex("#DDDDDD");
    public boolean drawAxis = false;
    public boolean drawLights = false;
    
    public Color clearColor = Color.fromHex("#000000");
    
    public DisplayManager() {
    }
    
    public Camera getCamera() {
        if(this.camera == null) this.camera = new SimpleCamera();
        return this.camera;
    }
    
    public List<Model> getRenderList() {return new ArrayList<Model>(this.renderList);}
    public List<Light> getLightsList() {return new ArrayList<Light>(this.lightsList);}

    public void setCamera(Camera camera) {this.camera = camera;}
    
    public void addModelToRenderList(Model m) {this.renderList.add(m);}
    public void addLight(Light l) {this.lightsList.add(l);}
    
    public void removeModelFromRenderList(Model m) {this.renderList.remove(m);}
    public void removeLight(Light l) {this.lightsList.remove(l);}
    
    public void setupLWJGL() throws Throwable {
        gameCanvas = Game.GAME_INSTANCE.getGameFrame().gameCanvas = new Canvas();
        Game.GAME_INSTANCE.getGameFrame().setVisible(true);
        Game.GAME_INSTANCE.getGameFrame().add(gameCanvas);
        gameCanvas.setVisible(true);
        Display.setParent(gameCanvas);
        Display.create();
        
        glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
        glDepthFunc(GL_LEQUAL);
        enableDepthTest();
        glEnable(GL_COLOR_MATERIAL);
        
        glShadeModel(GL_SMOOTH);
        
        enableCullFace();
        setCullFrontFace(true);
        glCullFace(GL_FRONT);
        
        enablePolygonOffset();
        glPolygonOffset(-2f, -2f);
        
        enableAlpha();
        enableTextures();
        textureAlphaBlending();
        
        this.getCamera().getLocation().setZ(10);
    }

    public void update() {
        this.updateFPS();
        
        glClearColor(this.clearColor.r, this.clearColor.g, this.clearColor.b, this.clearColor.alpha);
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        
        if(drawGrid && drawAxis) disableDepthTest();
        if(drawGrid || drawAxis) {
            disableLighting();
            ShaderProgram.unbindProgram();
        }
        
        //Draw Grid
        if(drawGrid) {
            disableTextures();
            glColor3f(this.gridColor.r, this.gridColor.g, this.gridColor.b);
            for(int x = -100; x < 100; x++) {
                for(int y = -100; y <  100; y++) {
                    glPushMatrix();
                    glLineWidth(1);
                    glTranslatef((x * 1),0.0f,(y * 1));
                    glBegin(GL_LINE_LOOP);
                    glVertex3i(0,0,0);
                    glVertex3i(0,0,10);
                    glVertex3i(10,0,10);
                    glVertex3i(10,0,0);
                    glEnd();    
                    glPopMatrix();
                }
            }
        }
        
        if(drawAxis) {
            disableTextures();
            glPushMatrix();
            glColor3f(0,1,0);
            glLineWidth(1);
            glBegin(GL_LINE_LOOP);
            glVertex3i(0,0,0);
            glVertex3i(0,200,0);
            glEnd();
            
            glColor3f(0,0,1);
            glLineWidth(1);
            glBegin(GL_LINE_LOOP);
            glVertex3i(0,0,0);
            glVertex3i(200,0,0);
            glEnd();
            
            glColor3f(1,0,0);
            glLineWidth(1);
            glBegin(GL_LINE_LOOP);
            glVertex3i(0,0,0);
            glVertex3i(0,0,200);
            glEnd();
            glPopMatrix();
        }
        
        enableDepthTest();
        
        RENDERED_MODELS = CURRENT_RENDERED_MODELS;
        RENDERED_FACES = CURRENT_RENDERED_FACES;
        RENDERED_VERTICES = CURRENT_RENDERED_VERTICES;
        CURRENT_RENDERED_MODELS = CURRENT_RENDERED_FACES = CURRENT_RENDERED_VERTICES = 0;
        
        this.getCamera().apply();
        List<Model> RENDER_LIST = this.getRenderList();
        
        //Add Light Bulbs
        if(this.drawLights) {
            for(Light l : this.getLightsList()) {
                Lightbulb lb = new Lightbulb();
                lb.getLocation().set(l.getLocation());
                RENDER_LIST.add(lb);
            }
        }
        
        //Z-ORDER
        Collections.sort(RENDER_LIST, new Comparator<Model>() {
            @Override
            public int compare(Model model1, Model model2) {
                double model1Distance = model1.getLocation().getDistanceFrom(getCamera().getLocation());
                double model2Distance = model2.getLocation().getDistanceFrom(getCamera().getLocation());
                boolean m1lt = model1Distance < model2Distance;
                boolean m1et = model1Distance == model2Distance;
                boolean m1gt = model1Distance > model2Distance;
                
                
                if(m1lt) return 1;
                if(m1et) return 0;
                if(m1gt) return -1;
                return -1;
            }
        });
        
        //PASS0: Render lights
        this.renderLights();
        
        //PASS1: Render Outlines
        for(Model m : RENDER_LIST) {
            try {
                m.init();
                m.render(RenderPass.OUTLINE_RENDERING);
            } catch(Throwable t) {
                Game.GAME_INSTANCE.getLogger().log(t);
            }
        }
        
        //PASS2: Render NON ALPHA based Objects
        for(Model m : RENDER_LIST) {
            try {
                m.init();
                m.render(RenderPass.MESH_RENDERING);
            } catch(Throwable t) {
                Game.GAME_INSTANCE.getLogger().log(t);
            }
        }
        
        //PASS3: Render ALPHA based Objects
        for(Model m : RENDER_LIST) {
            try {
                m.init();
                m.render(RenderPass.ALPHA_RENDERING);
            } catch(Throwable t) {
                Game.GAME_INSTANCE.getLogger().log(t);
            }
        }
        Display.update();
        
        this.lastFrame = System.currentTimeMillis();
        
        try {Display.setVSyncEnabled(Game.GAME_INSTANCE.getGameSettings().getSetting("vsync", true).getValueAsBoolean());} catch(Throwable t) {}
        if(Game.GAME_INSTANCE.getGameSettings().getSetting("vsync", true).getValueAsBoolean()) {
            Display.sync(Game.GAME_INSTANCE.getGameSettings().getSetting("Sync Rate", 60).getValueAsInt());
        }
    }
    
    public void renderLights() {
        int id = GL_LIGHT0;
        List<Light> lights = this.getLightsList();
        
        for(int i = GL_LIGHT0; i < GL_LIGHT0 + glGetInteger(GL_MAX_LIGHTS); i++) {
            if(i-GL_LIGHT0 < lights.size()) {
                enableLight(i);
            } else {
                disableLight(i);
            }
        }
        
        for(Light l : lights) {
            l.render(id);
            id++;
        }
    }
    
    public void destroy() {
        for(Model m : this.getRenderList()) {
            try {
                m.dispose();
            } catch(Throwable t) {
                Game.GAME_INSTANCE.getLogger().log(t);
            }
        }
        Display.destroy();
    }

    public double getFrameRate() {
        return this.fps;
    }
    
    private void updateFPS() {
        long now = System.currentTimeMillis();
        
        double diff = (double)now - (double)this.lastFrame;//How long it's taking to render each frame
        double fps = 1000d / diff; //FPS = 1 second / diff
        this.fps = fps;
    }
}
