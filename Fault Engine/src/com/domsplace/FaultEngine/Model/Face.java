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
import com.domsplace.FaultEngine.Model.Material.Texture.TextureCoordinate;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public interface Face {
    public List<Vertice> getVertices();
    public List<TextureCoordinate> getTextureCoordinates();
    public Location getLocation();
    
    public void setLocation(Location l);
    
    public void addVertice(Vertice vert);
    public void addTextureCoordinate(TextureCoordinate textCoord);
    
    public void removeVertice(Vertice vert);
    public void removeTextureCoordinate(TextureCoordinate textCoord);
    
    public Face clone();
}
