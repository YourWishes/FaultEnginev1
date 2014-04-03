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
public class Model2D extends DynamicModel {
    public Model2D() {
        super();
        this.cullFaced = false;
        this.depthMasked = false;
        this.depthTested = false;
    }
    
    public Model2D(Model model) {
        super(model);
        this.cullFaced = false;
        this.depthMasked = false;
        this.depthTested = false;
    }

    @Override
    public Model clone() {
        return new Model2D(this);
    }
}
