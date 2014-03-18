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

package com.domsplace.FaultEngine.Solid;

import com.domsplace.FaultEngine.Model.Primitives.Cube;

/**
 *
 * @author Dominic Masters
 */
public class BoundingBox extends Cube {    
    public boolean isIn(BoundingBox box) {  //May not be thread safe (If Bounding Box Location changes)
        double myX = this.getLocation().getX();
        double myY = this.getLocation().getY();
        double myZ = this.getLocation().getZ();
        
        double nmX = box.getLocation().getX();
        double nmY = box.getLocation().getY();
        double nmZ = box.getLocation().getZ();
        
        double mxs = this.getScaleX();
        double mys = this.getScaleY();
        double mzs = this.getScaleZ();
        
        double nxs = box.getScaleX();
        double nys = box.getScaleY();
        double nzs = box.getScaleZ();
        
        
        return false;
    }
}
