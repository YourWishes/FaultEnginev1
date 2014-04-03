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

package com.domsplace.FaultEngine.Display;

import java.nio.FloatBuffer;
import java.util.Random;
import org.lwjgl.BufferUtils;

/**
 *
 * @author Dominic Masters
 */
public class Color {
    public static Color BLACK = Color.fromHex("#000000");
    public static Color BLUE = Color.fromHex("#0000FF");
    public static Color GREEN = Color.fromHex("#00FF00");
    public static Color WHITE = Color.fromHex("#FFFFFF");
    public static Color PINK = Color.fromHex("#FF00FF");
    public static Color GRAY = Color.fromHex("#CCCCCC");
    public static Color RED = Color.fromHex("#FF0000");
    public static Color CORNFLOWER_BLUE = Color.fromHex("#6495ED");
    public static Color YELLOW = Color.fromHex("#FFFF00");
    
    public static Color fromHex(String hex) {
        if(!hex.startsWith("#")) hex = "#" + hex;
        hex = hex.toUpperCase();
        int r = Integer.valueOf(hex.substring( 1, 3 ), 16 );
        int g = Integer.valueOf(hex.substring( 3, 5 ), 16 );
        int b = Integer.valueOf(hex.substring( 5, 7 ), 16 );
        return new Color(r,g,b);
    }

    public static Color randomColor() {
        int r = new Random().nextInt() * 255;
        int g = new Random().nextInt() * 255;
        int b = new Random().nextInt() * 255;
        return new Color(r,g,b);
    }
    
    //Instance
    public float r = 1.0f;
    public float g = 1.0f;
    public float b = 1.0f;
    public float alpha = 1.0f;
    
    public Color() {
        this(1,1,1,1);
    }
    
    public Color(int hex) {
        this((hex & 0xFF0000) >> 16, (hex & 0xFF00) >> 8, (hex & 0xFF));
    }
    
    public Color(int r, int g, int b) {
        this((float)r / 255.0f,(float)g / 255.0f,(float)b / 255.0f);
    }
    
    public Color(float r, float g, float b) {
        this(r,g,b,1);
    }
    
    public Color(Color c) {
        this(c.r, c.g, c.b, c.alpha);
    }
    
    public Color(float r, float g, float b, float alpha) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.alpha = alpha;
    }

    public Color setRed(float f) {this.r = f; return this;}
    public Color setGreen(float f) {this.g = f; return this;}
    public Color setBlue(float f) {this.b = f; return this;}
    public Color setAlpha(float f) {this.alpha = f; return this;}
    
    public boolean hasAlpha() {return this.alpha < 1.0f;}
    
    @Override
    public Color clone() {
        return new Color(this);
    }
    
    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!(o instanceof Color)) return super.equals(o);
        Color c = (Color) o;
        return c.r == this.r && c.g == this.g && c.b == this.b && c.alpha == this.alpha;
    }
    
    public FloatBuffer asFloatBuffer(float multiplier) {
        float[] d = new float[] {r*multiplier,g*multiplier,b*multiplier,alpha};
        FloatBuffer fb = BufferUtils.createFloatBuffer(d.length);
        fb.put(d);
        fb.flip();
        return fb;
    }
    
    @Override
    public String toString() {
        return this.r + "," + this.g + "," + this.b;
    }
}
