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

package com.domsplace.FaultEngine.Model.Material.Texture;

import com.domsplace.FaultEngine.Location.Coordinate2D;

/**
 *
 * @author Dominic Masters
 */
public class TextureCoordinate extends Coordinate2D {
    public TextureCoordinate() {
        super(0,0);
    }
    
    public TextureCoordinate(double x, double y) {
        super(x,y,0);
    }
    
    public TextureCoordinate(double x, double y, double rotation) {
        super(x,y,rotation);
    }
    
}
