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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public class SimpleSolid implements Solidable {
    private List<BoundingBox> boundingBoxes;
    private boolean solid;
    
    public SimpleSolid() {
        super();
    }
    
    @Override public List<BoundingBox> getBoundingBoxes() {return new ArrayList<BoundingBox>(this.boundingBoxes);}
    
    @Override public void setSolid(boolean t) {this.solid = t;}

    @Override public boolean isSolid() {return this.solid;}

    @Override
    public boolean isHitting(Solidable solid) {
        for(BoundingBox bb : solid.getBoundingBoxes()) {
            if(!this.isHitting(bb)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isHitting(BoundingBox box) {
        for(BoundingBox bb : this.getBoundingBoxes()) {
            if(!bb.isIn(box)) continue;
            return true;
        }
        return false;
    }

    @Override public void addBoundingBox(BoundingBox box) {this.boundingBoxes.add(box);}

    @Override public void removeBoundingBox(BoundingBox box) {this.boundingBoxes.remove(box);}
}
