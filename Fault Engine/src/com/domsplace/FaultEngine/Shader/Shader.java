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

package com.domsplace.FaultEngine.Shader;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL20.*;

/**
 *
 * @author Dominic Masters
 */
public class Shader {    
    private int id = -1;
    
    public Shader() {}
    
    public int getID() {return this.id;}
    public boolean getCompiled() {return this.id != -1;}
    
    public void compile(String code, int shaderType) throws Exception {
        this.id = glCreateShader(shaderType);
        if(this.id == 0) {
            this.id = -1;
            throw new Exception("Failed to create shader. (ID Gen Failed)");
        }
        glShaderSource(this.id, code);
        
        glCompileShader(this.id);
        if (glGetProgrami(this.id, GL_COMPILE_STATUS) == GL_FALSE) {
            this.id = -1;
            throw new Exception("Failed to create shader.");
        }
    }
    
    public void activate() {
        
    }
}
