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

package com.domsplace.FaultEngine.Model;

import com.domsplace.FaultEngine.Location.Location;
import org.lwjgl.util.vector.Vector3f;

/**
 *
 * @author Dominic Masters
 */
public class Vertice extends Location {
    public Vertice() {
        super();
    }
    
    public Vertice(Vector3f vector) {
        super(vector.x, vector.y, vector.z);
    }
    
    public Vertice(Location location) {
        super(location);
    }
    
    public Vertice(double x, double y, double z) {
        super(x,y,z,0,0,0);
    }
    
    public Vertice(double x, double y, double z, double pitch, double yaw, double roll) {
        super(x,y,z,pitch,yaw,roll);
    }
    
    @Override
    public Vertice clone() {
        return new Vertice(this);
    }
}
