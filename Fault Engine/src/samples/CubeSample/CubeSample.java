/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package samples.CubeSample;

import com.domsplace.FaultEngine.CloseReason;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.LWJGL.LWJGLLibrary;
import com.domsplace.FaultEngine.Model.Primitives.Cube;
import com.domsplace.FaultEngine.Scene.Scene;
import com.domsplace.FaultEngine.Utilities.GUIUtilities;
import java.io.File;
import org.lwjgl.opengl.Display;

/**
 *
 * @author Dominic Masters
 */
public class CubeSample extends Game {
    public static void main(String[] args) {
        Game game = new CubeSample();
        if(!game.getCurrentSystem().isLWJGLCompatible()) {
            game.showWarning("System not compatible!", "Your system doesn't appear to be compatbile with the LWJGL!");
            exit();
        }
        
        if(!game.getCurrentSystem().isGUICompatible() || game.getGameFrame() == null) {
            game.showWarning("System not compatible!", "Your system doesn't appear to be compatbile with Java GUI's!");
            exit();
        }
        game.start();
    }
    
    public static void exit() {
        System.exit(0);
    }
    
    //Instance
    public static final int DEFAULT_WIDTH = 960;
    public static final int DEFAULT_HEIGHT = (int)Math.round(((double)DEFAULT_WIDTH / 16d) * 9d);
    
    public CubeSample() {
        super("Cube Sample", 1.00, CubeSample.class);
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
        sampleScene.addModel(new Cube());
        getDisplayManager().drawAxis = true;
        getDisplayManager().drawGrid = true;
        sampleScene.getCamera().getLocation().set(3,3,3);
        
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
}
