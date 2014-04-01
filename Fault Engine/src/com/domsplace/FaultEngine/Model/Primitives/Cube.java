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

/**
 *
 * @author Dominic Masters
 */
public class Cube extends EmptyModel {
    private static Cube CUBE_MESH = null;
    private static Cube getMesh() {
        if(CUBE_MESH != null) return CUBE_MESH;
        Cube mesh = new Cube(true);
        mesh.init();
        return CUBE_MESH = mesh;
    }
    
    private Quad front = new Quad();
    private Quad back = new Quad();
    private Quad left = new Quad();
    private Quad right = new Quad();
    private Quad top = new Quad();
    private Quad bottom = new Quad();
    
    public Cube() {
        this(getMesh());
    }
    
    private Cube(boolean t) {
        super();
        
        this.addChild(front);
        this.addChild(back);
        this.addChild(left);
        this.addChild(right);
        this.addChild(top);
        this.addChild(bottom);
        
        this.front.getLocation().setZ(0.5);
        this.back.getLocation().setZ(-0.5);
        
        this.left.getLocation().setX(0.5);
        this.right.getLocation().setX(-0.5);
        
        this.top.getLocation().setY(0.5);
        this.bottom.getLocation().setY(-0.5);
        
        this.back.getLocation().setYaw(180);
        this.left.getLocation().setYaw(90);
        this.right.getLocation().setYaw(270);
        this.top.getLocation().setPitch(270);
        this.top.getLocation().setRoll(90);
        this.bottom.getLocation().setPitch(90);
        
        front.setMaterial(this.getMaterial());
        back.setMaterial(this.getMaterial());
        left.setMaterial(this.getMaterial());
        right.setMaterial(this.getMaterial());
        top.setMaterial(this.getMaterial());
        bottom.setMaterial(this.getMaterial());
    }
    
    private Cube(Cube m) {
        super(m);
        
        for(Model mod : m.getChildren()) {
            this.removeChild(mod);
        }
        
        this.front = m.front.clone();
        this.back = m.back.clone();
        this.left = m.left.clone();
        this.right = m.right.clone();
        this.top = m.top.clone();
        this.bottom = m.bottom.clone();
        
        for(Model mod : this.getChildren()) {
            mod.setParent(this);
        }
        
        this.addChild(front);
        this.addChild(back);
        this.addChild(left);
        this.addChild(right);
        this.addChild(top);
        this.addChild(bottom);
        
        this.cloneMaterial();
    }
    
    public Quad getFront() {return this.front;}
    public Quad getBack() {return this.back;}
    public Quad getLeft() {return this.left;}
    public Quad getRight() {return this.right;}
    public Quad getTop() {return this.top;}
    public Quad getBottom() {return this.bottom;}
    
    @Override
    public void setMaterial(Material m) {
        super.setMaterial(m);
        this.front.setMaterial(m);
        this.back.setMaterial(m);
        this.left.setMaterial(m);
        this.right.setMaterial(m);
        this.top.setMaterial(m);
        this.bottom.setMaterial(m);
    }
    
    @Override
    public Cube clone() {
        return new Cube(this);
    }
    
    @Override
    public String toString() {
        String l = this.getLocation().toString();
        String x = "CUBE: Location: " + "" + "\n";
        x += "CHILDREN: \n";
        for(Model m : this.getChildren()) {
            x += m.toString() + "\n";
        }
        x += "\n";
        x += "PARENT: " + (this.getParent() != null ? this.getParent().getClass().getSimpleName() : "null") + "\n";
        return x;
    }
}
