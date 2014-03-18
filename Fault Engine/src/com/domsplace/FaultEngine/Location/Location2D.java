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

/**
 *
 * @author Dominic Masters
 */
public class Location2D {
    private double x;
    private double y;
    
    private double rotation;
    
    public Location2D() {
        this(0,0);
    }
    
    public Location2D(double x, double y) {
        this(x,y,0);
    }
    
    public Location2D(double x, double y, double rotation) {
        this.x = x;
        this.y = y;
        this.rotation = rotation;
    }
    
    public double getX() {return this.x;}
    public double getY() {return this.y;}
    
    public float getFloatX() {return (float)this.x;}
    public float getFloatY() {return (float)this.y;}
    
    public int getIntX() {return (int)this.x;}
    public int getIntY() {return (int)this.y;}
    
    public double getRotation() {return this.rotation;}
    
    public Location2D setX(double x) {this.x = x; return this;}
    public Location2D setY(double y) {this.y = y; return this;}
    
    public Location2D setRotation(double rotation) {this.rotation = rotation; return this;}
    
    public Location2D addX(double x) {this.x += x; return this;}
    public Location2D addY(double y) {this.y += y; return this;}
    
    public Location2D addX(float x) {this.x += x; return this;}
    public Location2D addY(float y) {this.y += y; return this;}
    
    public Location2D addX(int x) {this.x += x; return this;}
    public Location2D addY(int y) {this.y += y; return this;}
    
    public Location2D subX(double x) {this.x -= x; return this;}
    public Location2D subY(double y) {this.y -= y; return this;}
    
    public Location2D set(double x, double y) {this.x = x; this.y = y; return this;}
    public Location2D set(float x, float y) {this.x = x; this.y = y; return this;}
    public Location2D set(int x, int y) {this.x = x; this.y = y; return this;}
}
