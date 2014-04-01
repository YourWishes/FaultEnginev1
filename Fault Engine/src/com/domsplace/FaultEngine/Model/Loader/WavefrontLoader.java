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
import com.domsplace.FaultEngine.Model.Material.Loader.MaterialLoader;
import com.domsplace.FaultEngine.Model.Material.Material;
import com.domsplace.FaultEngine.Model.Material.Texture.TextureCoordinate;
import com.domsplace.FaultEngine.Model.Model;
import com.domsplace.FaultEngine.Model.Normal;
import com.domsplace.FaultEngine.Model.Primitives.Quad;
import com.domsplace.FaultEngine.Model.Vertice;
import com.domsplace.FaultEngine.Utilities.FileUtilities;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public class WavefrontLoader extends ModelLoader {
    public int BAD_ID = 0;
    
    @Override
    public Model loadModel(String data, Class<? extends Model> modelType, Class<? extends Face> faceType, Class<? extends Material> materialType) throws Exception {
        String[] lines = removeBlankElements(data.replaceAll("\r","\n").split("\n"));
        
        Model topModel = this.createModelFromClass(modelType);
        Model m = topModel;
        
        List<Vertice> loadedVertices = new ArrayList<Vertice>();
        List<TextureCoordinate> loadedTextureCoords = new ArrayList<TextureCoordinate>();
        List<Normal> loadedNormals = new ArrayList<Normal>();
        List<Material> loadedMaterials = new ArrayList<Material>();
        
        for(int i = 0; i < lines.length; i++) {
            String line = lines[i];
            
            BAD_ID = i;
            
            if(line.startsWith("o")) {
                line = getLine(line, "o");
                m = this.createModelFromClass(modelType);
                m.setMaterial(topModel.getMaterial());
                topModel.addChild(m);
            }
            
            if(line.startsWith("mtllib")) {
                line = getLine(line, "mtllib");
                //Try and Get File
                File expectingFile = new File(line);
                List<Material> materials = new ArrayList<Material>();
                if(expectingFile.exists()) {
                    materials.addAll(MaterialLoader.WAVEFRONT_LOADER.loadMaterials(FileUtilities.loadFileToString(expectingFile), materialType));
                }
                try {
                    materials.addAll(MaterialLoader.WAVEFRONT_LOADER.loadMaterials(FileUtilities.getResourceAsString(line), materialType));
                } catch(Throwable t) {}
                loadedMaterials.addAll(materials);
            }
            
            if(line.startsWith("usemtl")) {
                line = getLine(line, "usemtl");
                Material mt = null;
                for(Material mat : loadedMaterials) {
                    if(!mat.getName().equals(line)) continue;
                    mt = mat;
                }
                if(mt != null) m.setMaterial(mt);
            }
            
            if(line.startsWith("vt")) {
                line = getLine(line, "vt");
                String[] coords = removeBlankElements(line.split(" "));
                TextureCoordinate tc = new TextureCoordinate(Float.parseFloat(coords[0]),Float.parseFloat(coords[1]));
                loadedTextureCoords.add(tc);
                continue;
            }
            
            if(line.startsWith("vn")) {
                line = getLine(line, "vn");
                String[] coordinates = removeBlankElements(line.split(" "));
                Normal n = new Normal();
                n.set(Float.parseFloat(coordinates[0]),Float.parseFloat(coordinates[1]),Float.parseFloat(coordinates[2]));
                loadedNormals.add(n);
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
                
                List<Vertice> selectedVertices = new ArrayList<Vertice>();
                List<Normal> selectedNormals = new ArrayList<Normal>();
                List<TextureCoordinate> selectedTextureCoordinates = new ArrayList<TextureCoordinate>();
                
                for(int index = 0; index < vertIndexs.length; index++ ) {
                    String indexLine = vertIndexs[index];
                    
                    Vertice selectedVertice = null;
                    Normal selectedNormal = null;
                    TextureCoordinate selectedTextureCoordinate = null;
                    
                    if(indexLine.contains("//")) {
                        //Form of v1//vn1
                        String[] parts = indexLine.split("//");
                        selectedVertice = loadedVertices.get(Integer.valueOf(parts[0]) - 1);
                        selectedNormal = loadedNormals.get(Integer.valueOf(parts[1]) - 1);
                    } else if(indexLine.contains("/")) {
                        String[] requesting = indexLine.split("/");
                        
                        if(requesting.length == 2) {
                            //Form of v1/vt1
                            selectedVertice = loadedVertices.get(Integer.valueOf(requesting[0]) - 1);
                            selectedTextureCoordinate = loadedTextureCoords.get(Integer.valueOf(requesting[1]) - 1);
                        } else if(requesting.length == 3) {
                            //Form of v1/vt1/vn1
                            selectedVertice = loadedVertices.get(Integer.valueOf(requesting[0]) - 1);
                            selectedTextureCoordinate = loadedTextureCoords.get(Integer.valueOf(requesting[1]) - 1);
                            selectedNormal = loadedNormals.get(Integer.valueOf(requesting[2]) - 1);
                        }
                    } else {
                        //PURE VERTICE GETTING
                        selectedVertice = loadedVertices.get(Integer.valueOf(indexLine)-1);
                    }
                    
                    //Now to add these things to the face
                    if(selectedVertice != null) selectedVertices.add(selectedVertice);
                    if(selectedNormal != null) selectedNormals.add(selectedNormal);
                    if(selectedTextureCoordinate != null) selectedTextureCoordinates.add(selectedTextureCoordinate);
                }
                
                //Create a Face
                if(selectedVertices.size() == 3) {
                    //This is a triangle (yay)
                    Face f = this.createFaceFromClass(faceType);
                    for(int index = 0; index < selectedVertices.size(); index++) {
                        try {f.addVertice(selectedVertices.get(index));}catch(Throwable t) {}
                        try {f.addNormal(selectedNormals.get(index));}catch(Throwable t) {}
                        try {f.addTextureCoordinate(selectedTextureCoordinates.get(index));}catch(Throwable t) {}
                    }
                    m.addFace(f);
                } else if(selectedVertices.size() == 4) {
                    //Convert to Triangle and add
                    Quad quad = new Quad();
                    
                    quad.setVert0(selectedVertices.get(0));
                    quad.setVert1(selectedVertices.get(1));
                    quad.setVert2(selectedVertices.get(2));
                    quad.setVert3(selectedVertices.get(3));
                    
                    try {quad.setTextureCoordinate0(selectedTextureCoordinates.get(0));}catch(Throwable t) {}
                    try {quad.setTextureCoordinate1(selectedTextureCoordinates.get(1));}catch(Throwable t) {}
                    try {quad.setTextureCoordinate2(selectedTextureCoordinates.get(2));}catch(Throwable t) {}
                    try {quad.setTextureCoordinate3(selectedTextureCoordinates.get(3));}catch(Throwable t) {}
                    
                    try {quad.setNormal0(selectedNormals.get(0));}catch(Throwable t) {}
                    try {quad.setNormal1(selectedNormals.get(1));}catch(Throwable t) {}
                    try {quad.setNormal2(selectedNormals.get(2));}catch(Throwable t) {}
                    try {quad.setNormal3(selectedNormals.get(3));}catch(Throwable t) {}
                    
                    m.addFaces(quad.toQuadArray());
                } else {
                    //Something that isn't a quad or a triangle?
                }
            }
        }
        
        //Logging
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
            if(p.replaceAll("\n", "").equals("")) continue;
            if(p.replaceAll("\r", "").equals("")) continue;
            cleanParts.add(p);
        }
        
        return cleanParts.toArray(new String[cleanParts.size()]);
    }
}
