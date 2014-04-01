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

package samples.LightingSample;

import com.domsplace.FaultEngine.Display.Color;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Lighting.Light;
import com.domsplace.FaultEngine.Lighting.SimpleLight;
import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.DynamicFace;
import com.domsplace.FaultEngine.Model.Loader.ModelLoader;
import com.domsplace.FaultEngine.Model.Model;
import com.domsplace.FaultEngine.Model.Primitives.*;
import com.domsplace.FaultEngine.Model.StaticModel;
import com.domsplace.FaultEngine.Scene.Scene;
import com.domsplace.FaultEngine.Utilities.FileUtilities;
import org.lwjgl.input.Keyboard;
import sample.SampleApplication;

/**
 *
 * @author Dominic Masters
 */
public class LightingSample extends SampleApplication {
    public static void main(String[] args) {
        Game game = new LightingSample();
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
    
    public LightingSample() {
        super("Lighting Sample", 1.00, LightingSample.class);
    }
    
    @Override
    public void drawScene() {
        //Create a new Scene we can override
        Scene myScene = new Scene(this.getName()) {
            @Override
            public void tick() {
                super.tick();
                
                Light l = this.getDisplayManager().getLightsList().get(0);
                double speed = 0.05;
                if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
                    l.getLocation().addX(speed);
                }
                
                if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
                    l.getLocation().addX(-speed);
                }
                
                if(Keyboard.isKeyDown(Keyboard.KEY_UP)) {
                    l.getLocation().addZ(speed);
                }
                
                if(Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
                    l.getLocation().addZ(-speed);
                }
                
                if(Keyboard.isKeyDown(Keyboard.KEY_W)) {
                    l.getLocation().addY(speed);
                }
                
                if(Keyboard.isKeyDown(Keyboard.KEY_S)) {
                    l.getLocation().addY(-speed);
                }
            }
        };
        Scene.ACTIVE_SCENE = myScene;
        
        //Create some cubes
        int grid = 2;
        for(int x = -grid; x <= grid; x++) {
            for(int z = -grid; z <= grid; z++) {
                Model s = new Torus();
                s.getLocation().setZ(z*2d).setX(x*2d);
                myScene.addModel(s);
                s.setMaterial(s.getMaterial().clone());
                s.getMaterial().setColor(Color.PINK);
            }
        }
        
        Plane plane = new Plane();
        plane.setScale(10);
        plane.getMaterial().setColor(Color.BLUE);
        plane.getLocation().setY(-0.5);
        
        //Create a light
        Light light = new SimpleLight();
        light.getLocation().set(0, 0.5, 0);
        this.getScene().addLight(light);
        
        //Create another
        light = new SimpleLight();
        light.getLocation().set(0, 0.5, 0);
        light.setAmbient(Color.fromHex("#220022"));
        light.getLocation().set(-5, 0.3, -2);
        this.getScene().addLight(light);
        
        //Add the Cube
        Scene.ACTIVE_SCENE.addModel(plane);
        
        //Draw Axis, Lights and Grid
        this.getDisplayManager().drawAxis = true;
        this.getDisplayManager().clearColor = Color.BLACK;
        this.getDisplayManager().drawLights = true;
        
        //Move Camera
        this.getScene().getCamera().setLocation(new Location(3, 3, 3));
    }
}
