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

package com.domsplace.FaultEngine.Display.Camera;

import com.domsplace.FaultEngine.Location.Location;

/**
 *
 * @author Dominic Masters
 */
public interface Camera {
    public int getWidth();
    public int getHeight();
    public double getFOV();
    public Location getLocation();
    
    public void setFOV(double zoom);
    public void setLocation(Location location);
    
    public void lookAt(Location location);
    
    public void panForward(double amt);
    public void panBackwards(double amt);
    public void panLeft(double amt);
    public void panRight(double amt);
    
    public void apply();
    public void reset();
}
