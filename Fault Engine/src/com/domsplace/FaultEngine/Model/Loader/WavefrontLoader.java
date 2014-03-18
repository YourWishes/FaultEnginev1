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

package com.domsplace.FaultEngine.Model.Loader;

import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Model.Face;
import com.domsplace.FaultEngine.Model.Material.Texture.TextureCoordinate;
import com.domsplace.FaultEngine.Model.Model;
import com.domsplace.FaultEngine.Model.Primitives.Quad;
import com.domsplace.FaultEngine.Model.Primitives.Triangle;
import com.domsplace.FaultEngine.Model.Vertice;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public class WavefrontLoader extends ModelLoader {
    public int BAD_ID = 0;
    
    @Override
    public Model loadModel(String data, Class<? extends Model> modelType, Class<? extends Face> faceType) throws Exception {
        String[] lines = data.split("\n");
        
        Model topModel = this.createModelFromClass(modelType);
        Model m = topModel;
        
        List<Vertice> loadedVertices = new ArrayList<Vertice>();
        List<TextureCoordinate> loadedTextureCoords = new ArrayList<TextureCoordinate>();
        
        for(int i = 0; i < lines.length; i++) {
            String line = lines[i];
            
            BAD_ID = i;
            
            if(line.startsWith("o")) {
                line = getLine(line, "o");
                m = this.createModelFromClass(modelType);
                m.setMaterial(topModel.getMaterial());
                topModel.addChild(m);
            }
            
            if(line.startsWith("vt")) {
                line = getLine(line, "vt");
                String[] coords = removeBlankElements(line.split(" "));
                TextureCoordinate tc = new TextureCoordinate(Float.parseFloat(coords[0]),Float.parseFloat(coords[1]));
                loadedTextureCoords.add(tc);
                continue;
            }
            
            if(line.startsWith("v")) {
                line = getLine(line, "v");
                String[] coordinates = removeBlankElements(line.split(" "));
                Vertice v = new Vertice();
                v.set(Float.parseFloat(coordinates[0]),Float.parseFloat(coordinates[1]),Float.parseFloat(coordinates[2]));
                loadedVertices.add(v);
                continue;
            }
            
            if(line.startsWith("f")) {
                line = getLine(line, "f");
                String[] vertIndexs = removeBlankElements(line.split(" "));
                
                boolean quad = vertIndexs.length == 4;
                
                if(!quad) {
                    Face f = this.createFaceFromClass(faceType);
                    for(int e = 0; e < vertIndexs.length; e++) {
                        String[] x = removeBlankElements(vertIndexs[e].split("/"));
                        Vertice v = loadedVertices.get(Integer.parseInt(x[0])-1);
                        f.addVertice(v);
                        if(x.length > 1) {
                            TextureCoordinate tc = loadedTextureCoords.get(Integer.parseInt(x[1])-1);
                            f.addTextureCoordinate(tc);
                        }
                    }
                    m.addFace(f);
                } else {
                    Triangle[] ts = Quad.createQuad();
                    Triangle bottomLeft = ts[0];
                    Triangle topRight = ts[1];
                    List<Vertice> coordinates = new ArrayList<Vertice>();
                    List<TextureCoordinate> textureCoords = new ArrayList<TextureCoordinate>();
                    for(int e = 0; e < vertIndexs.length; e++) {
                        String[] x = removeBlankElements(vertIndexs[e].split("/"));
                        Vertice v = loadedVertices.get(Integer.parseInt(x[0])-1);
                        coordinates.add(v);
                        if(x.length > 1) {
                            TextureCoordinate tc = loadedTextureCoords.get(Integer.parseInt(x[1])-1);
                            textureCoords.add(tc);
                        }
                    }
                    
                    //CLOCKWISE?                    
                    bottomLeft.setVert0(coordinates.get(0));
                    bottomLeft.setVert1(coordinates.get(1));
                    bottomLeft.setVert2(coordinates.get(2));
                    try {bottomLeft.addTextureCoordinate(textureCoords.get(0));} catch(Throwable t) {}
                    try {bottomLeft.addTextureCoordinate(textureCoords.get(1));} catch(Throwable t) {}
                    try {bottomLeft.addTextureCoordinate(textureCoords.get(2));} catch(Throwable t) {}
                    
                    topRight.setVert0(coordinates.get(2));
                    topRight.setVert1(coordinates.get(3));
                    topRight.setVert2(coordinates.get(0));
                    try {topRight.addTextureCoordinate(textureCoords.get(2));} catch(Throwable t) {}
                    try {topRight.addTextureCoordinate(textureCoords.get(3));} catch(Throwable t) {}
                    try {topRight.addTextureCoordinate(textureCoords.get(0));} catch(Throwable t) {}
                    
                    m.addFace(bottomLeft);
                    m.addFace(topRight);
                }
                continue;
            }
        }
        
        Game.GAME_INSTANCE.getLogger().log("Model loaded.");
        return topModel;
    }
    
    private String getLine(String line, String code) {
        line = line.replaceFirst(code, "");
        while(line.startsWith(" ")) line = line.replaceFirst(" ", "");
        return line;
    }
    
    private String[] removeBlankElements(String[] parts) {
        List<String> cleanParts = new ArrayList<String>();
        for(String p : parts) {
            if(p == null || p.replaceAll(" ", "").equals("")) continue;
            cleanParts.add(p);
        }
        
        return cleanParts.toArray(new String[cleanParts.size()]);
    }
}
