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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public class DynamicFace implements Face {
    private List<Vertice> verts = new ArrayList<Vertice>();
    private List<Normal> norms = new ArrayList<Normal>();
    private List<TextureCoordinate> textCoords = new ArrayList<TextureCoordinate>();
    private Location location = new Location();
    
    public DynamicFace() {
        super();
    }
    
    public DynamicFace(Face face) {
        this();
        this.verts = new ArrayList<Vertice>(face.getVertices());
        this.norms = new ArrayList<Normal>(face.getNormals());
        this.textCoords = new ArrayList<TextureCoordinate>(face.getTextureCoordinates());
        this.location = face.getLocation().clone();
    }
    
    @Override public List<Vertice> getVertices() {return new ArrayList<Vertice>(verts);}
    @Override public List<Normal> getNormals() {return new ArrayList<Normal>(norms);}
    @Override public List<TextureCoordinate> getTextureCoordinates() {return new ArrayList<TextureCoordinate>(this.textCoords);}
    @Override public Location getLocation() {return this.location;}
    
    @Override public void setLocation(Location l) {this.location = l.clone();}

    @Override public void addVertice(Vertice vert) {this.verts.add(vert);}
    @Override public void addNormal(Normal norm) {this.norms.add(norm);}
    @Override public void addTextureCoordinate(TextureCoordinate textCoord) {this.textCoords.add(textCoord);}

    @Override public void removeVertice(Vertice vert) {this.verts.remove(vert);}
    @Override public void removeNormal(Normal norm) {this.norms.remove(norm);}
    @Override public void removeTextureCoordinate(TextureCoordinate textCoord) {this.textCoords.remove(textCoord);}

    @Override
    public Face clone() {
        return new DynamicFace(this);
    }
}
