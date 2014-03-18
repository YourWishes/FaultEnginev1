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

package com.domsplace.FaultEngine.Animation;

import com.domsplace.FaultEngine.Game;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Dominic Masters
 */
public class Animation {
    private List<Animatable> animateableObjects = new ArrayList<Animatable>();
    private Map<Animatable, Integer> frame = new HashMap<Animatable, Integer>();
    
    public Animation() {
        
    }
    
    public List<Animatable> getAnimatableObjects() {return new ArrayList<Animatable>(this.animateableObjects);}
    public Map<Animatable, Integer> getFrames() {return new HashMap<Animatable, Integer>(this.frame);}
    public int getFrame(Animatable a) {try {return (int)frame.get(a);} catch(Throwable t) {return 0;}}
    
    public void setFrame(Animatable a, int f) {try {frame.remove(a); frame.put(a, f);} catch(Throwable t) {}}
    
    public void addAnimatableObject(Animatable o) {this.animateableObjects.add(o);}
    
    public void removeAnimatableObject(Animatable o) {this.animateableObjects.remove(o);}
    
    public void nextFrame() {
        for(Animatable a : this.getAnimatableObjects()) {   //Thread Safe
            this.nextFrame(a);
        }
    }
    
    public void nextFrame(Animatable a) {
        try {
            a.onAnimateFrame(this);
        } catch(Throwable t) {
            Game.GAME_INSTANCE.getLogger().log(t);
        }
        try {
            this.translateObject(a);
        } catch(Throwable t) {
            Game.GAME_INSTANCE.getLogger().log(t);
        }
    }
    
    public void translateObject(Animatable object) {
        this.setFrame(object, this.getFrame(object) + 1);
    }
    
    public void dispose() {
        for(Animatable a : this.getAnimatableObjects()) {
            this.removeAnimatableObject(a);
            a.removeAnimation(this);
        }
    }
    
    public Animation stop() {this.dispose(); return this;}
}
