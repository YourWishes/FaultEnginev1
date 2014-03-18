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

import com.domsplace.FaultEngine.Display.DisplayManager;
import com.domsplace.FaultEngine.Frames.GameFrame;
import com.domsplace.FaultEngine.LWJGL.LWJGLLibrary;
import com.domsplace.FaultEngine.Logging.GameLogger;
import com.domsplace.FaultEngine.Scene.Scene;
import com.domsplace.FaultEngine.Settings.GameSettings;
import com.domsplace.FaultEngine.System.GameSystem;
import com.domsplace.FaultEngine.Utilities.FileUtilities;
import static com.domsplace.FaultEngine.Utilities.TimeUtilities.getNow;
import java.awt.HeadlessException;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dominic Masters
 */
public abstract class Game {
    public static Game GAME_INSTANCE;
    
    private final String name;
    private final Class launcher;
    private final GameFrame gameFrame;
    private boolean askToClose = true;
    private long launchTime;
    public final double version;
    
    private GameLogger logger;
    private final GameSettings settings;
    private final GameThread thread;
    private final DisplayManager displayManager;
    
    public Game(final String name, final double version, final Class launcher) throws UnsupportedOperationException {
        if(GAME_INSTANCE != null) throw new UnsupportedOperationException("Game already set");
        GAME_INSTANCE = this;
        
        GameFrame frame;
        try {frame = new GameFrame(name);} catch(HeadlessException e) {frame = null;}
        this.gameFrame = frame;
        
        this.name = name;
        this.version = version;
        this.launcher = launcher;
        this.launchTime = getNow();
        
        this.logger = new GameLogger();
        this.settings = new GameSettings();
        this.thread = new GameThread();
        this.displayManager = new DisplayManager();
    }
    
    public String getName() {return this.name;}
    public Class getLauncher() {return this.launcher;}
    public GameFrame getGameFrame() {return this.gameFrame;}
    public GameSystem getCurrentSystem() {return GameSystem.getCurrentSystem();}
    public boolean getShouldAskToClose() {return this.askToClose;}
    public long getLaunchTime() {return this.launchTime;}
    public GameLogger getLogger() {return this.logger;}
    public DisplayManager getDisplayManager() {return this.displayManager;}
    public GameSettings getGameSettings() {return this.settings;}
    public GameThread getThread() {return this.thread;}
    public Scene getScene() {return Scene.ACTIVE_SCENE;}
    public abstract File getDataFolder();
    
    public void setShouldAskToClose(boolean t) {this.askToClose = t;}
    public void setGameLogger(GameLogger logger) {this.logger = logger;}
    
    public void start() {
        this.logger.log("Starting " + this.getName() + " on a " + 
                this.getCurrentSystem().getArchitecture().getName() + " " + 
                this.getCurrentSystem().getOperatingSystem().getName() + " system.");
    }
    
    public void showWarning(String title, String message) {
        if(!this.getCurrentSystem().isGUICompatible() || this.gameFrame == null) {
            System.out.println("|==" + title + "==|");
            System.out.println("|" + message + "|");
        } else {
            if(!this.gameFrame.isVisible()) this.gameFrame.setVisible(true);
            JOptionPane.showMessageDialog(gameFrame, message, title, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean close(CloseReason reason) {
        if(this.gameFrame != null && this.askToClose) {
            int res = JOptionPane.showConfirmDialog(this.gameFrame, "Are you sure you want to close?", "Really Quit?", JOptionPane.YES_NO_OPTION);
            if (res != 0) {
                return false;
            }
        }
        this.forceClose(reason);
        return true;
    }
    
    public void forceClose(CloseReason reason) {
        try {this.thread.getThread().interrupt();} catch(Throwable t) {}
        try {this.displayManager.destroy();} catch(Throwable t) {}
        for(InputStream is : new ArrayList<InputStream>(FileUtilities.OPEN_STREAMS)) {
            try {is.close();} catch(Throwable e) {}
        }
        System.exit(0);
    }
    
    public void installLWJGL() throws Exception {
        List<LWJGLLibrary> libs = this.getCurrentSystem().getLWJGLLibraries();
        for(LWJGLLibrary lib : libs) {
            lib.saveToFile();
        }
    }
    
    public void tick() {
        //Tick
    }

    public void crash(Throwable t) {
        this.getLogger().log(t);
        if(this.getGameFrame() != null) this.getGameFrame().close();
        this.forceClose(CloseReason.ERROR);
        this.showWarning("Error", "An error occured!");
    }
}
