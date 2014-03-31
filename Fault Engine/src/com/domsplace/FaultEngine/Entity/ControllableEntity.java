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

package com.domsplace.FaultEngine.Entity;

import com.domsplace.FaultEngine.Controller.Controllable;
import com.domsplace.FaultEngine.Controller.Controller;
import com.domsplace.FaultEngine.Model.Model;
import com.domsplace.FaultEngine.Solid.BoundingBox;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public class ControllableEntity extends AnimatedEntity implements Controllable {
    private List<Controller> controllers;
    
    private double speed = 0.2;
    
    public ControllableEntity(Model m) {
        super(m);
        
        if(m instanceof BoundingBox) {
            this.addBoundingBox((BoundingBox)m);
        }
        
        this.controllers = new ArrayList<Controller>();
    }
    
    public double getSpeed() {return this.speed;}
    @Override public List<Controller> getControllers() {return new ArrayList<Controller>(this.controllers);}

    public void setSpeed(double speed) {this.speed = speed;}
    
    public void moveForward() {this.getLocation().set(this.getLocation().getRelativeInFacingDirection(this.getSpeed()));}
    public void moveBackward() {this.getLocation().set(this.getLocation().getRelativeInFacingDirection(-this.getSpeed()*0.75));}
    public void moveLeft() {this.getLocation().set(this.getLocation().getRelativeInFacingDirection(this.getSpeed()*0.75, 90));}
    public void moveRight() {this.getLocation().set(this.getLocation().getRelativeInFacingDirection(this.getSpeed()*0.75, 270));}
    
    @Override
    public void addController(Controller c) {
        this.controllers.add(c);
    }

    @Override
    public void removeController(Controller c) {
        this.controllers.remove(c);
    }
    
    @Override
    public void tick() {
        for(Controller c : this.getControllers()) { //Thread Safe
            c.tick();
        }
        super.tick();
    }
    
    @Override
    public void remove() {
        for(Controller c : this.getControllers()) {
            c.dispose();
        }
        super.remove();
    }
}
