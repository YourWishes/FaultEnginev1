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

import com.domsplace.FaultEngine.Model.Face;
import com.domsplace.FaultEngine.Model.Material.Texture.TextureCoordinate;
import com.domsplace.FaultEngine.Model.Normal;
import com.domsplace.FaultEngine.Model.StaticModel;
import com.domsplace.FaultEngine.Model.Vertice;

/**
 *
 * @author Dominic Masters
 */
public class Quad extends StaticModel {
    private static Quad QUAD_MESH = null;
    private static Quad getMesh() {
        if(QUAD_MESH != null) return QUAD_MESH;
        QUAD_MESH = new Quad(true);
        QUAD_MESH.init();
        return QUAD_MESH;
    }
    public static Triangle[] createQuad() {
        Quad q = new Quad();
        return q.toQuadArray();
    }
    
    //Instance
    private Triangle bottomLeft;
    private Triangle topRight;
    private Triangle[] quadArray = null;
    
    public Quad() {
        this(getMesh());
    }
    
    private Quad(boolean t) {
        super();
        bottomLeft = new Triangle();
        this.addFace(bottomLeft);
        
        topRight = new Triangle();
        this.addFace(topRight);
        
        topRight.setVert0(bottomLeft.getVert0());
        topRight.setVert1(bottomLeft.getVert2());
        topRight.getVert2().set(-0.5f, 0.5f, 0.0f);
        
        topRight.setTextureCoordinate0(bottomLeft.getTextureCoordinate0());
        topRight.setTextureCoordinate1(bottomLeft.getTextureCoordinate2());
        topRight.getTextureCoordinate2().set(0.0f, 1.0f);
        
        topRight.setNormal0(bottomLeft.getNormal0());
        topRight.setNormal1(bottomLeft.getNormal2());
        topRight.getNormal2().set(-0.5773502588272095,0.5773502588272095,0.5773502588272095);
        
        this.setMaterial(this.getMaterial().clone());
    }
    
    private Quad(Quad m) {
        super(m);
        for(Face f : this.getFaces()) {
            this.removeFace(f);
        }
        
        this.bottomLeft = m.bottomLeft.clone();
        this.addFace(bottomLeft);
        
        this.topRight = m.topRight.clone();
        this.addFace(topRight);
        
        topRight.setVert0(bottomLeft.getVert0());
        topRight.setVert1(bottomLeft.getVert2());
        topRight.getVert2().set(-0.5f, 0.5f, 0.0f);
        
        topRight.setTextureCoordinate0(bottomLeft.getTextureCoordinate0());
        topRight.setTextureCoordinate1(bottomLeft.getTextureCoordinate2());
        topRight.getTextureCoordinate2().set(0.0f, 1.0f);
        
        this.setMaterial(m.getMaterial().clone());
    }
    
    public Triangle getBottomLeft() {return this.bottomLeft;}
    public Triangle getTopRight() {return this.topRight;}
    
    public Vertice getVert0() {return bottomLeft.getVert0();}
    public Vertice getVert1() {return bottomLeft.getVert1();}
    public Vertice getVert2() {return bottomLeft.getVert2();}
    public Vertice getVert3() {return topRight.getVert2();}
    
    public void setVert0(Vertice v) {bottomLeft.setVert0(v);topRight.setVert0(v);}
    public void setVert1(Vertice v) {bottomLeft.setVert1(v);}
    public void setVert2(Vertice v) {bottomLeft.setVert2(v);topRight.setVert1(v);}
    public void setVert3(Vertice v) {topRight.setVert2(v);}
    
    public void setTextureCoordinate0(TextureCoordinate tc) {bottomLeft.setTextureCoordinate0(tc);topRight.setTextureCoordinate0(tc);}
    public void setTextureCoordinate1(TextureCoordinate tc) {bottomLeft.setTextureCoordinate1(tc);}
    public void setTextureCoordinate2(TextureCoordinate tc) {bottomLeft.setTextureCoordinate2(tc);topRight.setTextureCoordinate1(tc);}
    public void setTextureCoordinate3(TextureCoordinate tc) {topRight.setTextureCoordinate2(tc);}
    
    public void setNormal0(Normal n) {bottomLeft.setNormal0(n);topRight.setNormal0(n);}
    public void setNormal1(Normal n) {bottomLeft.setNormal1(n);}
    public void setNormal2(Normal n) {bottomLeft.setNormal2(n);topRight.setNormal1(n);}
    public void setNormal3(Normal n) {topRight.setNormal2(n);}
    
    public Triangle[] toQuadArray() {
        if(this.quadArray != null) return this.quadArray;
        return this.quadArray = new Triangle[] {
            bottomLeft,
            topRight
        };
    }
    
    @Override
    public Quad clone() {
        return new Quad(this);
    }
}
