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

package com.domsplace.FaultEngine.Model.Material.Texture;

import static com.domsplace.FaultEngine.Display.DisplayManager.disableTextures;
import static com.domsplace.FaultEngine.Display.DisplayManager.enableTextures;
import java.io.InputStream;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Dominic Masters
 */
public abstract class SimpleTexture implements Texture {
    private static Texture BOUND_TEXTURE = null;
    public static void unbindTexture() {
        disableTextures();
        BOUND_TEXTURE = null;
    }
    
    //Instance
    private InputStream is;
    
    public SimpleTexture(InputStream is) {
        this.is = is;
    }
    
    public InputStream getInputStream() {return this.is;}
    
    @Override public boolean isLoaded() {return getTextureID() != -1;}
    
    public int genID() {return glGenTextures();}
    
    @Override
    public void bindTexture() {
        if(BOUND_TEXTURE != null && BOUND_TEXTURE.equals(this)) {
            enableTextures();
            return;
        }
        if(BOUND_TEXTURE == null) {
            enableTextures();
        }
        glBindTexture(GL_TEXTURE_2D, this.getTextureID());
        BOUND_TEXTURE = this;
    }
}
