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

import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Location.Location;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/**
 *
 * @author Dominic Masters
 */
public class FreeCamera extends SimpleCamera {
    @Override
    public void apply() {
        double speed = 0.1;
        boolean forward = false;
        boolean backward = false;
        boolean left = false;
        boolean right = false;
        
        boolean look = false;
        
        if(Keyboard.isKeyDown(Keyboard.KEY_W) || Keyboard.isKeyDown(Keyboard.KEY_UP)) {
            forward = true;
        }
        
        if(Keyboard.isKeyDown(Keyboard.KEY_S) || Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
            backward = true;
        }
        
        if(Keyboard.isKeyDown(Keyboard.KEY_A) || Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
            left = true;
        }
        
        if(Keyboard.isKeyDown(Keyboard.KEY_D) || Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
            right = true;
        }
        
        if(forward && !backward) {
            this.panTargetForward(speed);
        } else if(backward) {
            this.panTargetBackwards(speed);
        }
        
        if(left && !right) {
            this.panTargetLeft(speed);
        } else if(right) {
            this.panTargetRight(speed);
        }
        super.apply();
    }
}
