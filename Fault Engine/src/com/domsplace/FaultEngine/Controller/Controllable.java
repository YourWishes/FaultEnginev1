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

package com.domsplace.FaultEngine.Controller;

import com.domsplace.FaultEngine.Location.Location;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public interface Controllable {
    public List<Controller> getControllers();
    public Location getLocation();
    
    public void addController(Controller c);
    
    public void removeController(Controller c);
}
