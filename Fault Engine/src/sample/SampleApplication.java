/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample;

import com.domsplace.FaultEngine.CloseReason;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.LWJGL.LWJGLLibrary;
import com.domsplace.FaultEngine.Model.Primitives.Cube;
import com.domsplace.FaultEngine.Scene.Scene;
import com.domsplace.FaultEngine.Utilities.GUIUtilities;
import java.io.File;
import org.lwjgl.opengl.Display;
import static samples.CubeSample.CubeSample.DEFAULT_HEIGHT;
import static samples.CubeSample.CubeSample.DEFAULT_WIDTH;

/**
 *
 * @author Dominic Masters
 */
public class SampleApplication extends Game {
    public static final int DEFAULT_WIDTH = 960;
    public static final int DEFAULT_HEIGHT = (int)Math.round(((double)DEFAULT_WIDTH / 16d) * 9d);
    
    public SampleApplication(String name, double version, Class launcher) throws UnsupportedOperationException {
        super(name, version, launcher);
    }
    
    @Override
    public void start() {
        super.start();
        this.getGameFrame().setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        GUIUtilities.centerJFrame(this.getGameFrame());
        this.setShouldAskToClose(false);
        
        try {
            this.installLWJGL();
        } catch(Exception e) {
            this.getLogger().log(e);
            this.showWarning("Installation Error!", "Failed to install " + this.getName() + "!\nPlease try again later.");
            this.forceClose(CloseReason.ERROR);
        }
        
        System.setProperty("org.lwjgl.librarypath", LWJGLLibrary.getLibraryDirectory().getAbsolutePath());
        
        try {
            this.getDisplayManager().setupLWJGL();
        } catch(Throwable e) {
            this.getLogger().log(e);
            this.showWarning("Error!", "Failed to start " + this.getName() + "!\nPlease try again later.");
            this.forceClose(CloseReason.ERROR);
        }
        this.getGameFrame().setVisible(true);
        
        //Request scene
        Scene sampleScene = new Scene(this.getName());
        Scene.ACTIVE_SCENE = sampleScene;
        
        //Draw Scene
        this.drawScene();
        
        this.getThread().getThread().start();
        while(!Display.isCloseRequested()) {
            try {
                this.tick();
                this.getDisplayManager().update();
            } catch(Throwable t) {
                this.getLogger().log(t);
                break;
            }
        }
        this.forceClose(CloseReason.CLOSE_REQUESTED);
    }

    @Override
    public File getDataFolder() {
        return new File(System.getProperty("user.home", ""), this.getName());
    }
    
    public void drawScene() {
        //Super this
    }
}
