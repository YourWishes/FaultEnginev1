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
import com.domsplace.FaultEngine.Model.Material.SimpleMaterial;

/**
 *
 * @author Dominic Masters
 */
public class BipedModel extends EmptyModel {
    private ArmModel leftArm;
    private ArmModel rightArm;
    
    private LegModel leftLeg;
    private LegModel rightLeg;
    
    private HeadModel head;
    private TorsoModel torso;
    
    private Material skin;
    
    public BipedModel() {
        super();
        this.skin = new SimpleMaterial();
    }
    
    public Material getSkin() {return this.skin;}
    public ArmModel getLeftArm() {return this.leftArm;}
    public ArmModel getRightArm() {return this.rightArm;}
    public LegModel getLeftLeg() {return this.leftLeg;}
    public LegModel getRightLeg() {return this.rightLeg;}
    public HeadModel getHead() {return this.head;}
    public TorsoModel getTorso() {return this.torso;}
    
    public void setSkin(Material skin) {this.skin = skin; this.setMaterial(skin);}
    public void setLeftArm(ArmModel arm) {this.leftArm = arm; arm.setBipedModel(this);}
    public void setRightArm(ArmModel arm) {this.rightArm = arm; arm.setBipedModel(this);}
    public void setLeftLeg(LegModel leg) {this.leftLeg = leg; leg.setBipedModel(this);}
    public void setRightLeg(LegModel leg) {this.rightLeg = leg; leg.setBipedModel(this);}
    public void setHead(HeadModel head) {this.head = head; head.setBipedModel(this);}
    public void setTorso(TorsoModel torso) {this.torso = torso; torso.setBipedModel(this);}

    public void goStance() {
        //Resets Orientation
    }
}
