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
        
        double mxs = this.getScaleX()/2d;
        double mys = this.getScaleY()/2d;
        double mzs = this.getScaleZ()/2d;
        
        double nxs = box.getScaleX()/2d;
        double nys = box.getScaleY()/2d;
        double nzs = box.getScaleZ()/2d;
        
        double myMinX = myX - mxs;
        double myMinY = myY - mys;
        double myMinZ = myZ - mzs;
        
        double myMaxX = myX + mxs;
        double myMaxY = myY + mys;
        double myMaxZ = myZ + mzs;
        
        double notMinX = nmX - nxs;
        double notMinY = nmY - nys;
        double notMinZ = nmZ - nzs;
        
        double notMaxX = nmX + nxs;
        double notMaxY = nmY + nys;
        double notMaxZ = nmZ + nzs;
        
        boolean myXInside = (myMinX >= notMinX && myMinX <= notMaxX) || (myMaxX >= notMinX && myMaxX <= notMaxX);
        boolean myYInside = (myMinY >= notMinY && myMinY <= notMaxY) || (myMaxY >= notMinY && myMaxY <= notMaxY);
        boolean myZinside = (myMinZ >= notMinZ && myMinZ <= notMaxZ) || (myMaxZ >= notMinZ && myMaxZ <= notMaxZ);
        if(myXInside && myYInside && myZinside) return true;
        
        boolean notXInside = (notMinX >= myMinX && notMinX <= myMaxX) || (notMaxX >= myMinX && notMaxX <= myMaxX);
        boolean notYInside = (notMinY >= myMinY && notMinY <= myMaxY) || (notMaxY >= myMinY && notMaxY <= myMaxY);
        boolean notZInside = (notMinZ >= myMinZ && notMinZ <= myMaxZ) || (notMaxZ >= myMinZ && notMaxZ <= myMaxZ);
        if(notXInside && notYInside && notZInside) return true;
        
        return false;
    }
}
