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

package com.domsplace.FaultEngine.Model.Material;

import com.domsplace.FaultEngine.Display.Color;
import com.domsplace.FaultEngine.Model.Material.Texture.Texture;

/**
 *
 * @author Dominic Masters
 */
public class SimpleMaterial implements Material {
    private String name;
    
    private Color color = new Color(1,1,1,1);
    
    private float outlineThickness = 3.0f;
    private Color outlineColor = new Color(0,0,0);
    private boolean enableOutline = false;
    
    private Color diffuse = Color.WHITE.clone();
    private Color ambient = Color.BLACK.clone();
    private Color specular = Color.WHITE.clone();
    
    private Texture texture;
    
    public SimpleMaterial() {
    }
    
    @Override public Color getColor() {return this.color;}
    @Override public float getOutlineThickness() {return this.outlineThickness;}
    @Override public Color getOutlineColor() {return this.outlineColor;}
    @Override public boolean getOutlined() {return this.enableOutline;}
    @Override public Texture getTexture() {return this.texture;}
    @Override public boolean getTextured() {return this.texture != null && this.texture.isLoaded();}
    @Override public String getName() {return this.name;}
    @Override public Color getDiffuse() {return this.diffuse;}
    @Override public Color getAmbient() {return this.ambient;}
    @Override public Color getSpecular() {return this.specular;}
    
    @Override public void setColor(Color c) {this.color = c.clone();}
    @Override public void setOutlineThickness(float t) {this.outlineThickness = t;}
    @Override public void setOutlineColor(Color c) {this.outlineColor = c.clone();}
    @Override public void setOutlined(boolean i) {this.enableOutline = i;}
    @Override public void setTexture(Texture t) {this.texture = t;}
    @Override public void setName(String name) {this.name = name;}
    @Override public void setDiffuse(Color c) {this.diffuse = c.clone();}
    @Override public void setAmbient(Color c) {this.ambient = c.clone();}
    @Override public void setSpecular(Color c) {this.specular = c.clone();}

    @Override
    public Material clone() {
        Material m = this;
        SimpleMaterial mat = new SimpleMaterial();
        mat.color = m.getColor().clone();
        mat.outlineThickness = m.getOutlineThickness();
        mat.outlineColor = m.getOutlineColor().clone();
        mat.enableOutline = m.getOutlined();
        mat.texture = m.getTexture();
        return mat;
    }
}
