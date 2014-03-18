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
import com.domsplace.FaultEngine.Model.Vertice;

/**
 *
 * @author Dominic Masters
 */
public class Triangle extends DynamicFace {
    private Vertice vert0;
    private Vertice vert1;
    private Vertice vert2;
    
    private TextureCoordinate t0;
    private TextureCoordinate t1;
    private TextureCoordinate t2;
    
    public Triangle() {
        super();
        //Right Angle Triangle /|
        Vertice bottomLeft = new Vertice();
        Vertice bottomRight = new Vertice();
        Vertice topRight = new Vertice();
        
        bottomLeft.set(-0.5f, -0.5f, 0);
        bottomRight.set(0.5f, -0.5f, 0);
        topRight.set(0.5f, 0.5f, 0);
        
        this.vert0 = bottomLeft;
        this.vert1 = bottomRight;
        this.vert2 = topRight;
        
        TextureCoordinate bottomLeftT = new TextureCoordinate();
        TextureCoordinate bottomRightT = new TextureCoordinate();
        TextureCoordinate topRightT = new TextureCoordinate();
        
        bottomLeftT.set(0.0f, 0.0f);
        bottomRightT.set(1.0f, 0.0f);
        topRightT.set(1.0f, 1.0f);
        
        this.t0 = bottomLeftT;
        this.t1 = bottomRightT;
        this.t2 = topRightT;
        
        this.reset();
    }
    
    public Vertice getVert0() {return this.vert0;}
    public Vertice getVert1() {return this.vert1;}
    public Vertice getVert2() {return this.vert2;}
    
    public TextureCoordinate getTextureCoordinate0() {return this.t0;}
    public TextureCoordinate getTextureCoordinate1() {return this.t1;}
    public TextureCoordinate getTextureCoordinate2() {return this.t2;}
    
    public void setVert0(Vertice v) {
        this.vert0 = v;
        this.reset();
    }
    public void setVert1(Vertice v) {
        this.vert1 = v;
        this.reset();
    }
    public void setVert2(Vertice v) {
        this.vert2 = v;
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
    
    private void reset() {
        for(Vertice v : this.getVertices()) {
            this.removeVertice(v);
        }
        for(TextureCoordinate v : this.getTextureCoordinates()) {
            this.removeTextureCoordinate(v);
        }
        
        this.addVertice(vert0);
        this.addVertice(vert1);
        this.addVertice(vert2);
        
        this.addTextureCoordinate(t0);
        this.addTextureCoordinate(t1);
        this.addTextureCoordinate(t2);
    }
}
