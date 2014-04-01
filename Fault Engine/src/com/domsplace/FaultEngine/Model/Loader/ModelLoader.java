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

import com.domsplace.FaultEngine.Model.Face;
import com.domsplace.FaultEngine.Model.Material.Material;
import com.domsplace.FaultEngine.Model.Model;

/**
 *
 * @author Dominic Masters
 */
public abstract class ModelLoader {
    public static final WavefrontLoader WAVEFRONT_LOADER = new WavefrontLoader();
    
    //Instance
    public ModelLoader() {
        
    }
    
    public abstract Model loadModel(String data, Class<? extends Model> modelType, Class<? extends Face> faceType, Class<? extends Material> materialType) throws Exception;
    
    public Model createModelFromClass(Class<? extends Model> clazz) throws Exception {
        Object o = clazz.newInstance();
        return (Model) o;
    }
    
    public Face createFaceFromClass(Class<? extends Face> clazz) throws Exception {
        Object o = clazz.newInstance();
        return (Face) o;
    }
}
