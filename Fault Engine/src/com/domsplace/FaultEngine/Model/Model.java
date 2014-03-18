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

package com.domsplace.FaultEngine.Model;

import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Material.Material;
import com.domsplace.FaultEngine.Shader.ShaderProgram;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public interface Model {
    public Location getLocation();
    public Location getPivotLocation();
    public Material getMaterial();
    public List<Face> getFaces();
    public List<Model> getChildren();
    public Model getParent();
    public void removeFromParent();
    public double getScaleX();
    public double getScaleY();
    public double getScaleZ();
    public ShaderProgram getShaderProgram();
    
    public void addFace(Face face);
    public void addFaces(List<? extends Face> face);
    public void addFaces(Face[] face);
    public void addChild(Model m);
    
    public void removeChild(Model m);
    
    public void setParent(Model m);
    public void setMaterial(Material m);
    public void setScaleX(double x);
    public void setScaleY(double y);
    public void setScaleZ(double z);
    public void setScale(double s);
    public void setShaderProgram(ShaderProgram shaderProgram);
    
    public void init();
    public void dispose();
    public void render();
    public void renderMesh();
    
    public Model clone();
}
