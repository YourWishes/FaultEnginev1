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

import com.domsplace.FaultEngine.Display.DisplayManager;
import com.domsplace.FaultEngine.Model.Material.Texture.TextureCoordinate;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Dominic Masters
 */
public class DynamicModel extends SimpleModel {
    public DynamicModel() {
        super();
    }
    
    public DynamicModel(Model model) {
        super(model);
    }

    @Override
    public Model clone() {
        return new DynamicModel(this);
    }

    @Override
    public void renderMesh() {
        glBegin(GL_TRIANGLES);

        //TODO: Finish Material Color
        for(Face face : this.getFaces()) {
            face.getLocation().applyTranslations();
            int i = 0;
            for(Vertice v : face.getVertices()) {
                try {
                    TextureCoordinate tc = face.getTextureCoordinates().get(i);
                    glTexCoord2f(tc.getFloatX(), tc.getFloatY());
                }catch(Throwable t) {}
                
                try {
                    Normal norm = face.getNormals().get(i);
                    glNormal3f(norm.getFloatX(), norm.getFloatY(), norm.getFloatZ());
                }catch(Throwable t) {}
                
                glVertex3f(v.getFloatX(), v.getFloatY(), v.getFloatZ());
                i++;
                DisplayManager.CURRENT_RENDERED_VERTICES++;
            }
            DisplayManager.CURRENT_RENDERED_FACES++;
        }
        
        glEnd();
    }

    @Override public void init() {}

    @Override
    public void dispose() {
    }
}
