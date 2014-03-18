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

package com.domsplace.FaultEngine;

import com.domsplace.FaultEngine.Scene.Scene;
import org.lwjgl.opengl.Display;

/**
 *
 * @author Dominic Masters
 */
public class GameThread implements Runnable {
    private final Thread thread;
    private long lastTick = 0L;
    
    public GameThread() {
        this.thread = new Thread(this);
    }
    
    public Thread getThread() {return this.thread;}
    
    @Override
    public void run() {
        boolean run = true;
        try {run = !Display.isCloseRequested();} catch(Exception e) {}
        while(run) {
            long now = System.currentTimeMillis();
            if(now - lastTick > 16) {
                lastTick = now;
                Scene.ACTIVE_SCENE.tick();
            }
        }
    }
}
