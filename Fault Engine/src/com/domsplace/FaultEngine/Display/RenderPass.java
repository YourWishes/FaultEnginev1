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

/**
 *
 * @author Dominic Masters
 */
public class RenderPass {
    public static final RenderPass MESH_RENDERING = new RenderPass("Mesh Rendering");
    public static final RenderPass ALPHA_RENDERING = new RenderPass("Alpha Rendering");
    public static final RenderPass MATRIX_MESH_RENDERING = new RenderPass("Matrix Mesh Rendering");
    public static final RenderPass MATRIX_2D_MESH_RENDERING = new RenderPass("Matrix 2D Mesh Rendering", false);
    public static final RenderPass MATRIX_ALPHA_RENDERING = new RenderPass("Matrix Alpha Rendering");
    
    //Instance
    private String name;
    private boolean is3D;
    
    private RenderPass(String name) {
        this(name, true);
    }
    
    private RenderPass(String name, boolean is3D) {
        this.name = name;
        this.is3D = is3D;
    }
    
    public String getName() {return this.name;}

    public boolean is3D() {
        return this.is3D;
    }
}
