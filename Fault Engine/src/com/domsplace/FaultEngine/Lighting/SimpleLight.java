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

import static com.domsplace.FaultEngine.Display.DisplayManager.enableLighting;
import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Material.Material;
import com.domsplace.FaultEngine.Model.Model;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Dominic Masters
 */
public class SimpleLight implements Light {    
    //Instance
    private Location location = new Location();
    
    @Override public Location getLocation() {return this.location;}
    
    @Override public void setLocation(Location l) {this.location = l.clone();}
    
    @Override
    public void render(Model model) {
        Material material = model.getMaterial();
        enableLighting();
        //Location l = this.getLocation().clone().subtract(model.getLocation());
        Location l = this.getLocation();
        glLight(GL_LIGHT0, GL_POSITION, l.asFloatBuffer());
        glLight(GL_LIGHT0, GL_DIFFUSE, material.getDiffuse().asFloatBuffer(1f));
        glLight(GL_LIGHT0, GL_AMBIENT, material.getAmbient().asFloatBuffer(1f));
        glLight(GL_LIGHT0, GL_SPECULAR, material.getSpecular().asFloatBuffer(1f));
        //glLightModeli(GL_LIGHT_MODEL_TWO_SIDE, GL_TRUE);
        glColorMaterial(GL_FRONT_AND_BACK, GL_AMBIENT_AND_DIFFUSE);
    }
}
