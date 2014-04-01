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

package com.domsplace.FaultEngine.Lighting;

import com.domsplace.FaultEngine.Display.Color;
import static com.domsplace.FaultEngine.Display.DisplayManager.enableLighting;
import com.domsplace.FaultEngine.Location.Location;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Dominic Masters
 */
public class SimpleLight implements Light {    
    //Instance
    private Location location = new Location();
    
    private Color diffuse = new Color(1.0f, 1.0f, 1.0f);
    private Color ambient = new Color(0,0,0);
    private Color specular = new Color(1.0f, 1.0f, 1.0f);
    
    @Override public Location getLocation() {return this.location;}
    @Override public Color getDiffuse() {return this.diffuse;}
    @Override public Color getAmbient() {return this.ambient;}
    @Override public Color getSpecular() {return this.specular;}
    
    @Override public void setLocation(Location l) {this.location = l.clone();}
    @Override public void setDiffuse(Color c) {this.diffuse = c.clone();}
    @Override public void setAmbient(Color c) {this.ambient = c.clone();}
    @Override public void setSpecular(Color c) {this.specular = c.clone();}
    
    @Override
    public void render(int id) {
        Location l = this.getLocation();
        enableLighting();
        glLight(id, GL_POSITION, l.asFloatBuffer());
        glLight(id, GL_DIFFUSE, getDiffuse().asFloatBuffer(1f));
        glLight(id, GL_AMBIENT, getAmbient().asFloatBuffer(1f));
        glLight(id, GL_SPECULAR, getSpecular().asFloatBuffer(1f));
        glLightModeli(GL_LIGHT_MODEL_LOCAL_VIEWER, GL_TRUE);
        glColorMaterial(GL_FRONT_AND_BACK, GL_AMBIENT_AND_DIFFUSE);
    }
}
