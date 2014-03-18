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

package com.domsplace.FaultEngine.Settings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public class GameSettings {
    public List<Setting> settings = new ArrayList<Setting>();
    
    public GameSettings() {}
    
    public List<Setting> getSettings() {return new ArrayList<Setting>(this.settings);}
    public void addSetting(Setting setting) {this.settings.add(setting);}
    public void removeSetting(Setting setting) {this.settings.remove(setting);}
    
    public Setting getSetting(String key) {return getSetting(key, null);}
    public Setting getSetting(String key, Object defaultValue) {
        Setting setting = null;
        for(Setting set : settings) {
            if(!set.getKey().equalsIgnoreCase(key)) continue;
            setting = set;
            break;
        }
        
        if(setting == null) setting = new Setting(key, defaultValue);
        if(!this.settings.contains(setting)) this.settings.add(setting);
        return setting;
    }
    
    public Setting setSetting(String key, Object value) {return getSetting(key).setValue(value);}
}
