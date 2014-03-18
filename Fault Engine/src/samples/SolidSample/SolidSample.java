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

package samples.SolidSample;

import com.domsplace.FaultEngine.Controller.Controller;
import com.domsplace.FaultEngine.Controller.ModelController;
import com.domsplace.FaultEngine.Display.Color;
import com.domsplace.FaultEngine.Entity.ControllableEntity;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Primitives.Cube;
import com.domsplace.FaultEngine.Solid.BoundingBox;
import org.lwjgl.input.Keyboard;
import sample.SampleApplication;

/**
 *
 * @author Dominic Masters
 */
public class SolidSample extends SampleApplication {
    public static void main(String[] args) {
        Game game = new SolidSample();
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
    
    public SolidSample() {
        super("Solid Sample", 1.00, SolidSample.class);
    }
    
    public static ControllableEntity entity2;
    @Override
    public void drawScene() {
        ControllableEntity entity = new ControllableEntity(new BoundingBox());
        entity2 = new ControllableEntity(new BoundingBox());
        
        this.getScene().addEntity(entity);
        this.getScene().addEntity(entity2);
        
        entity.getModel().getMaterial().setColor(Color.fromHex("00FF00"));
        entity2.getModel().getMaterial().setColor(Color.fromHex("0000ff"));
        entity.getLocation().setX(-3);
        entity.getModel().setScale(0.5);
        
        Controller domsController = new ModelController(entity) {
            @Override
            public void tick() {
                if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
                    this.getControlling().getLocation().addX(0.1);
                }
                if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
                    this.getControlling().getLocation().subX(0.1);
                }
                if(Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
                    this.getControlling().getLocation().addZ(0.1);
                }
                if(Keyboard.isKeyDown(Keyboard.KEY_UP)) {
                    this.getControlling().getLocation().subZ(0.1);
                }
                
                if(this.getControllingEntity().isHitting(SolidSample.entity2)) {
                    this.getControllingEntity().getModel().getMaterial().setColor(Color.fromHex("FF0000"));
                } else {
                    this.getControllingEntity().getModel().getMaterial().setColor(Color.fromHex("00FF00"));
                }
            }
        };
        entity.addController(domsController);
        
        //Draw Axis and Grid
        this.getDisplayManager().drawAxis = true;
        this.getDisplayManager().drawGrid = true;
        
        //Move Camera
        this.getScene().getCamera().setLocation(new Location(3, 3, 3));
    }
}
