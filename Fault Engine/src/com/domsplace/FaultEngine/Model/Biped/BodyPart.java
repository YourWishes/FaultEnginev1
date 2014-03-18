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

package com.domsplace.FaultEngine.Model.Biped;

import com.domsplace.FaultEngine.Model.EmptyModel;
import com.domsplace.FaultEngine.Model.Material.Material;

/**
 *
 * @author Dominic Masters
 */
public class BodyPart extends EmptyModel {
    private BipedModel biped;
    
    public BodyPart(BipedModel biped) {
        super();
        this.biped = biped;
    }
    
    public BodyPart(BodyPart bp) {
        super(bp);
        this.biped = bp.biped;
    }
    
    public BipedModel getBipedModel() {return this.biped;}
    public Material getSkin() {return this.biped.getSkin();}
    
    public void setBipedModel(BipedModel biped) {
        this.biped = biped;
        this.removeFromParent();
        this.setParent(biped);
    }
    
    @Override public BodyPart clone() {return new BodyPart(this);}
}
