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

package samples.StressTest;

import com.domsplace.FaultEngine.Display.Color;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Material.SimpleMaterial;
import com.domsplace.FaultEngine.Model.Primitives.*;
import com.domsplace.FaultEngine.Scene.Scene;
import sample.SampleApplication;

/**
 *
 * @author Dominic Masters
 */
public class StressTest extends SampleApplication {
    public static void main(String[] args) {
        Game game = new StressTest();
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
    
    public StressTest() {
        super("Stress Test Sample", 1.00, StressTest.class);
    }
    
    @Override
    public void drawScene() {
        //Create a new Scene we can override
        Scene myScene = new Scene(this.getName()) {
            @Override
            public void tick() {
                super.tick();
                getCamera().getLocation().addX(0.002);
                getCamera().getLocation().addZ(0.001);
                getCamera().getLocation().subY(-0.0001);
            }
        };
        Scene.ACTIVE_SCENE = myScene;
        
        //Create something complex
        this.getGameSettings().setSetting("vsync", false);
        getDisplayManager().clearColor = Color.CORNFLOWER_BLUE;
        
        SimpleMaterial sm = new SimpleMaterial();
        //sm.setOutlined(true);
        int cubes = 22;
        int g = 0;
        for(int x = -cubes; x <= cubes; x++) {
            for(int z = -cubes; z <= cubes; z++) {
                Cube c = new Cube();
                c.setMaterial(sm);
                c.getLocation().setZ(z * 2).setX(x * 2);
                myScene.addModel(c);
                g++;
            }
        }
        Game.GAME_INSTANCE.getLogger().log("Rendering " + g + " cubes.");
        
        //Draw Axis, Lights and Grid
        this.getDisplayManager().showFPS = true;
        
        //Move Camera
        this.getScene().getCamera().setLocation(new Location(10,10,10));
    }
}
