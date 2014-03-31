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

package com.domsplace.FaultEngine.Model.Primitives;

import com.domsplace.FaultEngine.Model.EmptyModel;
import com.domsplace.FaultEngine.Model.Material.Material;
import com.domsplace.FaultEngine.Model.Model;
import com.domsplace.FaultEngine.Model.StaticModel;

/**
 *
 * @author Dominic Masters
 */
public class Plane extends EmptyModel {
    private static Plane PLANE_MESH = null;
    private static Plane getMesh() {
        if(PLANE_MESH != null) return PLANE_MESH;
        PLANE_MESH = new Plane(true);
        PLANE_MESH.init();
        return PLANE_MESH;
    }
    
    private Quad plane;
    
    public Plane() {
        this(getMesh());
    }
    
    private Plane(Plane vbo) {
        this.plane = vbo.plane.clone();
        for(Model m : this.getChildren()) {
            this.removeChild(m);
        }
        addChild(this.plane);
        this.cloneMaterial();
    }
    
    private Plane(boolean t) {
        this.plane = new Quad();
        plane.getLocation().setPitch(270);
        plane.getLocation().set(0,0,0);
        addChild(plane);
        this.cloneMaterial();
    }
    
    public Quad getPlaneQuad() {return this.plane;}
    
    @Override
    public void setMaterial(Material m) {
        super.setMaterial(m);
        this.plane.setMaterial(m);
    }
}
