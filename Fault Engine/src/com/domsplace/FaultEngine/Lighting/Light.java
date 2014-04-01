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

package com.domsplace.FaultEngine.Lighting;

import com.domsplace.FaultEngine.Display.Color;
import com.domsplace.FaultEngine.Location.Location;

/**
 *
 * @author Dominic Masters
 */
public interface Light {
    public Location getLocation();
    public Color getAmbient();
    public Color getDiffuse();
    public Color getSpecular();
    
    public void setLocation(Location l);
    public void setAmbient(Color c);
    public void setDiffuse(Color c);
    public void setSpecular(Color c);
    
    public void render(int LIGHT_ID);
}
