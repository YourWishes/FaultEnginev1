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

package com.domsplace.FaultEngine.Model.Material.Loader;

import com.domsplace.FaultEngine.Model.Material.Material;
import com.domsplace.FaultEngine.Model.Material.Texture.PNGTexture;
import com.domsplace.FaultEngine.Model.Material.Texture.Texture;
import de.matthiasmann.twl.utils.PNGDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public class WavefrontMaterialLoader extends MaterialLoader {
    @Override
    public List<Material> loadMaterials(String data, Class<? extends Material> materialType) throws Exception {
        String[] lines = removeBlankElements(data.replaceAll("\r", "\n").split("\n"));
        
        List<Material> mats = new ArrayList<Material>();
        Material material = null;
        
        for(int i = 0; i < lines.length; i++) {
            String line = lines[i];
            
            if(line.startsWith("newmtl")) {
                material = this.createMaterialFromClass(materialType);
                material.setName(getLine(line, "newmtl"));
                mats.add(material);
            }
            
            if(line.startsWith("map_Kd")) {
                line = getLine(line, "map_Kd");
                //Try to get Texture
                File f = new File(line);
                Texture t = null;
                if(f.exists()) {
                    try {
                        FileInputStream fis = new FileInputStream(f);
                        t = PNGTexture.loadFromInputStream(fis, PNGDecoder.Format.RGBA);
                        fis.close();
                    } catch(Throwable th) {
                        t = null;
                    }
                } else {
                    try {
                        t = PNGTexture.loadFromResource(line, PNGDecoder.Format.RGBA);
                    } catch(Throwable th) {
                        t = null;
                    }
                }
                
                if(t != null) {
                    try {
                        t.load();
                        material.setTexture(t);
                    } catch(Throwable th) {}
                }
            }
        }
        
        return mats;
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
