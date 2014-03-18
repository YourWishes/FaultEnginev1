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

/**
 *
 * @author Dominic Masters
 */
public class EmptyModel extends SimpleModel {
    public EmptyModel() {
        super();
    }
    
    public EmptyModel(Model model) {
        super(model);
    }   
    
    @Override
    public void renderMesh() {
        //Do Nothing, this CANNOT have a mesh!
    }

    @Override
    public EmptyModel clone() {
        return new EmptyModel(this);
    }

    @Override
    public void init() {
        for(Model m : this.getChildren()) {
            m.init();
        }
    }

    @Override
    public void dispose() {
        for(Model m : this.getChildren()) {
            m.dispose();
        }
    }
}
