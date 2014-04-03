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

package com.domsplace.FaultEngine.Frames;

import com.domsplace.FaultEngine.CloseReason;
import com.domsplace.FaultEngine.Game;
import java.awt.Canvas;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 *
 * @author Dominic Masters
 */
public class GameFrame extends JFrame {
    private final WindowAdapter windowAdapter;
    public Canvas gameCanvas;
    
    public GameFrame(String name) {
        super(name);
        gameCanvas = new Canvas();
        this.windowAdapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                boolean t = Game.GAME_INSTANCE.close(CloseReason.CLOSE_BUTTON_PRESSED);
                if(t) return;
                super.windowClosing(e);
            }
        };

        this.addWindowListener(this.windowAdapter);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }
    
    public void close() {
        WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
        setVisible(false);
        dispose();
    }
}
