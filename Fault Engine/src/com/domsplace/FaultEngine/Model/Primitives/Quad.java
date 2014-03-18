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

import com.domsplace.FaultEngine.Model.Material.Material;
import com.domsplace.FaultEngine.Model.StaticModel;

/**
 *
 * @author Dominic Masters
 */
public class Quad extends StaticModel {
    public static Triangle[] createQuad() {
        Quad q = new Quad();
        return q.toQuadArray();
    }
    
    //Instance
    private Triangle bottomLeft;
    private Triangle topRight;
    private Triangle[] quadArray = new Triangle[0];
    
    public Quad() {
        super();
        bottomLeft = new Triangle();
        this.addFace(bottomLeft);
        
        topRight = new Triangle();
        this.addFace(topRight);
        
        topRight.setVert0(bottomLeft.getVert0());
        topRight.setVert1(bottomLeft.getVert2());
        topRight.getVert2().set(-0.5f, 0.5f, 0.0f);
        
        this.setMaterial(this.getMaterial().clone());
    }
    
    public Quad(Quad m) {
        super(m);
        this.bottomLeft = m.bottomLeft;
        this.topRight = m.bottomLeft;
        this.quadArray = m.quadArray;
    }
    
    public Triangle getBottomLeft() {return this.bottomLeft;}
    public Triangle getTopRight() {return this.topRight;}
    
    public Triangle[] toQuadArray() {
        if(this.quadArray != null) return this.quadArray;
        return this.quadArray = new Triangle[] {
            bottomLeft,
            topRight
        };
    }
    
    public Quad clone() {
        return new Quad(this);
    }
    
    @Override
    public void setMaterial(Material m) {
        super.setMaterial(m);
    }
}
