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

/**
 *
 * @author Dominic Masters
 */
public class Setting {
    private String key;
    private Object value;
    
    public Setting(String key) {
        this(key, null);
    }
    
    public Setting(String key, Object value) {
        this.key = key;
        this.value = value;
    }
    
    public String getKey() {return this.key;}
    public Object getValue() {return this.value;}
    public int getValueAsInt() {return Integer.parseInt(this.value.toString());}
    public boolean getValueAsBoolean() {return ((Boolean) this.value).booleanValue();}
    
    public Setting setValue(Object value) {this.value = value; return this;}
}
