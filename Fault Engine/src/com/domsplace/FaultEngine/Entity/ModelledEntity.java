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

import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Model;
import com.domsplace.FaultEngine.Solid.SimpleSolid;

/**
 *
 * @author Dominic Masters
 */
public class ModelledEntity extends SimpleSolid implements Entity {
    private Model model;
    public ModelledEntity(Model m) {
        super();
        this.model = m;
    }
    
    public Model getModel() {return this.model;}
    @Override public Location getLocation() {return this.model.getLocation();}
    
    public void setModel(Model m) {this.model = m;}
    @Override public void setLocation(Location l) {this.model.getLocation().set(l);}

    @Override public void remove() {this.model.dispose();}
    @Override public void tick() {}
}
