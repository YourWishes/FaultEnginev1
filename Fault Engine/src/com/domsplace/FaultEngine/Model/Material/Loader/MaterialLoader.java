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
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public abstract class MaterialLoader {
    public static final MaterialLoader WAVEFRONT_LOADER = new WavefrontMaterialLoader();
    
    //Instance
    public MaterialLoader() {
        
    }
    
    public abstract List<Material> loadMaterials(String data, Class<? extends Material> materialType) throws Exception;
    
    public Material createMaterialFromClass(Class<? extends Material> clazz) throws Exception {
        Object o = clazz.newInstance();
        return (Material) o;
    }
}
