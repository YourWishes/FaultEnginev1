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
public class Sphere extends StaticModel {
    private static Sphere MESH = null;
    private static Sphere getMesh() {
        if(MESH != null) return MESH;
        MESH = new Sphere(true);
        //For some reason I gotta wait..
        MESH.init();
        return MESH;
    }
    
    public Sphere() {
        this(getMesh());
    }
    
    private Sphere(boolean t) {
        super();
        
        this.setScale(0.5);
        
        Face f = null;
        Vertice v = null;
        Normal n = null;
        TextureCoordinate tc = null;

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3826834261417389,0.9238795042037964,0.0);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.7071067690849304,0.0);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.382194846868515,0.9240817427635193,-9.938573074591157E-17);
        f.addNormal(n);
        n = new Normal(0.7065845131874084,0.7076286673545837,-5.715458705483328E-17);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,0.7076286673545837,-0.27039816975593567);
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
        v = new Vertice(0.3826834261417389,0.9238795042037964,0.0);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        n = new Normal(0.382194846868515,0.9240817427635193,-9.938573074591157E-17);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,0.9240817427635193,-0.1462596356868744);
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
        v = new Vertice(0.3826834261417389,0.9238795042037964,0.0);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        n = new Normal(0.382194846868515,0.9240817427635193,-9.938573074591157E-17);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,0.9240817427635193,0.1462596356868744);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3535533845424652,0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.7071067690849304,0.0);
        f.addVertice(v);
        n = new Normal(0.3531019985675812,0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.7065845131874084,0.7076286673545837,-5.715458705483328E-17);
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
        v = new Vertice(0.3535533845424652,0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.7071067690849304,0.0);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,0.9238795042037964,0.0);
        f.addVertice(v);
        n = new Normal(0.3531019985675812,0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(0.7065845131874084,0.7076286673545837,-5.715458705483328E-17);
        f.addNormal(n);
        n = new Normal(0.382194846868515,0.9240817427635193,-9.938573074591157E-17);
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
        v = new Vertice(0.3535533845424652,0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.3531019985675812,0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,0.9240817427635193,0.2702525556087494);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.27059805393218994,0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.2702525556087494,0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,0.7076286673545837,0.27039816975593567);
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
        v = new Vertice(0.27059805393218994,0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        n = new Normal(0.2702525556087494,0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,0.9240817427635193,0.1462596356868744);
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
        v = new Vertice(0.27059805393218994,0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.2702525556087494,0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,0.9240817427635193,0.3531019985675812);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.1464466154575348,0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        n = new Normal(0.1462596356868744,0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,0.7076286673545837,0.4996306896209717);
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
        v = new Vertice(0.1464466154575348,0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.1462596356868744,0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,0.9240817427635193,0.2702525556087494);
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
        v = new Vertice(0.1464466154575348,0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(2.3432602348612458E-17,0.9238795042037964,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.1462596356868744,0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(0.0,0.9240817427635193,0.382194846868515);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(2.3432602348612458E-17,0.9238795042037964,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(4.329780301713277E-17,0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.0,0.9240817427635193,0.382194846868515);
        f.addNormal(n);
        n = new Normal(7.14432338185416E-18,0.7076286673545837,0.7065845131874084);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,0.7076286673545837,0.6527989506721497);
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
        v = new Vertice(2.3432602348612458E-17,0.9238795042037964,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.0,0.9240817427635193,0.382194846868515);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,0.9240817427635193,0.3531019985675812);
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
        v = new Vertice(2.3432602348612458E-17,0.9238795042037964,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.0,0.9240817427635193,0.382194846868515);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,0.9240817427635193,0.3531019985675812);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.1464466154575348,0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(4.329780301713277E-17,0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.1462596356868744,0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(7.14432338185416E-18,0.7076286673545837,0.7065845131874084);
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
        v = new Vertice(-0.1464466154575348,0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(4.329780301713277E-17,0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(2.3432602348612458E-17,0.9238795042037964,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.1462596356868744,0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(7.14432338185416E-18,0.7076286673545837,0.7065845131874084);
        f.addNormal(n);
        n = new Normal(0.0,0.9240817427635193,0.382194846868515);
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
        v = new Vertice(-0.1464466154575348,0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.1462596356868744,0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,0.9240817427635193,0.2702525556087494);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.27059805393218994,0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.2702525556087494,0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,0.7076286673545837,0.6527989506721497);
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
        v = new Vertice(-0.27059805393218994,0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.2702525556087494,0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,0.9240817427635193,0.3531019985675812);
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
        v = new Vertice(-0.27059805393218994,0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        n = new Normal(-0.2702525556087494,0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,0.9240817427635193,0.1462596356868744);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3535533845424652,0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        n = new Normal(-0.3531019985675812,0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,0.7076286673545837,0.4996306896209717);
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
        v = new Vertice(-0.3535533845424652,0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(-0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.3531019985675812,0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,0.9240817427635193,0.2702525556087494);
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
        v = new Vertice(-0.3535533845424652,0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,0.9238795042037964,4.6865204697224915E-17);
        f.addVertice(v);
        n = new Normal(-0.3531019985675812,0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(-0.382194846868515,0.9240817427635193,4.2593885550739946E-17);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3826834261417389,0.9238795042037964,4.6865204697224915E-17);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.382194846868515,0.9240817427635193,4.2593885550739946E-17);
        f.addNormal(n);
        n = new Normal(-0.7065845131874084,0.7076286673545837,1.2145349997306256E-16);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,0.7076286673545837,0.27039816975593567);
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
        v = new Vertice(-0.3826834261417389,0.9238795042037964,4.6865204697224915E-17);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        n = new Normal(-0.382194846868515,0.9240817427635193,4.2593885550739946E-17);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,0.9240817427635193,0.1462596356868744);
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
        v = new Vertice(-0.3826834261417389,0.9238795042037964,4.6865204697224915E-17);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        n = new Normal(-0.382194846868515,0.9240817427635193,4.2593885550739946E-17);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3535533845424652,0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        n = new Normal(-0.3531019985675812,0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.7065845131874084,0.7076286673545837,1.2145349997306256E-16);
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
        v = new Vertice(-0.3535533845424652,0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,0.9238795042037964,4.6865204697224915E-17);
        f.addVertice(v);
        n = new Normal(-0.3531019985675812,0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-0.7065845131874084,0.7076286673545837,1.2145349997306256E-16);
        f.addNormal(n);
        n = new Normal(-0.382194846868515,0.9240817427635193,4.2593885550739946E-17);
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
        v = new Vertice(-0.3535533845424652,0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.3531019985675812,0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.27059805393218994,0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.2702525556087494,0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,0.7076286673545837,-0.27039816975593567);
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
        v = new Vertice(-0.27059805393218994,0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        n = new Normal(-0.2702525556087494,0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,0.9240817427635193,-0.1462596356868744);
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
        v = new Vertice(-0.27059805393218994,0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.2702525556087494,0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.1464466154575348,0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        n = new Normal(-0.1462596356868744,0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,0.7076286673545837,-0.4996306896209717);
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
        v = new Vertice(-0.1464466154575348,0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.1462596356868744,0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,0.9240817427635193,-0.2702525556087494);
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
        v = new Vertice(-0.1464466154575348,0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-7.029780539147615E-17,0.9238795042037964,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.1462596356868744,0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(-4.2593885550739946E-17,0.9240817427635193,-0.382194846868515);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-7.029780539147615E-17,0.9238795042037964,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-1.2989341566884322E-16,0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-4.2593885550739946E-17,0.9240817427635193,-0.382194846868515);
        f.addNormal(n);
        n = new Normal(-5.715458705483328E-17,0.7076286673545837,-0.7065845131874084);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,0.7076286673545837,-0.6527989506721497);
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
        v = new Vertice(-7.029780539147615E-17,0.9238795042037964,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-4.2593885550739946E-17,0.9240817427635193,-0.382194846868515);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,0.9240817427635193,-0.3531019985675812);
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
        v = new Vertice(-7.029780539147615E-17,0.9238795042037964,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-4.2593885550739946E-17,0.9240817427635193,-0.382194846868515);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.1464466154575348,0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-1.2989341566884322E-16,0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.1462596356868744,0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-5.715458705483328E-17,0.7076286673545837,-0.7065845131874084);
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
        v = new Vertice(0.1464466154575348,0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-1.2989341566884322E-16,0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-7.029780539147615E-17,0.9238795042037964,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.1462596356868744,0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-5.715458705483328E-17,0.7076286673545837,-0.7065845131874084);
        f.addNormal(n);
        n = new Normal(-4.2593885550739946E-17,0.9240817427635193,-0.382194846868515);
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
        v = new Vertice(0.1464466154575348,0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.1462596356868744,0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.27059805393218994,0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.2702525556087494,0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,0.7076286673545837,-0.6527989506721497);
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
        v = new Vertice(0.27059805393218994,0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.2702525556087494,0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,0.9240817427635193,-0.3531019985675812);
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
        v = new Vertice(0.27059805393218994,0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        n = new Normal(0.2702525556087494,0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3535533845424652,0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        n = new Normal(0.3531019985675812,0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,0.7076286673545837,-0.4996306896209717);
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
        v = new Vertice(0.3535533845424652,0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.3531019985675812,0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,0.9240817427635193,-0.2702525556087494);
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
        v = new Vertice(0.3535533845424652,0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.0,1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,0.9238795042037964,0.0);
        f.addVertice(v);
        n = new Normal(0.3531019985675812,0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-7.080159808919034E-18,1.0,-4.336597924321939E-17);
        f.addNormal(n);
        n = new Normal(0.382194846868515,0.9240817427635193,-9.938573074591157E-17);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.7071067690849304,0.7071067690849304,0.0);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.3826834261417389,0.0);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.7065845131874084,0.7076286673545837,-5.715458705483328E-17);
        f.addNormal(n);
        n = new Normal(0.9236820936203003,0.38315969705581665,-1.1503246083728293E-16);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,0.38315969705581665,-0.3534778356552124);
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
        v = new Vertice(0.7071067690849304,0.7071067690849304,0.0);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.7065845131874084,0.7076286673545837,-5.715458705483328E-17);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,0.7076286673545837,-0.27039816975593567);
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
        v = new Vertice(0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.3826834261417389,0.0);
        f.addVertice(v);
        n = new Normal(0.6527989506721497,0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.9236820936203003,0.38315969705581665,-1.1503246083728293E-16);
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
        v = new Vertice(0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.3826834261417389,0.0);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,0.7071067690849304,0.0);
        f.addVertice(v);
        n = new Normal(0.6527989506721497,0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.9236820936203003,0.38315969705581665,-1.1503246083728293E-16);
        f.addNormal(n);
        n = new Normal(0.7065845131874084,0.7076286673545837,-5.715458705483328E-17);
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
        v = new Vertice(0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.4996306896209717,0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,0.38315969705581665,0.3534778356552124);
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
        v = new Vertice(0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.4996306896209717,0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,0.7076286673545837,0.27039816975593567);
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
        v = new Vertice(0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.27039816975593567,0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,0.38315969705581665,0.6531419157981873);
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
        v = new Vertice(0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        n = new Normal(0.27039816975593567,0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,0.7076286673545837,0.4996306896209717);
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
        v = new Vertice(4.329780301713277E-17,0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(5.657130560897519E-17,0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        n = new Normal(7.14432338185416E-18,0.7076286673545837,0.7065845131874084);
        f.addNormal(n);
        n = new Normal(7.189528802330183E-18,0.38315969705581665,0.9236820936203003);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,0.38315969705581665,0.8533710241317749);
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
        v = new Vertice(4.329780301713277E-17,0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(7.14432338185416E-18,0.7076286673545837,0.7065845131874084);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,0.7076286673545837,0.6527989506721497);
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
        v = new Vertice(-0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(5.657130560897519E-17,0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-0.27039816975593567,0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(7.189528802330183E-18,0.38315969705581665,0.9236820936203003);
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
        v = new Vertice(-0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(5.657130560897519E-17,0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(4.329780301713277E-17,0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.27039816975593567,0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(7.189528802330183E-18,0.38315969705581665,0.9236820936203003);
        f.addNormal(n);
        n = new Normal(7.14432338185416E-18,0.7076286673545837,0.7065845131874084);
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
        v = new Vertice(-0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        n = new Normal(-0.4996306896209717,0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,0.38315969705581665,0.8533710241317749);
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
        v = new Vertice(-0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.4996306896209717,0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,0.7076286673545837,0.6527989506721497);
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
        v = new Vertice(-0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.6527989506721497,0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,0.38315969705581665,0.6531419157981873);
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
        v = new Vertice(-0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.5,0.7071067690849304,0.5);
        f.addVertice(v);
        n = new Normal(-0.6527989506721497,0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,0.7076286673545837,0.4996306896209717);
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
        v = new Vertice(-0.7071067690849304,0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.7065845131874084,0.7076286673545837,1.2145349997306256E-16);
        f.addNormal(n);
        n = new Normal(-0.9236820936203003,0.38315969705581665,1.2941152009630452E-16);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,0.38315969705581665,0.3534778356552124);
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
        v = new Vertice(-0.7071067690849304,0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.7065845131874084,0.7076286673545837,1.2145349997306256E-16);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,0.7076286673545837,0.27039816975593567);
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
        v = new Vertice(-0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        n = new Normal(-0.6527989506721497,0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.9236820936203003,0.38315969705581665,1.2941152009630452E-16);
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
        v = new Vertice(-0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        n = new Normal(-0.6527989506721497,0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.9236820936203003,0.38315969705581665,1.2941152009630452E-16);
        f.addNormal(n);
        n = new Normal(-0.7065845131874084,0.7076286673545837,1.2145349997306256E-16);
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
        v = new Vertice(-0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.4996306896209717,0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,0.38315969705581665,-0.3534778356552124);
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
        v = new Vertice(-0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.4996306896209717,0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,0.7076286673545837,-0.27039816975593567);
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
        v = new Vertice(-0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.27039816975593567,0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,0.38315969705581665,-0.6531419157981873);
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
        v = new Vertice(-0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        n = new Normal(-0.27039816975593567,0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,0.7076286673545837,-0.4996306896209717);
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
        v = new Vertice(-1.2989341566884322E-16,0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-1.6971391682692557E-16,0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        n = new Normal(-5.715458705483328E-17,0.7076286673545837,-0.7065845131874084);
        f.addNormal(n);
        n = new Normal(-1.0784293120777214E-16,0.38315969705581665,-0.9236820936203003);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,0.38315969705581665,-0.8533710241317749);
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
        v = new Vertice(-1.2989341566884322E-16,0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-5.715458705483328E-17,0.7076286673545837,-0.7065845131874084);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,0.7076286673545837,-0.6527989506721497);
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
        v = new Vertice(0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-1.6971391682692557E-16,0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.27039816975593567,0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-1.0784293120777214E-16,0.38315969705581665,-0.9236820936203003);
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
        v = new Vertice(0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-1.6971391682692557E-16,0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-1.2989341566884322E-16,0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.27039816975593567,0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-1.0784293120777214E-16,0.38315969705581665,-0.9236820936203003);
        f.addNormal(n);
        n = new Normal(-5.715458705483328E-17,0.7076286673545837,-0.7065845131874084);
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
        v = new Vertice(0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        n = new Normal(0.4996306896209717,0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,0.38315969705581665,-0.8533710241317749);
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
        v = new Vertice(0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.4996306896209717,0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,0.7076286673545837,-0.6527989506721497);
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
        v = new Vertice(0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.6527989506721497,0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,0.38315969705581665,-0.6531419157981873);
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
        v = new Vertice(0.6532814502716064,0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.5,0.7071067690849304,-0.5);
        f.addVertice(v);
        n = new Normal(0.6527989506721497,0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,0.7076286673545837,-0.4996306896209717);
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
        v = new Vertice(0.9238795042037964,0.3826834261417389,0.0);
        f.addVertice(v);
        v = new Vertice(1.0,6.123234262925839E-17,0.0);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.9236820936203003,0.38315969705581665,-1.1503246083728293E-16);
        f.addNormal(n);
        n = new Normal(1.0,0.0,-1.5858067458689266E-16);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,-0.3826834261417389);
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
        v = new Vertice(0.9238795042037964,0.3826834261417389,0.0);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.9236820936203003,0.38315969705581665,-1.1503246083728293E-16);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,0.38315969705581665,-0.3534778356552124);
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
        v = new Vertice(0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(1.0,6.123234262925839E-17,0.0);
        f.addVertice(v);
        n = new Normal(0.8533710241317749,0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(1.0,0.0,-1.5858067458689266E-16);
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
        v = new Vertice(0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(1.0,6.123234262925839E-17,0.0);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,0.3826834261417389,0.0);
        f.addVertice(v);
        n = new Normal(0.8533710241317749,0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(1.0,0.0,-1.5858067458689266E-16);
        f.addNormal(n);
        n = new Normal(0.9236820936203003,0.38315969705581665,-1.1503246083728293E-16);
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
        v = new Vertice(0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.6531419157981873,0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-7.208212330825918E-18,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,0.3826834261417389);
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
        v = new Vertice(0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.6531419157981873,0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,0.38315969705581665,0.3534778356552124);
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
        v = new Vertice(0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.3534778356552124,0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,0.0,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-7.208212330825918E-18,0.7071067690849304);
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
        v = new Vertice(0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.3534778356552124,0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-7.208212330825918E-18,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,0.38315969705581665,0.6531419157981873);
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
        v = new Vertice(5.657130560897519E-17,0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(6.123234262925839E-17,6.123234262925839E-17,1.0);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(7.189528802330183E-18,0.38315969705581665,0.9236820936203003);
        f.addNormal(n);
        n = new Normal(0.0,0.0,1.0);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,0.0,0.9238795042037964);
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
        v = new Vertice(5.657130560897519E-17,0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        n = new Normal(7.189528802330183E-18,0.38315969705581665,0.9236820936203003);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,0.0,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,0.38315969705581665,0.8533710241317749);
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
        v = new Vertice(-0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(6.123234262925839E-17,6.123234262925839E-17,1.0);
        f.addVertice(v);
        n = new Normal(-0.3534778356552124,0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,0.0,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.0,0.0,1.0);
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
        v = new Vertice(-0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(6.123234262925839E-17,6.123234262925839E-17,1.0);
        f.addVertice(v);
        v = new Vertice(5.657130560897519E-17,0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-0.3534778356552124,0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.0,0.0,1.0);
        f.addNormal(n);
        n = new Normal(7.189528802330183E-18,0.38315969705581665,0.9236820936203003);
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
        v = new Vertice(-0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-0.6531419157981873,0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,7.208212330825918E-18,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,0.0,0.9238795042037964);
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
        v = new Vertice(-0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        n = new Normal(-0.6531419157981873,0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,0.0,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,0.38315969705581665,0.8533710241317749);
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
        v = new Vertice(-0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.8533710241317749,0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-7.208212330825918E-18,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,7.208212330825918E-18,0.7071067690849304);
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
        v = new Vertice(-0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.8533710241317749,0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,7.208212330825918E-18,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,0.38315969705581665,0.6531419157981873);
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
        v = new Vertice(-0.9238795042037964,0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        v = new Vertice(-1.0,6.123234262925839E-17,1.2246468525851679E-16);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.9236820936203003,0.38315969705581665,1.2941152009630452E-16);
        f.addNormal(n);
        n = new Normal(-1.0,0.0,1.0091498255773021E-16);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-7.208212330825918E-18,0.3826834261417389);
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
        v = new Vertice(-0.9238795042037964,0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.9236820936203003,0.38315969705581665,1.2941152009630452E-16);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-7.208212330825918E-18,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,0.38315969705581665,0.3534778356552124);
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
        v = new Vertice(-0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-1.0,6.123234262925839E-17,1.2246468525851679E-16);
        f.addVertice(v);
        n = new Normal(-0.8533710241317749,0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,0.0,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-1.0,0.0,1.0091498255773021E-16);
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
        v = new Vertice(-0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-1.0,6.123234262925839E-17,1.2246468525851679E-16);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        n = new Normal(-0.8533710241317749,0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-1.0,0.0,1.0091498255773021E-16);
        f.addNormal(n);
        n = new Normal(-0.9236820936203003,0.38315969705581665,1.2941152009630452E-16);
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
        v = new Vertice(-0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.6531419157981873,0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,0.0,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,0.0,-0.3826834261417389);
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
        v = new Vertice(-0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.6531419157981873,0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,0.0,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,0.38315969705581665,-0.3534778356552124);
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
        v = new Vertice(-0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.3534778356552124,0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-7.208212330825918E-18,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,0.0,-0.7071067690849304);
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
        v = new Vertice(-0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.3534778356552124,0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,0.0,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,0.38315969705581665,-0.6531419157981873);
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
        v = new Vertice(-1.6971391682692557E-16,0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-1.8369701465288538E-16,6.123234262925839E-17,-1.0);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-1.0784293120777214E-16,0.38315969705581665,-0.9236820936203003);
        f.addNormal(n);
        n = new Normal(-1.4416425323396327E-16,7.208212330825918E-18,-1.0);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-7.208212330825918E-18,-0.9238795042037964);
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
        v = new Vertice(-1.6971391682692557E-16,0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        n = new Normal(-1.0784293120777214E-16,0.38315969705581665,-0.9236820936203003);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-7.208212330825918E-18,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,0.38315969705581665,-0.8533710241317749);
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
        v = new Vertice(0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-1.8369701465288538E-16,6.123234262925839E-17,-1.0);
        f.addVertice(v);
        n = new Normal(0.3534778356552124,0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,0.0,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-1.4416425323396327E-16,7.208212330825918E-18,-1.0);
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
        v = new Vertice(0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-1.8369701465288538E-16,6.123234262925839E-17,-1.0);
        f.addVertice(v);
        v = new Vertice(-1.6971391682692557E-16,0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.3534778356552124,0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-1.4416425323396327E-16,7.208212330825918E-18,-1.0);
        f.addNormal(n);
        n = new Normal(-1.0784293120777214E-16,0.38315969705581665,-0.9236820936203003);
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
        v = new Vertice(0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.6531419157981873,0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,7.208212330825918E-18,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,0.0,-0.9238795042037964);
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
        v = new Vertice(0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        n = new Normal(0.6531419157981873,0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,0.0,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,0.38315969705581665,-0.8533710241317749);
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
        v = new Vertice(0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.8533710241317749,0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,7.208212330825918E-18,-0.7071067690849304);
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
        v = new Vertice(0.8535534143447876,0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.8533710241317749,0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,7.208212330825918E-18,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,0.38315969705581665,-0.6531419157981873);
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
        v = new Vertice(1.0,6.123234262925839E-17,0.0);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,-0.3826834261417389,0.0);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(1.0,0.0,-1.5858067458689266E-16);
        f.addNormal(n);
        n = new Normal(0.9236820936203003,-0.38315969705581665,-1.2941152009630452E-16);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
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
        v = new Vertice(1.0,6.123234262925839E-17,0.0);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(1.0,0.0,-1.5858067458689266E-16);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,-0.3826834261417389);
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
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,-0.3826834261417389,0.0);
        f.addVertice(v);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,-0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.9236820936203003,-0.38315969705581665,-1.2941152009630452E-16);
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
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,-0.3826834261417389,0.0);
        f.addVertice(v);
        v = new Vertice(1.0,6.123234262925839E-17,0.0);
        f.addVertice(v);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.9236820936203003,-0.38315969705581665,-1.2941152009630452E-16);
        f.addNormal(n);
        n = new Normal(1.0,0.0,-1.5858067458689266E-16);
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
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,-7.208212330825918E-18,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,-0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,-0.38315969705581665,0.3534778356552124);
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
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,-7.208212330825918E-18,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,-0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,0.3826834261417389);
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
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,0.0,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,-0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,-0.38315969705581665,0.6531419157981873);
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
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,0.0,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,-0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,-7.208212330825918E-18,0.7071067690849304);
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
        v = new Vertice(6.123234262925839E-17,6.123234262925839E-17,1.0);
        f.addVertice(v);
        v = new Vertice(5.657130560897519E-17,-0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        n = new Normal(0.0,0.0,1.0);
        f.addNormal(n);
        n = new Normal(0.0,-0.38315969705581665,0.9236820936203003);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,-0.38315969705581665,0.8533710241317749);
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
        v = new Vertice(6.123234262925839E-17,6.123234262925839E-17,1.0);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.0,0.0,1.0);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,-0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,0.0,0.9238795042037964);
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
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(5.657130560897519E-17,-0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,0.0,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.0,-0.38315969705581665,0.9236820936203003);
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
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(5.657130560897519E-17,-0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(6.123234262925839E-17,6.123234262925839E-17,1.0);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,0.0,0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.0,-0.38315969705581665,0.9236820936203003);
        f.addNormal(n);
        n = new Normal(0.0,0.0,1.0);
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
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,7.208212330825918E-18,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,0.8533710241317749);
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
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,7.208212330825918E-18,0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,0.0,0.9238795042037964);
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
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.9238795042037964,-7.208212330825918E-18,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,0.6531419157981873);
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
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.9238795042037964,-7.208212330825918E-18,0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,7.208212330825918E-18,0.7071067690849304);
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
        v = new Vertice(-1.0,6.123234262925839E-17,1.2246468525851679E-16);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,-0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-1.0,0.0,1.0091498255773021E-16);
        f.addNormal(n);
        n = new Normal(-0.9236820936203003,-0.38315969705581665,1.2222198384934883E-16);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,0.3534778356552124);
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
        v = new Vertice(-1.0,6.123234262925839E-17,1.2246468525851679E-16);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-1.0,0.0,1.0091498255773021E-16);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,-7.208212330825918E-18,0.3826834261417389);
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
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,-0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        n = new Normal(-0.9238795042037964,0.0,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.9236820936203003,-0.38315969705581665,1.2222198384934883E-16);
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
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,-0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        v = new Vertice(-1.0,6.123234262925839E-17,1.2246468525851679E-16);
        f.addVertice(v);
        n = new Normal(-0.9238795042037964,0.0,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(-0.9236820936203003,-0.38315969705581665,1.2222198384934883E-16);
        f.addNormal(n);
        n = new Normal(-1.0,0.0,1.0091498255773021E-16);
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
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,0.0,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
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
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.7071067690849304,0.0,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.9238795042037964,0.0,-0.3826834261417389);
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
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,-7.208212330825918E-18,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
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
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.3826834261417389,-7.208212330825918E-18,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.7071067690849304,0.0,-0.7071067690849304);
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
        v = new Vertice(-1.8369701465288538E-16,6.123234262925839E-17,-1.0);
        f.addVertice(v);
        v = new Vertice(-1.6971391682692557E-16,-0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        n = new Normal(-1.4416425323396327E-16,7.208212330825918E-18,-1.0);
        f.addNormal(n);
        n = new Normal(-1.0784293120777214E-16,-0.38315969705581665,-0.9236820936203003);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
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
        v = new Vertice(-1.8369701465288538E-16,6.123234262925839E-17,-1.0);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-1.4416425323396327E-16,7.208212330825918E-18,-1.0);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.3826834261417389,-7.208212330825918E-18,-0.9238795042037964);
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
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-1.6971391682692557E-16,-0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,0.0,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-1.0784293120777214E-16,-0.38315969705581665,-0.9236820936203003);
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
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-1.6971391682692557E-16,-0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-1.8369701465288538E-16,6.123234262925839E-17,-1.0);
        f.addVertice(v);
        n = new Normal(0.3826834261417389,0.0,-0.9238795042037964);
        f.addNormal(n);
        n = new Normal(-1.0784293120777214E-16,-0.38315969705581665,-0.9236820936203003);
        f.addNormal(n);
        n = new Normal(-1.4416425323396327E-16,7.208212330825918E-18,-1.0);
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
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,7.208212330825918E-18,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
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
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,6.123234262925839E-17,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.7071067690849304,7.208212330825918E-18,-0.7071067690849304);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.3826834261417389,0.0,-0.9238795042037964);
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
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
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
        v = new Vertice(0.9238795042037964,6.123234262925839E-17,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,6.123234262925839E-17,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.9238795042037964,7.208212330825918E-18,-0.3826834261417389);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.7071067690849304,7.208212330825918E-18,-0.7071067690849304);
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
        v = new Vertice(0.9238795042037964,-0.3826834261417389,0.0);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,-0.7071067690849304,0.0);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.9236820936203003,-0.38315969705581665,-1.2941152009630452E-16);
        f.addNormal(n);
        n = new Normal(0.7065845131874084,-0.7076286673545837,-6.429891291822928E-17);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
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
        v = new Vertice(0.9238795042037964,-0.3826834261417389,0.0);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.9236820936203003,-0.38315969705581665,-1.2941152009630452E-16);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
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
        v = new Vertice(0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,-0.7071067690849304,0.0);
        f.addVertice(v);
        n = new Normal(0.8533710241317749,-0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,-0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.7065845131874084,-0.7076286673545837,-6.429891291822928E-17);
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
        v = new Vertice(0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,-0.7071067690849304,0.0);
        f.addVertice(v);
        v = new Vertice(0.9238795042037964,-0.3826834261417389,0.0);
        f.addVertice(v);
        n = new Normal(0.8533710241317749,-0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.7065845131874084,-0.7076286673545837,-6.429891291822928E-17);
        f.addNormal(n);
        n = new Normal(0.9236820936203003,-0.38315969705581665,-1.2941152009630452E-16);
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
        v = new Vertice(0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.6531419157981873,-0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,-0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,-0.7076286673545837,0.27039816975593567);
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
        v = new Vertice(0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.6531419157981873,-0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,-0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.8533710241317749,-0.38315969705581665,0.3534778356552124);
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
        v = new Vertice(0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        n = new Normal(0.3534778356552124,-0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,-0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,-0.7076286673545837,0.4996306896209717);
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
        v = new Vertice(0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.3534778356552124,-0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,-0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,-0.38315969705581665,0.6531419157981873);
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
        v = new Vertice(5.657130560897519E-17,-0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(4.329780301713277E-17,-0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.0,-0.38315969705581665,0.9236820936203003);
        f.addNormal(n);
        n = new Normal(0.0,-0.7076286673545837,0.7065845131874084);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,-0.7076286673545837,0.6527989506721497);
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
        v = new Vertice(5.657130560897519E-17,-0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        n = new Normal(0.0,-0.38315969705581665,0.9236820936203003);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,-0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,-0.38315969705581665,0.8533710241317749);
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
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(4.329780301713277E-17,-0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.0,-0.7076286673545837,0.7065845131874084);
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
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(4.329780301713277E-17,-0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(5.657130560897519E-17,-0.3826834261417389,0.9238795042037964);
        f.addVertice(v);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.0,-0.7076286673545837,0.7065845131874084);
        f.addNormal(n);
        n = new Normal(0.0,-0.38315969705581665,0.9236820936203003);
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
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,0.6527989506721497);
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
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,0.8535534143447876);
        f.addVertice(v);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,0.8533710241317749);
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
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,0.4996306896209717);
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
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,0.6531419157981873);
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
        v = new Vertice(-0.9238795042037964,-0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,-0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.9236820936203003,-0.38315969705581665,1.2222198384934883E-16);
        f.addNormal(n);
        n = new Normal(-0.7065845131874084,-0.7076286673545837,1.3216997553326676E-16);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,0.27039816975593567);
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
        v = new Vertice(-0.9238795042037964,-0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.9236820936203003,-0.38315969705581665,1.2222198384934883E-16);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,0.3534778356552124);
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
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,-0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.7065845131874084,-0.7076286673545837,1.3216997553326676E-16);
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
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,-0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        v = new Vertice(-0.9238795042037964,-0.3826834261417389,1.1314261121795038E-16);
        f.addVertice(v);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(-0.7065845131874084,-0.7076286673545837,1.3216997553326676E-16);
        f.addNormal(n);
        n = new Normal(-0.9236820936203003,-0.38315969705581665,1.2222198384934883E-16);
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
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
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
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
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
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
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
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
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
        v = new Vertice(-1.6971391682692557E-16,-0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-1.2989341566884322E-16,-0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-1.0784293120777214E-16,-0.38315969705581665,-0.9236820936203003);
        f.addNormal(n);
        n = new Normal(-5.715458705483328E-17,-0.7076286673545837,-0.7065845131874084);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
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
        v = new Vertice(-1.6971391682692557E-16,-0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        n = new Normal(-1.0784293120777214E-16,-0.38315969705581665,-0.9236820936203003);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
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
        v = new Vertice(0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-1.2989341566884322E-16,-0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-5.715458705483328E-17,-0.7076286673545837,-0.7065845131874084);
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
        v = new Vertice(0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        v = new Vertice(-1.2989341566884322E-16,-0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-1.6971391682692557E-16,-0.3826834261417389,-0.9238795042037964);
        f.addVertice(v);
        n = new Normal(0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
        f.addNormal(n);
        n = new Normal(-5.715458705483328E-17,-0.7076286673545837,-0.7065845131874084);
        f.addNormal(n);
        n = new Normal(-1.0784293120777214E-16,-0.38315969705581665,-0.9236820936203003);
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
        v = new Vertice(0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
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
        v = new Vertice(0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.3826834261417389,-0.8535534143447876);
        f.addVertice(v);
        n = new Normal(0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.3534778356552124,-0.38315969705581665,-0.8533710241317749);
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
        v = new Vertice(0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        n = new Normal(0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
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
        v = new Vertice(0.8535534143447876,-0.3826834261417389,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.3826834261417389,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.8533710241317749,-0.38315969705581665,-0.3534778356552124);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.6531419157981873,-0.38315969705581665,-0.6531419157981873);
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
        v = new Vertice(0.7071067690849304,-0.7071067690849304,0.0);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,-0.9238795042037964,0.0);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        n = new Normal(0.7065845131874084,-0.7076286673545837,-6.429891291822928E-17);
        f.addNormal(n);
        n = new Normal(0.382194846868515,-0.9240817427635193,4.649832362577805E-16);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,-0.9240817427635193,-0.1462596356868744);
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
        v = new Vertice(0.7071067690849304,-0.7071067690849304,0.0);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.7065845131874084,-0.7076286673545837,-6.429891291822928E-17);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,-0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
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
        v = new Vertice(0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,-0.9238795042037964,0.0);
        f.addVertice(v);
        n = new Normal(0.6527989506721497,-0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,-0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(0.382194846868515,-0.9240817427635193,4.649832362577805E-16);
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
        v = new Vertice(0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,-0.9238795042037964,0.0);
        f.addVertice(v);
        v = new Vertice(0.7071067690849304,-0.7071067690849304,0.0);
        f.addVertice(v);
        n = new Normal(0.6527989506721497,-0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.382194846868515,-0.9240817427635193,4.649832362577805E-16);
        f.addNormal(n);
        n = new Normal(0.7065845131874084,-0.7076286673545837,-6.429891291822928E-17);
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
        v = new Vertice(0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        n = new Normal(0.4996306896209717,-0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,-0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,-0.9240817427635193,0.1462596356868744);
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
        v = new Vertice(0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.4996306896209717,-0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,-0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(0.6527989506721497,-0.7076286673545837,0.27039816975593567);
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
        v = new Vertice(0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,-0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.27039816975593567,-0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,-0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,-0.9240817427635193,0.2702525556087494);
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
        v = new Vertice(0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        n = new Normal(0.27039816975593567,-0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,-0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,-0.7076286673545837,0.4996306896209717);
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
        v = new Vertice(4.329780301713277E-17,-0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(2.3432602348612458E-17,-0.9238795042037964,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,-0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.0,-0.7076286673545837,0.7065845131874084);
        f.addNormal(n);
        n = new Normal(3.549490324698227E-18,-0.9240817427635193,0.382194846868515);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,-0.9240817427635193,0.3531019985675812);
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
        v = new Vertice(4.329780301713277E-17,-0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,-0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.0,-0.7076286673545837,0.7065845131874084);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,-0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,-0.7076286673545837,0.6527989506721497);
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
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,-0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(2.3432602348612458E-17,-0.9238795042037964,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,-0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(3.549490324698227E-18,-0.9240817427635193,0.382194846868515);
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
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(2.3432602348612458E-17,-0.9238795042037964,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(4.329780301713277E-17,-0.7071067690849304,0.7071067690849304);
        f.addVertice(v);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,0.6527989506721497);
        f.addNormal(n);
        n = new Normal(3.549490324698227E-18,-0.9240817427635193,0.382194846868515);
        f.addNormal(n);
        n = new Normal(0.0,-0.7076286673545837,0.7065845131874084);
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
        v = new Vertice(-0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,-0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,-0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,-0.9240817427635193,0.3531019985675812);
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
        v = new Vertice(-0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,-0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,-0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,0.6527989506721497);
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
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,-0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,-0.9240817427635193,0.2702525556087494);
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
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.5,-0.7071067690849304,0.5);
        f.addVertice(v);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,-0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,0.4996306896209717);
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
        v = new Vertice(-0.7071067690849304,-0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,-0.9238795042037964,4.6865204697224915E-17);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        n = new Normal(-0.7065845131874084,-0.7076286673545837,1.3216997553326676E-16);
        f.addNormal(n);
        n = new Normal(-0.382194846868515,-0.9240817427635193,1.2068267352128155E-16);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,-0.9240817427635193,0.1462596356868744);
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
        v = new Vertice(-0.7071067690849304,-0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.7065845131874084,-0.7076286673545837,1.3216997553326676E-16);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,-0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,0.27039816975593567);
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
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,-0.9238795042037964,4.6865204697224915E-17);
        f.addVertice(v);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,-0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-0.382194846868515,-0.9240817427635193,1.2068267352128155E-16);
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
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,-0.9238795042037964,4.6865204697224915E-17);
        f.addVertice(v);
        v = new Vertice(-0.7071067690849304,-0.7071067690849304,8.659560603426554E-17);
        f.addVertice(v);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(-0.382194846868515,-0.9240817427635193,1.2068267352128155E-16);
        f.addNormal(n);
        n = new Normal(-0.7065845131874084,-0.7076286673545837,1.3216997553326676E-16);
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
        v = new Vertice(-0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,-0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,-0.9240817427635193,-0.1462596356868744);
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
        v = new Vertice(-0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(-0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,-0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
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
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,-0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,-0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,-0.9240817427635193,-0.2702525556087494);
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
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(-0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,-0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
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
        v = new Vertice(-1.2989341566884322E-16,-0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-7.029780539147615E-17,-0.9238795042037964,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,-0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-5.715458705483328E-17,-0.7076286673545837,-0.7065845131874084);
        f.addNormal(n);
        n = new Normal(-3.5494902419801655E-17,-0.9240817427635193,-0.382194846868515);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,-0.9240817427635193,-0.3531019985675812);
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
        v = new Vertice(-1.2989341566884322E-16,-0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,-0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(-5.715458705483328E-17,-0.7076286673545837,-0.7065845131874084);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,-0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
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
        v = new Vertice(0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,-0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(-7.029780539147615E-17,-0.9238795042037964,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,-0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-3.5494902419801655E-17,-0.9240817427635193,-0.382194846868515);
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
        v = new Vertice(0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        v = new Vertice(-7.029780539147615E-17,-0.9238795042037964,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(-1.2989341566884322E-16,-0.7071067690849304,-0.7071067690849304);
        f.addVertice(v);
        n = new Normal(0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
        f.addNormal(n);
        n = new Normal(-3.5494902419801655E-17,-0.9240817427635193,-0.382194846868515);
        f.addNormal(n);
        n = new Normal(-5.715458705483328E-17,-0.7076286673545837,-0.7065845131874084);
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
        v = new Vertice(0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,-0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,-0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,-0.9240817427635193,-0.3531019985675812);
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
        v = new Vertice(0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,-0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.7071067690849304,-0.6532814502716064);
        f.addVertice(v);
        n = new Normal(0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,-0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(0.27039816975593567,-0.7076286673545837,-0.6527989506721497);
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
        v = new Vertice(0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,-0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,-0.9240817427635193,-0.2702525556087494);
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
        v = new Vertice(0.6532814502716064,-0.7071067690849304,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.5,-0.7071067690849304,-0.5);
        f.addVertice(v);
        n = new Normal(0.6527989506721497,-0.7076286673545837,-0.27039816975593567);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,-0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(0.4996306896209717,-0.7076286673545837,-0.4996306896209717);
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
        v = new Vertice(0.3826834261417389,-0.9238795042037964,0.0);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        n = new Normal(0.382194846868515,-0.9240817427635193,4.649832362577805E-16);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,-0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3535533845424652,-0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.3826834261417389,-0.9238795042037964,0.0);
        f.addVertice(v);
        n = new Normal(0.3531019985675812,-0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(0.382194846868515,-0.9240817427635193,4.649832362577805E-16);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.27059805393218994,-0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.3535533845424652,-0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        n = new Normal(0.2702525556087494,-0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(0.3531019985675812,-0.9240817427635193,0.1462596356868744);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.1464466154575348,-0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.1462596356868744,-0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,-0.9240817427635193,0.2702525556087494);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(2.3432602348612458E-17,-0.9238795042037964,0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,-0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(3.549490324698227E-18,-0.9240817427635193,0.382194846868515);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,-0.9240817427635193,0.3531019985675812);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.1464466154575348,-0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(2.3432602348612458E-17,-0.9238795042037964,0.3826834261417389);
        f.addVertice(v);
        n = new Normal(-0.1462596356868744,-0.9240817427635193,0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(3.549490324698227E-18,-0.9240817427635193,0.382194846868515);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.27059805393218994,-0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,-0.9238795042037964,0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-0.2702525556087494,-0.9240817427635193,0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,-0.9240817427635193,0.3531019985675812);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3535533845424652,-0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.9238795042037964,0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.3531019985675812,-0.9240817427635193,0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,-0.9240817427635193,0.2702525556087494);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3826834261417389,-0.9238795042037964,4.6865204697224915E-17);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.9238795042037964,0.1464466154575348);
        f.addVertice(v);
        n = new Normal(-0.382194846868515,-0.9240817427635193,1.2068267352128155E-16);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,-0.9240817427635193,0.1462596356868744);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.3535533845424652,-0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.3826834261417389,-0.9238795042037964,4.6865204697224915E-17);
        f.addVertice(v);
        n = new Normal(-0.3531019985675812,-0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(-0.382194846868515,-0.9240817427635193,1.2068267352128155E-16);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.27059805393218994,-0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.3535533845424652,-0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        n = new Normal(-0.2702525556087494,-0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(-0.3531019985675812,-0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-0.1464466154575348,-0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.27059805393218994,-0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(-0.1462596356868744,-0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(-0.2702525556087494,-0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(-7.029780539147615E-17,-0.9238795042037964,-0.3826834261417389);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-0.1464466154575348,-0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(-3.5494902419801655E-17,-0.9240817427635193,-0.382194846868515);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(-0.1462596356868744,-0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.1464466154575348,-0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(-7.029780539147615E-17,-0.9238795042037964,-0.3826834261417389);
        f.addVertice(v);
        n = new Normal(0.1462596356868744,-0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(-3.5494902419801655E-17,-0.9240817427635193,-0.382194846868515);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.27059805393218994,-0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.1464466154575348,-0.9238795042037964,-0.3535533845424652);
        f.addVertice(v);
        n = new Normal(0.2702525556087494,-0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(0.1462596356868744,-0.9240817427635193,-0.3531019985675812);
        f.addNormal(n);

        this.addFace(f);

        //Creating Face
        f = new DynamicFace();
        v = new Vertice(0.3535533845424652,-0.9238795042037964,-0.1464466154575348);
        f.addVertice(v);
        v = new Vertice(0.0,-1.0,0.0);
        f.addVertice(v);
        v = new Vertice(0.27059805393218994,-0.9238795042037964,-0.27059805393218994);
        f.addVertice(v);
        n = new Normal(0.3531019985675812,-0.9240817427635193,-0.1462596356868744);
        f.addNormal(n);
        n = new Normal(-1.7700399522297586E-18,-1.0,-6.239390935007476E-17);
        f.addNormal(n);
        n = new Normal(0.2702525556087494,-0.9240817427635193,-0.2702525556087494);
        f.addNormal(n);

        this.addFace(f);
    }
    
    private Sphere(Sphere mesh) {
        super(mesh);
        this.cloneMaterial();
    }
}
