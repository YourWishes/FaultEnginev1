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

import java.util.ArrayList;
import java.util.List;
import static org.lwjgl.opengl.GL20.*;

/**
 *
 * @author Dominic Masters
 */
public class ShaderProgram {
    private static ShaderProgram BOUND_PROGRAM;
    public static void unbindProgram() {
        if(BOUND_PROGRAM == null) return;
        glUseProgram(0);
        BOUND_PROGRAM = null;
    }
    
    //Instance
    private int program = -1;
    private List<Shader> shaders = new ArrayList<Shader>();
    
    public ShaderProgram() {}
    
    public int getProgramID() {return this.program;}
    public ShaderProgram addShader(Shader shader) {this.shaders.add(shader); return this;}
    
    public void compile() throws Exception {        
        this.program = glCreateProgram();
        if(this.program == 0) {
            this.program = -1;
            throw new Exception("Failed to create ShaderProgram (Failed to Gen ID)");
        }
        
        for(Shader shader : this.shaders) {
            glAttachShader(this.program, shader.getID());
        }
        glLinkProgram(this.program);
        glValidateProgram(this.program);
    }
    
    public void bind() {glUseProgram(this.program);}
}
