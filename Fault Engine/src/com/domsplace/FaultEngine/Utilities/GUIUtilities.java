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

package com.domsplace.FaultEngine.Utilities;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Dominic Masters
 */
public class GUIUtilities {
    public static void centerJFrame(JFrame frame) {
        int width = frame.getWidth();
        int height = frame.getHeight();
        Dimension screen = getScreenSize();
        double x = ((double) screen.width / 2) - ((double) width / 2d);
        double y = ((double) screen.height / 2) - ((double) height / 2d);
        x = Math.round(x);
        y = Math.round(y);
        frame.setLocation((int)x, (int)y);
    }
    
    public static void centerObject(Component frame) throws Exception {
        int width = frame.getWidth();
        int height = frame.getHeight();
        Dimension screen = frame.getParent().getSize();
        double x = ((double) screen.width / 2) - ((double) width / 2d);
        double y = ((double) screen.height / 2) - ((double) height / 2d);
        x = Math.round(x);
        y = Math.round(y);
        frame.setLocation((int)x, (int)y);
    }
    
    public static Dimension getScreenSize() {
        return java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    }
}
