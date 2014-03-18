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

package com.domsplace.FaultEngine;

/**
 *
 * @author Dominic Masters
 */
public final class CloseReason {
    public static final CloseReason CLOSE_BUTTON_PRESSED = new CloseReason("Close Button Pressed");
    public static final CloseReason ERROR = new CloseReason("Error");
    public static final CloseReason CLOSE_REQUESTED = new CloseReason("Close Requested");
    
    //Instance
    private final String reason;
    
    private CloseReason(String reason) {
        this.reason = reason;
    }
    
    public String getReason() {return this.reason;}
}
