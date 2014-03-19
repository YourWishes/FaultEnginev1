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

package samples.FacingSample;

import com.domsplace.FaultEngine.Controller.Controller;
import com.domsplace.FaultEngine.Controller.ModelController;
import com.domsplace.FaultEngine.Display.Color;
import com.domsplace.FaultEngine.Entity.ControllableEntity;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Primitives.Cube;
import org.lwjgl.input.Keyboard;
import sample.SampleApplication;
import samples.SolidSample.SolidSample;

/**
 *
 * @author Dominic Masters
 */
public class FacingSample extends SampleApplication {
    public static void main(String[] args) {
        Game game = new FacingSample();
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
    
    public FacingSample() {
        super("Facing Sample", 1.00, FacingSample.class);
    }
    
    @Override
    public void drawScene() {
        ControllableEntity ce = new ControllableEntity(new Cube());
        this.getScene().addEntity(ce);
        
        Controller domsController = new ModelController(ce) {
            @Override
            public void tick() {
                if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
                    this.getControlling().getLocation().addYaw(-1);
                }
                if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
                    this.getControlling().getLocation().addYaw(1);
                }
                if(Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
                    this.getControlling().getLocation().addPitch(1);
                }
                if(Keyboard.isKeyDown(Keyboard.KEY_UP)) {
                    this.getControlling().getLocation().addPitch(-1);
                }
                if(Keyboard.isKeyDown(Keyboard.KEY_W)) {
                    this.getControlling().getLocation().set(this.getControlling().getLocation().getRelativeInFacingDirection(0.1));
                }
                if(Keyboard.isKeyDown(Keyboard.KEY_S)) {
                    this.getControlling().getLocation().set(this.getControlling().getLocation().getRelativeInFacingDirection(-0.1));
                }
                if(Keyboard.isKeyDown(Keyboard.KEY_A)) {
                    this.getControlling().getLocation().set(this.getControlling().getLocation().getRelativeInFacingDirection(0.1, 90));
                }
                if(Keyboard.isKeyDown(Keyboard.KEY_D)) {
                    this.getControlling().getLocation().set(this.getControlling().getLocation().getRelativeInFacingDirection(-0.1, 90));
                }
            }
        };
        ce.addController(domsController);
        
        ce.getModel().getMaterial().setColor(Color.GRAY);
        ce.getModel().getMaterial().setOutlineColor(Color.WHITE);
        
        //Draw Axis and Grid
        this.getDisplayManager().drawAxis = true;
        this.getDisplayManager().drawGrid = true;
        
        //Move Camera
        this.getScene().getCamera().setLocation(new Location(9,9,9));
    }
}
