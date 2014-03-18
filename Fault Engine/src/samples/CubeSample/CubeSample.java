/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package samples.CubeSample;

import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Primitives.Cube;
import sample.SampleApplication;

/**
 *
 * @author Dominic Masters
 */
public class CubeSample extends SampleApplication {
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
    
    public CubeSample() {
        super("Cube Sample", 1.00, CubeSample.class);
    }
    
    @Override
    public void drawScene() {
        Cube c = new Cube();
        this.getScene().addModel(c);
        
        //Draw Axis and Grid
        this.getDisplayManager().drawAxis = true;
        this.getDisplayManager().drawGrid = true;
        
        //Move Camera
        this.getScene().getCamera().setLocation(new Location(3, 3, 3));
    }
}
