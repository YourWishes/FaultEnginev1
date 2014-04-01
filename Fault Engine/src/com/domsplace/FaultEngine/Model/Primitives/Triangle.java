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

import com.domsplace.FaultEngine.Model.DynamicFace;
import com.domsplace.FaultEngine.Model.Material.Texture.TextureCoordinate;
import com.domsplace.FaultEngine.Model.Normal;
import com.domsplace.FaultEngine.Model.Vertice;

/**
 *
 * @author Dominic Masters
 */
public class Triangle extends DynamicFace {
    private Vertice v0;
    private Vertice v1;
    private Vertice v2;
    
    private TextureCoordinate t0;
    private TextureCoordinate t1;
    private TextureCoordinate t2;
    
    private Normal n0;
    private Normal n1;
    private Normal n2;
    
    public Triangle() {
        super();
        //Right Angle Triangle /|
        Vertice bottomLeft = new Vertice();
        Vertice bottomRight = new Vertice();
        Vertice topRight = new Vertice();
        
        bottomLeft.set(-0.5f, -0.5f, 0);
        bottomRight.set(0.5f, -0.5f, 0);
        topRight.set(0.5f, 0.5f, 0);
        
        this.v0 = bottomLeft;
        this.v1 = bottomRight;
        this.v2 = topRight;
        
        TextureCoordinate bottomLeftT = new TextureCoordinate();
        TextureCoordinate bottomRightT = new TextureCoordinate();
        TextureCoordinate topRightT = new TextureCoordinate();
        
        bottomLeftT.set(0.0f, 0.0f);
        bottomRightT.set(1.0f, 0.0f);
        topRightT.set(1.0f, 1.0f);
        
        this.t0 = bottomLeftT;
        this.t1 = bottomRightT;
        this.t2 = topRightT;
        
        Normal bottomLeftNormal = new Normal();
        Normal bottomRightNormal = new Normal();
        Normal topRightNormal = new Normal();
        
        bottomLeftNormal.set(-0.5f, -0.5f, 0);
        bottomRightNormal.set(0.5f, -0.5f, 0);
        topRightNormal.set(0.5f, 0.5f, 0);
        
        this.n0 = bottomLeftNormal;
        this.n1 = bottomRightNormal;
        this.n2 = topRightNormal;
        
        this.reset();
    }

    private Triangle(Triangle aThis) {
        super(aThis);
        this.v0 = aThis.v0.clone();
        this.v1 = aThis.v1.clone();
        this.v2 = aThis.v2.clone();
        
        this.t0 = aThis.t0.clone();
        this.t1 = aThis.t1.clone();
        this.t2 = aThis.t2.clone();
        
        this.n0 = aThis.n0.clone();
        this.n1 = aThis.n1.clone();
        this.n2 = aThis.n2.clone();
        this.reset();
    }
    
    public Vertice getVert0() {return this.v0;}
    public Vertice getVert1() {return this.v1;}
    public Vertice getVert2() {return this.v2;}
    
    public TextureCoordinate getTextureCoordinate0() {return this.t0;}
    public TextureCoordinate getTextureCoordinate1() {return this.t1;}
    public TextureCoordinate getTextureCoordinate2() {return this.t2;}
    
    public Normal getNormal0() {return this.n0;}
    public Normal getNormal1() {return this.n1;}
    public Normal getNormal2() {return this.n2;}
    
    public void setVert0(Vertice v) {
        this.v0 = v;
        this.reset();
    }
    public void setVert1(Vertice v) {
        this.v1 = v;
        this.reset();
    }
    public void setVert2(Vertice v) {
        this.v2 = v;
        this.reset();
    }
    
    public void setTextureCoordinate0(TextureCoordinate v) {
        this.t0 = v;
        this.reset();
    }
    public void setTextureCoordinate1(TextureCoordinate v) {
        this.t1 = v;
        this.reset();
    }
    public void setTextureCoordinate2(TextureCoordinate v) {
        this.t2 = v;
        this.reset();
    }
    
    public void setNormal0(Normal n) {
        this.n0 = n;
        this.reset();
    }
    public void setNormal1(Normal n) {
        this.n1 = n;
        this.reset();
    }
    public void setNormal2(Normal n) {
        this.n2 = n;
        this.reset();
    }
    
    @Override
    public Triangle clone() {
        return new Triangle(this);
    }
    
    private void reset() {
        for(Vertice v : this.getVertices()) {
            this.removeVertice(v);
        }
        for(TextureCoordinate v : this.getTextureCoordinates()) {
            this.removeTextureCoordinate(v);
        }
        for(Normal n : this.getNormals()) {
            this.removeNormal(n);
        }
        
        this.addVertice(v0);
        this.addVertice(v1);
        this.addVertice(v2);
        
        this.addTextureCoordinate(t0);
        this.addTextureCoordinate(t1);
        this.addTextureCoordinate(t2);
        
        this.addNormal(n0);
        this.addNormal(n1);
        this.addNormal(n2);
    }
}
