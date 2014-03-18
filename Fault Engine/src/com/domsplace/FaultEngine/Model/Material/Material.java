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
public interface Material {
    public Color getColor();
    public float getOutlineThickness();
    public Color getOutlineColor();
    public boolean getOutlined();
    public Texture getTexture();
    public boolean getTextured();
    public String getName();
    public Color getDiffuse();
    public Color getAmbient();
    public Color getSpecular();
    
    public void setColor(Color c);
    public void setOutlineThickness(float t);
    public void setOutlineColor(Color c);
    public void setOutlined(boolean i);
    public void setTexture(Texture t);
    public void setName(String name);
    public void setDiffuse(Color c);
    public void setAmbient(Color c);
    public void setSpecular(Color c);
    
    public Material clone();
}
