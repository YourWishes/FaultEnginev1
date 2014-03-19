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

package com.domsplace.FaultEngine.Location;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

/**
 *
 * @author Dominic Masters
 */
public class Location3D extends Location2D {
    private double z;
    
    private double pitch;
    private double yaw;
    
    public Location3D() {
        this(0,0,0);
    }
    
    public Location3D(Vector3f vector) {
        this(vector.x, vector.y, vector.z);
    }
    
    public Location3D(Location3D location) {
        this(location.getX(), location.getY(), location.z, location.pitch, location.yaw, location.getRoll());
    }
    
    public Location3D(double x, double y, double z) {
        this(x,y,z,0,0,0);
    }
    
    public Location3D(double x, double y, double z, double pitch, double yaw, double roll) {
        this.setX(x);
        this.setY(y);
        this.z = z;
        
        this.pitch = pitch;
        this.yaw = yaw;
        this.setRoll(roll);
    }
    
    public double getZ() {return this.z;}
    
    public float getFloatZ() {return (float)this.z;}
    
    public int getIntZ() {return (int)this.z;}
    
    public double getPitch() {return this.pitch;}
    public double getYaw() {return this.yaw;}
    public double getRoll() {return this.getRotation();}
    
    public Vector3f getVector() {return new Vector3f((float)this.getX(), (float)this.getY(), (float)this.z);}
    
    public Location3D setZ(double z) {this.z = z; return this;}
    
    public Location3D setZ(float z) {this.z = z; return this;}
    
    public Location3D setZ(int z) {this.z = z; return this;}
    
    public Location3D setPitch(double pitch) {this.pitch = pitch; return this;}
    public Location3D setYaw(double yaw) {this.yaw = yaw; return this;}
    public Location3D setRoll(double roll) {this.setRotation(roll); return this;}
    
    public Location3D addZ(double z) {this.z += z; return this;}
    
    public Location3D addZ(float z) {this.z += z; return this;}
    
    public Location3D addZ(int z) {this.z += z; return this;}
    
    public Location3D subZ(double z) {this.z -= z; return this;}
    
    public Location3D addYaw(double yaw) {this.yaw += yaw; return this;}
    public Location3D addPitch(double pitch) {this.pitch += pitch; return this;}
    public Location3D addRoll(double roll) {this.setRoll(this.getRoll() + roll); return this;}
    
    public Location3D set(double x, double y, double z) {this.set(x,y); this.z = z; return this;}
    public Location3D set(float x, float y, float z) {this.set(x,y); this.z = z; return this;}
    public Location3D set(int x, int y, int z) {this.set(x,y); this.z = z; return this;}
    
    public Location3D set(Location3D l) {
        this.setX(l.getX());
        this.setY(l.getY());
        this.setZ(l.getZ());
        this.setYaw(l.getYaw());
        this.setPitch(l.getPitch());
        this.setRoll(l.getRoll());
        return this;
    }
    
    public Location3D subtract(Location3D t) {
        this.subX(t.getX());
        this.subY(t.getY());
        this.subZ(t.getZ());
        return this;
    }

    public Location3D add(Location diff) {
        this.addX(diff.getX());
        this.addY(diff.getY());
        this.addZ(diff.getZ());
        return this;
    }
    
    public Location3D clone() {return new Location3D(this);}
    
    public void applyTranslations() {
        this.applyTranslations(false, false);
    }
    
    public void applyTranslations(boolean invertCoords, boolean invertRotations) {
        float x = this.getFloatX();
        float y = this.getFloatY();
        float z = this.getFloatZ();
        float p = (float) this.pitch;
        float ya = (float) this.yaw;
        float r = (float) this.getRotation();
        
        if(invertCoords) {
            x = -x;
            y = -y;
            z = -z;
        }
        
        if(invertRotations) {
            p = -p;
            ya = -ya;
            r = -r;
        }
        
        GL11.glTranslatef(x,y,z);
        GL11.glRotatef(p, 1, 0, 0);
        GL11.glRotatef(ya, 0, 1, 0);
        GL11.glRotatef(r, 0, 0, 1);
    }
    
    public FloatBuffer asFloatBuffer() {
        float[] d = new float[] {this.getFloatX(), this.getFloatY(), this.getFloatZ(), 1.0f};
        FloatBuffer fb = BufferUtils.createFloatBuffer(d.length);
        fb.put(d);
        fb.flip();
        return fb;
    }
    
    public Location3D getRelative(double x, double y, double z) {
        Location3D c = this.clone();
        return (Location3D)c.addZ(z).addY(y).addX(x);
    }
    
    public Location3D getRelativeInFacingDirection(double xzDistance, double yDistance, double offset) {//May not be thread safe
        Location3D l = this.clone();
        l.addX(xzDistance *  Math.sin(Math.toRadians(this.getYaw() + offset)));
        l.subY(yDistance * Math.tan(Math.toRadians(this.getPitch())));//Need to make a 2D only method
        l.addZ(xzDistance * Math.cos(Math.toRadians(this.getYaw() + offset)));
        return l;
    }
    
    public Location3D getRelativeInFacingDirection(double distance, double offset) {//May not be thread safe
        return this.getRelativeInFacingDirection(distance, distance, offset);
    }
    
    public Location3D getRelativeInFacingDirection(double distance) {//May not be thread safe
        return this.getRelativeInFacingDirection(distance, 0);
    }
}
