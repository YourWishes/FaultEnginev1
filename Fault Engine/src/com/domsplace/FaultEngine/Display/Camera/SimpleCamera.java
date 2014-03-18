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
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.*;

/**
 *
 * @author Dominic Masters
 */
public class SimpleCamera implements Camera {
    //TODO: Make Render Distance Dynamic
    public static final int INSERT_RENDER_DISTANCE = 10*50;
    
    private Location location = new Location();
    private Location target = new Location();
    private double fov = 45;
    
    public SimpleCamera() {
        this.getLocation().setZ(10);
    }
    
    @Override public double getFOV() {return this.fov;}
    @Override public int getWidth() {return Game.GAME_INSTANCE.getGameFrame().gameCanvas.getWidth();}
    @Override public int getHeight() {return Game.GAME_INSTANCE.getGameFrame().gameCanvas.getHeight();}
    @Override public Location getLocation() {return location;}
    public Location getTarget() {return this.target;}
    
    public double getAspectRatio() {
        return ((double) this.getWidth()) / ((double) this.getHeight());
    }
    
    @Override public void setFOV(double fov) {this.fov = fov;}
    @Override public void setLocation(Location location) {this.location = location;}
    
    @Override
    public void lookAt(Location location) {
        this.target = location.clone();
    }   
    
    public double getYaw(Location target) {
        Location l = this.getLocation();
        double dX = l.getX() - target.getX();
        double dY = l.getY() - target.getY();
        double dZ = l.getZ() - target.getZ();
        double yaw = Math.atan2(dZ, dX);
        double deg = Math.toDegrees(yaw);
        return deg;
    }
    
    public double getPitch(Location target) {
        Location l = this.getLocation();
        double dX = l.getX() - target.getX();
        double dY = l.getY() - target.getY();
        double dZ = l.getZ() - target.getZ();
        double pitch = Math.atan2(Math.sqrt(dZ * dZ + dX * dX), dY) + Math.PI;
        double deg = Math.toDegrees(pitch);
        return deg;
    }
    
    @Override
    public void apply() {
        glViewport(0,0,this.getWidth(), this.getHeight());
        
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        
        float x = this.getLocation().getFloatX();
        float y = this.getLocation().getFloatY();
        float z = this.getLocation().getFloatZ();
        
        gluPerspective((float)this.fov, (float) this.getAspectRatio(), 1, 1000);

        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        
        float div = 1f;
        float ld = 1f;
        gluLookAt(this.getLocation().getFloatX()/ld, this.getLocation().getFloatY()/ld, this.getLocation().getFloatZ()/ld,this.target.getFloatX()/div, this.target.getFloatY()/div, this.target.getFloatZ()/div,0,1,0);
        //this.getLocation().applyTranslations(true, false);
    }

    @Override
    public void panForward(double amt) {
        throw new UnsupportedOperationException("Not Done yet");
    }

    @Override
    public void panBackwards(double amt) {
        panForward(-amt);
    }

    @Override
    public void panLeft(double amt) {
        throw new UnsupportedOperationException("Not Done yet");
    }

    @Override
    public void panRight(double amt) {
        panLeft(-amt);
    }
}
