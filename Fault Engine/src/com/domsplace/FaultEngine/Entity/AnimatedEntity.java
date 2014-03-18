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

import com.domsplace.FaultEngine.Animation.Animatable;
import com.domsplace.FaultEngine.Animation.Animation;
import com.domsplace.FaultEngine.Model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public class AnimatedEntity extends ModelledEntity implements Animatable {
    private List<Animation> animations = new ArrayList<Animation>();
    
    public AnimatedEntity(Model m) {
        super(m);
    }
    
    public List<Animation> getAnimations() {return new ArrayList<Animation>(this.animations);}

    @Override public void addAnimation(Animation a) {a.addAnimatableObject(this);animations.add(a);}

    @Override public void removeAnimation(Animation a) {a.removeAnimatableObject(this);animations.remove(a);}

    @Override public void onAnimateFrame(Animation a) {}
    @Override public void tick() {
        for(Animation a : this.getAnimations()) {
            a.nextFrame(this);
        }
    }
    @Override public void remove() {
        for(Animation a : this.getAnimations()) {
            this.removeAnimation(a);
        }
        super.remove();
    }
}
