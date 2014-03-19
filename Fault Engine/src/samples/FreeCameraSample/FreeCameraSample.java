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

package samples.FreeCameraSample;

import com.domsplace.FaultEngine.Display.Camera.FreeCamera;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Primitives.Cube;
import sample.SampleApplication;

/**
 *
 * @author Dominic Masters
 */
public class FreeCameraSample extends SampleApplication {
    public static void main(String[] args) {
        Game game = new FreeCameraSample();
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
    
    public FreeCameraSample() {
        super("Cube Sample", 1.00, FreeCameraSample.class);
    }
    
    @Override
    public void drawScene() {
        Cube c = new Cube();
        this.getScene().addModel(c);
        
        //Draw Axis and Grid
        this.getDisplayManager().drawAxis = true;
        this.getDisplayManager().drawGrid = true;
        
        //Swap Camera
        this.getScene().getDisplayManager().setCamera(new FreeCamera());
        this.getScene().getCamera().setLocation(new Location(3, 3, 3));
    }
}
