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
import com.domsplace.FaultEngine.Model.Face;
import com.domsplace.FaultEngine.Model.Material.Texture.TextureCoordinate;
import com.domsplace.FaultEngine.Model.Normal;
import com.domsplace.FaultEngine.Model.StaticModel;
import com.domsplace.FaultEngine.Model.Vertice;

/**
 *
 * @author Dominic Masters
 */
public class Torus extends StaticModel {
    private static Torus MESH = null;
    private static Torus getMesh() {
        if(MESH != null) return MESH;
        MESH = new Torus(true);
        MESH.init();
        return MESH;
    }
    
    public Torus() {
        this(getMesh());
    }
    
    private Torus(Torus t) {
        super(t);
    }
    
    private Torus(boolean t) {
        super();
        Face f = null;
        Vertice v = null;
        Normal n = null;
        TextureCoordinate tc = null;

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(1.0,0.0,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        n = new Normal(1.0,5.192734953746896E-16,-1.832729952534458E-16);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.025464906281354E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(1.0,0.0,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.941421389579773,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(1.0,5.192734953746896E-16,-1.832729952534458E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.251354463156586E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(1.0,0.0,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        n = new Normal(1.0,5.192734953746896E-16,-1.832729952534458E-16);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,5.650917309531613E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(1.0,0.0,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.941421389579773,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(1.0,5.192734953746896E-16,-1.832729952534458E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.289274275320589E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.941421389579773,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.251354463156586E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.0,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.941421389579773,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.800000011920929,-0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.251354463156586E-16);
        f.addNormal(n);
        n = new Normal(0.0,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(-4.519399545740238E-17,-1.0,-7.532332300506859E-18);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.941421389579773,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.251354463156586E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,5.650917309531613E-16,-0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.941421389579773,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(1.0,0.0,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.251354463156586E-16);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,5.650917309531613E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(1.0,5.192734953746896E-16,-1.832729952534458E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.800000011920929,-0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        n = new Normal(-4.519399545740238E-17,-1.0,-7.532332300506859E-18);
        f.addNormal(n);
        n = new Normal(0.0,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.800000011920929,-0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.658578634262085,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(-4.519399545740238E-17,-1.0,-7.532332300506859E-18);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.800000011920929,-0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        n = new Normal(-4.519399545740238E-17,-1.0,-7.532332300506859E-18);
        f.addNormal(n);
        n = new Normal(-6.025865840405487E-17,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.800000011920929,-0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.941421389579773,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(-4.519399545740238E-17,-1.0,-7.532332300506859E-18);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.251354463156586E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.658578634262085,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-2.2909125730169704E-16,-0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.658578634262085,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(0.6000000238418579,-2.4492935397342132E-17,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-2.2909125730169704E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-1.0,-2.1381849887398336E-16,-3.0545500311815116E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.658578634262085,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-6.025865840405487E-17,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.658578634262085,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.800000011920929,-0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        n = new Normal(-6.025865840405487E-17,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(-4.519399545740238E-17,-1.0,-7.532332300506859E-18);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6000000238418579,-2.4492935397342132E-17,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        n = new Normal(-1.0,-2.1381849887398336E-16,-3.0545500311815116E-17);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-2.2909125730169704E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6000000238418579,-2.4492935397342132E-17,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.658578634262085,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(-1.0,-2.1381849887398336E-16,-3.0545500311815116E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6000000238418579,-2.4492935397342132E-17,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        n = new Normal(-1.0,-2.1381849887398336E-16,-3.0545500311815116E-17);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-2.9018223807299257E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6000000238418579,-2.4492935397342132E-17,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.658578634262085,-0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(-1.0,-2.1381849887398336E-16,-3.0545500311815116E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.658578634262085,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,1.0,9.792032404249223E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.658578634262085,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.800000011920929,0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,1.0,9.792032404249223E-17);
        f.addNormal(n);
        n = new Normal(9.038799091480476E-17,1.0,3.7661661502534296E-18);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.658578634262085,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-2.9018223807299257E-16,0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.658578634262085,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(0.6000000238418579,-2.4492935397342132E-17,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-2.9018223807299257E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-1.0,-2.1381849887398336E-16,-3.0545500311815116E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.800000011920929,0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        n = new Normal(9.038799091480476E-17,1.0,3.7661661502534296E-18);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,1.0,9.792032404249223E-17);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.800000011920929,0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.941421389579773,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(9.038799091480476E-17,1.0,3.7661661502534296E-18);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.289274275320589E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.800000011920929,0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        n = new Normal(9.038799091480476E-17,1.0,3.7661661502534296E-18);
        f.addNormal(n);
        n = new Normal(9.038799091480476E-17,1.0,-5.649249184021114E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.800000011920929,0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.658578634262085,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(9.038799091480476E-17,1.0,3.7661661502534296E-18);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.516793313740729E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.941421389579773,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.289274275320589E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.025464906281354E-16,0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.941421389579773,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(1.0,0.0,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.289274275320589E-16);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.025464906281354E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(1.0,5.192734953746896E-16,-1.832729952534458E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.941421389579773,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.289274275320589E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(9.038799091480476E-17,1.0,-5.649249184021114E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.941421389579773,0.1414213627576828,-9.627715622543524E-18);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.800000011920929,0.20000000298023224,-9.627715622543524E-18);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.289274275320589E-16);
        f.addNormal(n);
        n = new Normal(9.038799091480476E-17,1.0,-5.649249184021114E-17);
        f.addNormal(n);
        n = new Normal(9.038799091480476E-17,1.0,3.7661661502534296E-18);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        n = new Normal(0.9238795042037964,7.025464906281354E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,8.400012503031096E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        n = new Normal(0.9238795042037964,7.025464906281354E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(0.0,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        n = new Normal(0.0,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        n = new Normal(0.0,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,-2.596367476873448E-16,-0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,-2.596367476873448E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-2.2909125730169704E-16,-0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        n = new Normal(-0.9238795042037964,-2.2909125730169704E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,-2.596367476873448E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        n = new Normal(-0.9238795042037964,-2.2909125730169704E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(1.7324364870192205E-16,1.0,1.8077598182960952E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(1.7324364870192205E-16,1.0,1.8077598182960952E-16);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,1.0,9.792032404249223E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        n = new Normal(1.5064664931885963E-16,1.0,9.792032404249223E-17);
        f.addNormal(n);
        n = new Normal(1.7324364870192205E-16,1.0,1.8077598182960952E-16);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        n = new Normal(1.5064664931885963E-16,1.0,9.792032404249223E-17);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,8.400012503031096E-16,0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,8.400012503031096E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.025464906281354E-16,0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,8.400012503031096E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,7.025464906281354E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,8.400012503031096E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-5.649249184021114E-17,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-5.649249184021114E-17,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        n = new Normal(-3.0129332510749887E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(-5.649249184021114E-17,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        n = new Normal(-3.0129332510749887E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,-0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,-2.596367476873448E-16,-0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,-2.596367476873448E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,-2.596367476873448E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(7.908949122327355E-17,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(7.908949122327355E-17,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        n = new Normal(1.7324364870192205E-16,1.0,1.8077598182960952E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        n = new Normal(1.7324364870192205E-16,1.0,1.8077598182960952E-16);
        f.addNormal(n);
        n = new Normal(7.908949122327355E-17,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        n = new Normal(1.7324364870192205E-16,1.0,1.8077598182960952E-16);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,7.025464906281354E-16,0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,7.025464906281354E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,8.400012503031096E-16,0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(4.4578996598136555E-17,0.0,1.0);
        f.addVertice(v);
        v = new Vertice(4.099208669047796E-17,-0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,7.025464906281354E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.0,5.8036447614598515E-16,1.0);
        f.addNormal(n);
        n = new Normal(0.0,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(4.099208669047796E-17,-0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,7.025464906281354E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.0,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(4.099208669047796E-17,-0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        v = new Vertice(3.2332528072284876E-17,-0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.0,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(3.7661661502534296E-18,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(3.2332528072284876E-17,-0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(3.7661661502534296E-18,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(-5.649249184021114E-17,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(3.2332528072284876E-17,-0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        v = new Vertice(2.3672966145369342E-17,-0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        n = new Normal(-5.649249184021114E-17,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(3.7661661502534296E-18,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(7.583966568703644E-18,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(2.3672966145369342E-17,-0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        n = new Normal(-5.649249184021114E-17,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(7.583966568703644E-18,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(2.3672966145369342E-17,-0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        v = new Vertice(2.0086059546433197E-17,-2.4492935397342132E-17,0.6000000238418579);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(7.583966568703644E-18,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(1.5272750155907558E-17,-4.1236425255514284E-16,-1.0);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(2.0086059546433197E-17,-2.4492935397342132E-17,0.6000000238418579);
        f.addVertice(v);
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(1.5272750155907558E-17,-4.1236425255514284E-16,-1.0);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,-0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(2.0086059546433197E-17,-2.4492935397342132E-17,0.6000000238418579);
        f.addVertice(v);
        v = new Vertice(2.3672966145369342E-17,0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(1.5272750155907558E-17,-4.1236425255514284E-16,-1.0);
        f.addNormal(n);
        n = new Normal(1.8959916008168804E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(2.3672966145369342E-17,0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(1.8959916008168804E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(2.3672966145369342E-17,0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        v = new Vertice(3.2332528072284876E-17,0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(1.8959916008168804E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(3.7661661502534296E-18,1.0,1.5064664931885963E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(3.2332528072284876E-17,0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(3.7661661502534296E-18,1.0,1.5064664931885963E-16);
        f.addNormal(n);
        n = new Normal(7.908949122327355E-17,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(3.2332528072284876E-17,0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        v = new Vertice(4.099208669047796E-17,0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        n = new Normal(7.908949122327355E-17,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        n = new Normal(3.7661661502534296E-18,1.0,1.5064664931885963E-16);
        f.addNormal(n);
        n = new Normal(0.0,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(4.099208669047796E-17,0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        n = new Normal(7.908949122327355E-17,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        n = new Normal(0.0,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(4.099208669047796E-17,0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        v = new Vertice(4.4578996598136555E-17,0.0,1.0);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.0,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.0,5.8036447614598515E-16,1.0);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(4.4578996598136555E-17,0.0,1.0);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.0,5.8036447614598515E-16,1.0);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,7.025464906281354E-16,0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(4.4578996598136555E-17,0.0,1.0);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        n = new Normal(0.0,5.8036447614598515E-16,1.0);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,6.567282550496638E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(4.4578996598136555E-17,0.0,1.0);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(4.099208669047796E-17,-0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        n = new Normal(0.0,5.8036447614598515E-16,1.0);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.0,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(4.099208669047796E-17,-0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        n = new Normal(0.0,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(4.519399545740238E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(4.099208669047796E-17,-0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(3.2332528072284876E-17,-0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        n = new Normal(0.0,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(4.519399545740238E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(3.7661661502534296E-18,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(3.2332528072284876E-17,-0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        n = new Normal(3.7661661502534296E-18,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(4.519399545740238E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(3.2332528072284876E-17,-0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(2.3672966145369342E-17,-0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        n = new Normal(3.7661661502534296E-18,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(7.583966568703644E-18,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(2.3672966145369342E-17,-0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        n = new Normal(7.583966568703644E-18,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,-4.581825146033941E-16,-0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(2.3672966145369342E-17,-0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(2.0086059546433197E-17,-2.4492935397342132E-17,0.6000000238418579);
        f.addVertice(v);
        n = new Normal(7.583966568703644E-18,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,-4.581825146033941E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(1.5272750155907558E-17,-4.1236425255514284E-16,-1.0);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(2.0086059546433197E-17,-2.4492935397342132E-17,0.6000000238418579);
        f.addVertice(v);
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        n = new Normal(1.5272750155907558E-17,-4.1236425255514284E-16,-1.0);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,-4.581825146033941E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(2.0086059546433197E-17,-2.4492935397342132E-17,0.6000000238418579);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(2.3672966145369342E-17,0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        n = new Normal(1.5272750155907558E-17,-4.1236425255514284E-16,-1.0);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(1.8959916008168804E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(2.3672966145369342E-17,0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        n = new Normal(1.8959916008168804E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-1.054526571701797E-16,1.0,2.109053143403594E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(2.3672966145369342E-17,0.1414213627576828,0.658578634262085);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(3.2332528072284876E-17,0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        n = new Normal(1.8959916008168804E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-1.054526571701797E-16,1.0,2.109053143403594E-16);
        f.addNormal(n);
        n = new Normal(3.7661661502534296E-18,1.0,1.5064664931885963E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(3.2332528072284876E-17,0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        n = new Normal(3.7661661502534296E-18,1.0,1.5064664931885963E-16);
        f.addNormal(n);
        n = new Normal(-1.054526571701797E-16,1.0,2.109053143403594E-16);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(3.2332528072284876E-17,0.20000000298023224,0.800000011920929);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(4.099208669047796E-17,0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        n = new Normal(3.7661661502534296E-18,1.0,1.5064664931885963E-16);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.0,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(4.099208669047796E-17,0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.0,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,6.567282550496638E-16,0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(4.099208669047796E-17,0.1414213627576828,0.941421389579773);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(4.4578996598136555E-17,0.0,1.0);
        f.addVertice(v);
        n = new Normal(0.0,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,6.567282550496638E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.0,5.8036447614598515E-16,1.0);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,6.567282550496638E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,6.567282550496638E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(6.025865840405487E-17,-1.0,-5.272632858508985E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(6.025865840405487E-17,-1.0,-5.272632858508985E-17);
        f.addNormal(n);
        n = new Normal(4.519399545740238E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        n = new Normal(4.519399545740238E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(6.025865840405487E-17,-1.0,-5.272632858508985E-17);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        n = new Normal(4.519399545740238E-17,-1.0,-4.519399545740238E-17);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-4.73455259796218E-16,-0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-4.73455259796218E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,-4.581825146033941E-16,-0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,-4.581825146033941E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-4.73455259796218E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,-4.581825146033941E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-1.6571131557423458E-16,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.25202715396881104,0.1414213627576828,0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-1.6571131557423458E-16,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        n = new Normal(-1.054526571701797E-16,1.0,2.109053143403594E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        n = new Normal(-1.054526571701797E-16,1.0,2.109053143403594E-16);
        f.addNormal(n);
        n = new Normal(-1.6571131557423458E-16,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3061467409133911,0.20000000298023224,0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        n = new Normal(-1.054526571701797E-16,1.0,2.109053143403594E-16);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3602663576602936,0.1414213627576828,0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,0.0,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,6.567282550496638E-16,0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,5.650917309531613E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,-1.0,-7.908949122327355E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,-1.0,-7.908949122327355E-17);
        f.addNormal(n);
        n = new Normal(6.025865840405487E-17,-1.0,-5.272632858508985E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        n = new Normal(6.025865840405487E-17,-1.0,-5.272632858508985E-17);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,-1.0,-7.908949122327355E-17);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        n = new Normal(6.025865840405487E-17,-1.0,-5.272632858508985E-17);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,-4.429097429407906E-16,-0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,-4.429097429407906E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-4.73455259796218E-16,-0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,-4.73455259796218E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,-4.429097429407906E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,-4.73455259796218E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-6.025865840405487E-17,1.0,4.1427828893558644E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4656854271888733,0.1414213627576828,0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-6.025865840405487E-17,1.0,4.1427828893558644E-17);
        f.addNormal(n);
        n = new Normal(-1.6571131557423458E-16,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        n = new Normal(-1.6571131557423458E-16,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        n = new Normal(-6.025865840405487E-17,1.0,4.1427828893558644E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5656853914260864,0.20000000298023224,0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        n = new Normal(-1.6571131557423458E-16,1.0,1.9584064808498446E-16);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,5.650917309531613E-16,0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6656854152679443,0.1414213627576828,0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.0,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,5.650917309531613E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-1.0,0.0,1.1283696467288959E-16);
        f.addVertice(v);
        v = new Vertice(-0.941421389579773,-0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        n = new Normal(-0.9238795042037964,5.650917309531613E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-1.0,3.360005001212438E-16,6.109100062363023E-17);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,3.791983284351822E-18);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.941421389579773,-0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        n = new Normal(-0.9238795042037964,5.650917309531613E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,3.791983284351822E-18);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.941421389579773,-0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        v = new Vertice(-0.800000011920929,-0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,3.791983284351822E-18);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.800000011920929,-0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,-1.0,-7.908949122327355E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.800000011920929,-0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        v = new Vertice(-0.658578634262085,-0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        n = new Normal(1.5064664931885963E-16,-1.0,-7.908949122327355E-17);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.5167932806535043E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.658578634262085,-0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        n = new Normal(1.5064664931885963E-16,-1.0,-7.908949122327355E-17);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.5167932806535043E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.658578634262085,-0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        v = new Vertice(-0.6000000238418579,-2.4492935397342132E-17,6.385109056948287E-17);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.5167932806535043E-16);
        f.addNormal(n);
        n = new Normal(1.0,-3.8181876216949507E-16,-2.1381849887398336E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.6000000238418579,-2.4492935397342132E-17,6.385109056948287E-17);
        f.addVertice(v);
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(1.0,-3.8181876216949507E-16,-2.1381849887398336E-16);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,-4.429097429407906E-16,-0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(-0.6000000238418579,-2.4492935397342132E-17,6.385109056948287E-17);
        f.addVertice(v);
        v = new Vertice(-0.658578634262085,0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        n = new Normal(0.9238795042037964,-4.429097429407906E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(1.0,-3.8181876216949507E-16,-2.1381849887398336E-16);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.4409536563254985E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(-0.658578634262085,0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        n = new Normal(0.9238795042037964,-4.429097429407906E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.4409536563254985E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.658578634262085,0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        v = new Vertice(-0.800000011920929,0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.4409536563254985E-16);
        f.addNormal(n);
        n = new Normal(4.519399545740238E-17,1.0,1.5064664601013718E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6084473133087158,0.1414213627576828,0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.800000011920929,0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(4.519399545740238E-17,1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(-6.025865840405487E-17,1.0,4.1427828893558644E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.800000011920929,0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        v = new Vertice(-0.941421389579773,0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        n = new Normal(-6.025865840405487E-17,1.0,4.1427828893558644E-17);
        f.addNormal(n);
        n = new Normal(4.519399545740238E-17,1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.0617552699876734E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7391036152839661,0.20000000298023224,0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.941421389579773,0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        n = new Normal(-6.025865840405487E-17,1.0,4.1427828893558644E-17);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.0617552699876734E-16);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.941421389579773,0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        v = new Vertice(-1.0,0.0,1.1283696467288959E-16);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.0617552699876734E-16);
        f.addNormal(n);
        n = new Normal(-1.0,3.360005001212438E-16,6.109100062363023E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.8697599172592163,0.1414213627576828,0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-1.0,0.0,1.1283696467288959E-16);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.0,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-1.0,3.360005001212438E-16,6.109100062363023E-17);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,5.650917309531613E-16,0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.0,0.0,1.1283696467288959E-16);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        n = new Normal(-1.0,3.360005001212438E-16,6.109100062363023E-17);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,3.2072775492841994E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.0,0.0,1.1283696467288959E-16);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.941421389579773,-0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        n = new Normal(-1.0,3.360005001212438E-16,6.109100062363023E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,3.791983284351822E-18);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.941421389579773,-0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,3.791983284351822E-18);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(1.5064664601013718E-17,-1.0,0.0);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.941421389579773,-0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.800000011920929,-0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,-0.7091128826141357,3.791983284351822E-18);
        f.addNormal(n);
        n = new Normal(1.5064664601013718E-17,-1.0,0.0);
        f.addNormal(n);
        n = new Normal(1.5064664931885963E-16,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.800000011920929,-0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        n = new Normal(1.5064664931885963E-16,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(1.5064664601013718E-17,-1.0,0.0);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.800000011920929,-0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.658578634262085,-0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        n = new Normal(1.5064664931885963E-16,-1.0,-3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.5167932806535043E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.658578634262085,-0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.5167932806535043E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,-3.512732453140677E-16,0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.658578634262085,-0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(-0.6000000238418579,-2.4492935397342132E-17,6.385109056948287E-17);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,-0.7091128826141357,-1.5167932806535043E-16);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,-3.512732453140677E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(1.0,-3.8181876216949507E-16,-2.1381849887398336E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6000000238418579,-2.4492935397342132E-17,6.385109056948287E-17);
        f.addVertice(v);
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        n = new Normal(1.0,-3.8181876216949507E-16,-2.1381849887398336E-16);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,-3.512732453140677E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6000000238418579,-2.4492935397342132E-17,6.385109056948287E-17);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.658578634262085,0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        n = new Normal(1.0,-3.8181876216949507E-16,-2.1381849887398336E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.4409536563254985E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.658578634262085,0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.4409536563254985E-16);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,1.0,-6.779099153174234E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.658578634262085,0.1414213627576828,7.102491038480006E-17);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.800000011920929,0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        n = new Normal(0.7050949931144714,0.7091128826141357,-1.4409536563254985E-16);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,1.0,-6.779099153174234E-17);
        f.addNormal(n);
        n = new Normal(4.519399545740238E-17,1.0,1.5064664601013718E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.800000011920929,0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        n = new Normal(4.519399545740238E-17,1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,1.0,-6.779099153174234E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.800000011920929,0.20000000298023224,8.834402762118623E-17);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.941421389579773,0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        n = new Normal(4.519399545740238E-17,1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.0617552699876734E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.941421389579773,0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.0617552699876734E-16);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,3.2072775492841994E-16,-0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.941421389579773,0.1414213627576828,1.056631514750173E-16);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-1.0,0.0,1.1283696467288959E-16);
        f.addVertice(v);
        n = new Normal(-0.7050949931144714,0.7091128826141357,1.0617552699876734E-16);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,3.2072775492841994E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-1.0,3.360005001212438E-16,6.109100062363023E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        n = new Normal(-0.9238795042037964,3.2072775492841994E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        n = new Normal(-0.9238795042037964,3.2072775492841994E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-7.532332300506859E-18,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-7.532332300506859E-18,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(1.5064664601013718E-17,-1.0,0.0);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        n = new Normal(1.5064664601013718E-17,-1.0,0.0);
        f.addNormal(n);
        n = new Normal(-7.532332300506859E-18,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        n = new Normal(1.5064664601013718E-17,-1.0,0.0);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-3.665459905068916E-16,0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-3.665459905068916E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,-3.512732453140677E-16,0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        n = new Normal(0.9238795042037964,-3.512732453140677E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-3.665459905068916E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        n = new Normal(0.9238795042037964,-3.512732453140677E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-1.355819962983745E-16,1.0,-1.6571131557423458E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        n = new Normal(0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-1.355819962983745E-16,1.0,-1.6571131557423458E-16);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,1.0,-6.779099153174234E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        n = new Normal(-3.0129332510749887E-17,1.0,-6.779099153174234E-17);
        f.addNormal(n);
        n = new Normal(-1.355819962983745E-16,1.0,-1.6571131557423458E-16);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        n = new Normal(-3.0129332510749887E-17,1.0,-6.779099153174234E-17);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,-0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,3.2072775492841994E-16,-0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,6.720010002424876E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(4.8960162021246116E-17,-1.0,9.038799091480476E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(4.8960162021246116E-17,-1.0,9.038799091480476E-17);
        f.addNormal(n);
        n = new Normal(-7.532332300506859E-18,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        n = new Normal(-7.532332300506859E-18,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(4.8960162021246116E-17,-1.0,9.038799091480476E-17);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        n = new Normal(-7.532332300506859E-18,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,-3.8181876216949507E-16,0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,-3.8181876216949507E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-3.665459905068916E-16,0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,-3.665459905068916E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,-3.8181876216949507E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,-3.665459905068916E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-8.285565778711729E-17,1.0,-1.054526571701797E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-8.285565778711729E-17,1.0,-1.054526571701797E-16);
        f.addNormal(n);
        n = new Normal(-1.355819962983745E-16,1.0,-1.6571131557423458E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        n = new Normal(-1.355819962983745E-16,1.0,-1.6571131557423458E-16);
        f.addNormal(n);
        n = new Normal(-8.285565778711729E-17,1.0,-1.054526571701797E-16);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        n = new Normal(-1.355819962983745E-16,1.0,-1.6571131557423458E-16);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,6.720010002424876E-16,-0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,6.720010002424876E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,6.720010002424876E-16,-0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-2.0035037061017457E-16,0.0,-1.0);
        f.addVertice(v);
        v = new Vertice(-1.8958963757847633E-16,-0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,6.720010002424876E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-6.872737322004217E-17,4.73455259796218E-16,-1.0);
        f.addNormal(n);
        n = new Normal(-5.308776349938367E-17,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-1.8958963757847633E-16,-0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,6.720010002424876E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-5.308776349938367E-17,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-1.8958963757847633E-16,-0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        v = new Vertice(-1.6361096503261953E-16,-0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-5.308776349938367E-17,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(1.883083281921868E-17,-1.0,3.0129332510749887E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-1.6361096503261953E-16,-0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(1.883083281921868E-17,-1.0,3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(4.8960162021246116E-17,-1.0,9.038799091480476E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-1.6361096503261953E-16,-0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        v = new Vertice(-1.3763227925187293E-16,-0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        n = new Normal(4.8960162021246116E-17,-1.0,9.038799091480476E-17);
        f.addNormal(n);
        n = new Normal(1.883083281921868E-17,-1.0,3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(8.34236330829207E-17,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-1.3763227925187293E-16,-0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        n = new Normal(4.8960162021246116E-17,-1.0,9.038799091480476E-17);
        f.addNormal(n);
        n = new Normal(8.34236330829207E-17,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-1.3763227925187293E-16,-0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        v = new Vertice(-1.268715594550645E-16,-2.4492935397342132E-17,-0.6000000238418579);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(8.34236330829207E-17,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(1.0690924943699168E-16,-3.8181876216949507E-16,1.0);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-1.268715594550645E-16,-2.4492935397342132E-17,-0.6000000238418579);
        f.addVertice(v);
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(1.0690924943699168E-16,-3.8181876216949507E-16,1.0);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,-3.8181876216949507E-16,0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(-1.268715594550645E-16,-2.4492935397342132E-17,-0.6000000238418579);
        f.addVertice(v);
        v = new Vertice(-1.3763227925187293E-16,0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,-3.8181876216949507E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(1.0690924943699168E-16,-3.8181876216949507E-16,1.0);
        f.addNormal(n);
        n = new Normal(7.204768281627493E-17,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(-1.3763227925187293E-16,0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        v = new Vertice(-0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,-3.8181876216949507E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(7.204768281627493E-17,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-1.3763227925187293E-16,0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        v = new Vertice(-1.6361096503261953E-16,0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(7.204768281627493E-17,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(1.883083281921868E-17,1.0,-1.2051731680810975E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-1.6361096503261953E-16,0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        v = new Vertice(-0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(1.883083281921868E-17,1.0,-1.2051731680810975E-16);
        f.addNormal(n);
        n = new Normal(-8.285565778711729E-17,1.0,-1.054526571701797E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-1.6361096503261953E-16,0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        v = new Vertice(-1.8958963757847633E-16,0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        n = new Normal(-8.285565778711729E-17,1.0,-1.054526571701797E-16);
        f.addNormal(n);
        n = new Normal(1.883083281921868E-17,1.0,-1.2051731680810975E-16);
        f.addNormal(n);
        n = new Normal(-3.033586627481458E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-1.8958963757847633E-16,0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        v = new Vertice(-0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        n = new Normal(-8.285565778711729E-17,1.0,-1.054526571701797E-16);
        f.addNormal(n);
        n = new Normal(-3.033586627481458E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-1.8958963757847633E-16,0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        v = new Vertice(-2.0035037061017457E-16,0.0,-1.0);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-3.033586627481458E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-6.872737322004217E-17,4.73455259796218E-16,-1.0);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-2.0035037061017457E-16,0.0,-1.0);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-6.872737322004217E-17,4.73455259796218E-16,-1.0);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,6.720010002424876E-16,-0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-2.0035037061017457E-16,0.0,-1.0);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        n = new Normal(-6.872737322004217E-17,4.73455259796218E-16,-1.0);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,5.345462405675135E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-2.0035037061017457E-16,0.0,-1.0);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-1.8958963757847633E-16,-0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        n = new Normal(-6.872737322004217E-17,4.73455259796218E-16,-1.0);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-5.308776349938367E-17,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.8958963757847633E-16,-0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        n = new Normal(-5.308776349938367E-17,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-2.259699772870119E-17,-1.0,-1.5064664601013718E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.8958963757847633E-16,-0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-1.6361096503261953E-16,-0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        n = new Normal(-5.308776349938367E-17,-0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-2.259699772870119E-17,-1.0,-1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(1.883083281921868E-17,-1.0,3.0129332510749887E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.6361096503261953E-16,-0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        n = new Normal(1.883083281921868E-17,-1.0,3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(-2.259699772870119E-17,-1.0,-1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.6361096503261953E-16,-0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-1.3763227925187293E-16,-0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        n = new Normal(1.883083281921868E-17,-1.0,3.0129332510749887E-17);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(8.34236330829207E-17,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.3763227925187293E-16,-0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        n = new Normal(8.34236330829207E-17,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.3763227925187293E-16,-0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(-1.268715594550645E-16,-2.4492935397342132E-17,-0.6000000238418579);
        f.addVertice(v);
        n = new Normal(8.34236330829207E-17,-0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(1.0690924943699168E-16,-3.8181876216949507E-16,1.0);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.268715594550645E-16,-2.4492935397342132E-17,-0.6000000238418579);
        f.addVertice(v);
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        n = new Normal(1.0690924943699168E-16,-3.8181876216949507E-16,1.0);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.268715594550645E-16,-2.4492935397342132E-17,-0.6000000238418579);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(-1.3763227925187293E-16,0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        n = new Normal(1.0690924943699168E-16,-3.8181876216949507E-16,1.0);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(7.204768281627493E-17,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.3763227925187293E-16,0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        n = new Normal(7.204768281627493E-17,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(6.779099153174234E-17,1.0,-1.355819962983745E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.3763227925187293E-16,0.1414213627576828,-0.658578634262085);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(-1.6361096503261953E-16,0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        n = new Normal(7.204768281627493E-17,0.7091128826141357,0.7050949931144714);
        f.addNormal(n);
        n = new Normal(6.779099153174234E-17,1.0,-1.355819962983745E-16);
        f.addNormal(n);
        n = new Normal(1.883083281921868E-17,1.0,-1.2051731680810975E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.6361096503261953E-16,0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        n = new Normal(1.883083281921868E-17,1.0,-1.2051731680810975E-16);
        f.addNormal(n);
        n = new Normal(6.779099153174234E-17,1.0,-1.355819962983745E-16);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.6361096503261953E-16,0.20000000298023224,-0.800000011920929);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(-1.8958963757847633E-16,0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        n = new Normal(1.883083281921868E-17,1.0,-1.2051731680810975E-16);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-3.033586627481458E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.8958963757847633E-16,0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-3.033586627481458E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,5.345462405675135E-16,-0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-1.8958963757847633E-16,0.1414213627576828,-0.941421389579773);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-2.0035037061017457E-16,0.0,-1.0);
        f.addVertice(v);
        n = new Normal(-3.033586627481458E-17,0.7091128826141357,-0.7050949931144714);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,5.345462405675135E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-6.872737322004217E-17,4.73455259796218E-16,-1.0);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,5.345462405675135E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,6.26182764664016E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,5.345462405675135E-16,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,-1.0,3.766166232971491E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3602663576602936,-0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,-0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,-1.0,3.766166232971491E-17);
        f.addNormal(n);
        n = new Normal(-2.259699772870119E-17,-1.0,-1.5064664601013718E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        n = new Normal(-2.259699772870119E-17,-1.0,-1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,-1.0,3.766166232971491E-17);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3061467409133911,-0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        n = new Normal(-2.259699772870119E-17,-1.0,-1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,-3.0545500973559606E-16,0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.25202715396881104,-0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,-0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,-3.0545500973559606E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,-3.0545500973559606E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.22961005568504333,-2.4492935397342132E-17,-0.5543277263641357);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,-3.2072775492841994E-16,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(7.532332465942982E-17,1.0,-7.532332465942982E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.25202715396881104,0.1414213627576828,-0.6084473133087158);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        n = new Normal(-0.2698281705379486,0.7091128826141357,0.6514227986335754);
        f.addNormal(n);
        n = new Normal(7.532332465942982E-17,1.0,-7.532332465942982E-17);
        f.addNormal(n);
        n = new Normal(6.779099153174234E-17,1.0,-1.355819962983745E-16);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        n = new Normal(6.779099153174234E-17,1.0,-1.355819962983745E-16);
        f.addNormal(n);
        n = new Normal(7.532332465942982E-17,1.0,-7.532332465942982E-17);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3061467409133911,0.20000000298023224,-0.7391036152839661);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        n = new Normal(6.779099153174234E-17,1.0,-1.355819962983745E-16);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,6.26182764664016E-16,-0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3602663576602936,0.1414213627576828,-0.8697599172592163);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,0.0,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.2698281705379486,0.7091128826141357,-0.6514227986335754);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,6.26182764664016E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,5.345462405675135E-16,-0.9238795042037964);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,6.26182764664016E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,5.650917309531613E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,6.26182764664016E-16,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,-0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,-0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-6.025865840405487E-17,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6656854152679443,-0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,-0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-6.025865840405487E-17,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(-3.0129332510749887E-17,-1.0,3.766166232971491E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,-0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        n = new Normal(-3.0129332510749887E-17,-1.0,3.766166232971491E-17);
        f.addNormal(n);
        n = new Normal(-6.025865840405487E-17,-1.0,1.5064664601013718E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.5656853914260864,-0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        n = new Normal(-3.0129332510749887E-17,-1.0,3.766166232971491E-17);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,-0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,-0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-2.9018223807299257E-16,0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4656854271888733,-0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,-0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-2.9018223807299257E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,-3.0545500973559606E-16,0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(0.5543277263641357,-2.4492935397342132E-17,-0.22961005568504333);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,-3.0545500973559606E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-2.9018223807299257E-16,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4242640733718872,-2.4492935397342132E-17,-0.4242640733718872);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,-3.0545500973559606E-16,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.6084473133087158,0.1414213627576828,-0.25202715396881104);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(-0.6514227986335754,0.7091128826141357,0.2698281705379486);
        f.addNormal(n);
        n = new Normal(9.038799091480476E-17,1.0,-5.649249184021114E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.4656854271888733,0.1414213627576828,-0.4656854271888733);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        n = new Normal(-0.49857744574546814,0.7091128826141357,0.49857744574546814);
        f.addNormal(n);
        n = new Normal(9.038799091480476E-17,1.0,-5.649249184021114E-17);
        f.addNormal(n);
        n = new Normal(7.532332465942982E-17,1.0,-7.532332465942982E-17);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.7391036152839661,0.20000000298023224,-0.3061467409133911);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        n = new Normal(7.532332465942982E-17,1.0,-7.532332465942982E-17);
        f.addNormal(n);
        n = new Normal(9.038799091480476E-17,1.0,-5.649249184021114E-17);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.5656853914260864,0.20000000298023224,-0.5656853914260864);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        n = new Normal(7.532332465942982E-17,1.0,-7.532332465942982E-17);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.8697599172592163,0.1414213627576828,-0.3602663576602936);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.6514227986335754,0.7091128826141357,-0.2698281705379486);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,5.650917309531613E-16,-0.3826834261417389);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.6656854152679443,0.1414213627576828,-0.6656854152679443);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.0,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.0,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.49857744574546814,0.7091128826141357,-0.49857744574546814);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,5.650917309531613E-16,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,6.26182764664016E-16,-0.7071067690849304);
        f.addNormal(n);
        tc = new TextureCoordinate(0.0,0.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(1.0,1.0);
        f.addTextureCoordinate(tc);
        tc = new TextureCoordinate(0.0,1.0);
        f.addTextureCoordinate(tc);

        this.addFace(f);
    }
}
