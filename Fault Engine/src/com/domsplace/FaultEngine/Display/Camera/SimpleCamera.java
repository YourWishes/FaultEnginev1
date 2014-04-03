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

import static com.domsplace.FaultEngine.Display.DisplayManager.*;
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
    @Override public Location getLocation() {return (Location) location.setYaw(getYaw()).setPitch(getPitch());}
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
    
    public double getYaw() {return getYaw(target);}
    public double getYaw(Location target) {
        Location l = this.location;
        double dX = l.getX() - target.getX();
        double dY = l.getY() - target.getY();
        double dZ = l.getZ() - target.getZ();
        double yaw = Math.atan2(dZ, dX);
        double deg = Math.toDegrees(yaw);
        return deg;
    }
    
    public double getPitch() {return getPitch(target);}
    public double getPitch(Location target) {
        Location l = this.location;
        double dX = l.getX() - target.getX();
        double dY = l.getY() - target.getY();
        double dZ = l.getZ() - target.getZ();
        double pitch = Math.atan2(Math.sqrt(dZ * dZ + dX * dX), dY) + Math.PI;
        double deg = Math.toDegrees(-pitch);
        return deg;
    }
    
    @Override
    public void apply() {
        glViewport(0,0,this.getWidth(), this.getHeight());
        
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        
        Location l = this.location;
        Location t = this.target;
        float x = l.getFloatX();
        float y = l.getFloatY();
        float z = l.getFloatZ();
        
        gluPerspective((float)this.fov, (float) this.getAspectRatio(), 1, Game.GAME_INSTANCE.getGameSettings().getSetting("drawDistance", 1000).getValueAsInt());

        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        
        float div = 1f;
        float ld = 1f;
        
        gluLookAt(x/ld, y/ld, z/ld,t.getFloatX()/div, t.getFloatY()/div, t.getFloatZ()/div,0,1,0);
    }

    @Override
    public void reset() {
        glViewport(0,0,this.getWidth(), this.getHeight());
        
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0.0, this.getWidth(), 0.0, this.getHeight(), -1.0, 10.0);

        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        
        disableDepthTest();
        enableDepthMask();
        glClear(GL_DEPTH_BUFFER_BIT);
        
        glLoadIdentity();
    }

    @Override
    public void panForward(double amt) {
        this.setLocation(this.getLocation().getRelativeInFacingDirection(-amt));
    }

    @Override
    public void panBackwards(double amt) {
        panForward(-amt);
    }

    @Override
    public void panLeft(double amt) {
        this.setLocation(this.getLocation().getRelativeInFacingDirection(amt, 0, -90d));
    }

    @Override
    public void panRight(double amt) {
        panLeft(-amt);
    }
    
    public void panTargetForward(double amt) {
        Location diff = this.getLocation().clone().subtract(this.target);
        this.panForward(amt);
        this.target.set(this.getLocation().clone().subtract(diff));
    }

    public void panTargetBackwards(double amt) {
        Location diff = this.getLocation().clone().subtract(this.target);
        this.panBackwards(amt);
        this.target.set(this.getLocation().clone().subtract(diff));
    }

    public void panTargetLeft(double amt) {
        Location diff = this.getLocation().clone().subtract(this.target);
        this.panLeft(amt);
        this.target.set(this.getLocation().clone().subtract(diff));
    }

    public void panTargetRight(double amt) {
        Location diff = this.getLocation().clone().subtract(this.target);
        this.panRight(amt);
        this.target.set(this.getLocation().clone().subtract(diff));
    }
}
