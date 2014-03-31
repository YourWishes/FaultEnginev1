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

package samples.TextureSample;

import com.domsplace.FaultEngine.Display.Color;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Material.Texture.PNGTexture;
import com.domsplace.FaultEngine.Model.Material.Texture.Texture;
import com.domsplace.FaultEngine.Model.Material.Texture.TextureCoordinate;
import com.domsplace.FaultEngine.Model.Model;
import com.domsplace.FaultEngine.Model.Primitives.Cube;
import com.domsplace.FaultEngine.Model.Primitives.Plane;
import com.domsplace.FaultEngine.Scene.Scene;
import de.matthiasmann.twl.utils.PNGDecoder;
import java.net.URL;
import sample.SampleApplication;

/**
 *
 * @author Dominic Masters
 */
public class TextureSample extends SampleApplication {
    public static void main(String[] args) {
        Game game = new TextureSample();
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
    
    public TextureSample() {
        super("Texture Sample", 1.00, TextureSample.class);
    }
    
    @Override
    public void drawScene() {
        Cube cube = new Cube();
        Cube smallCube = new Cube();
        Plane plane = new Plane();
        
        Texture t = null;
        Texture b = null;
        Texture w = null;
        try {
            t = PNGTexture.loadFromResource("samples/TextureSample/transparent.png", PNGDecoder.Format.RGBA);
            t.load();
            cube.cloneMaterial().setTexture(t);
            cube.reInit();  //For Cloned Models (Like Primitives) a new VBO ID will need to be generated
            
            b = PNGTexture.loadFromResource("samples/TextureSample/brick.png", PNGDecoder.Format.RGBA);
            b.load();
            plane.getMaterial().setTexture(b);
            plane.setScale(5);
            plane.getLocation().setY(-0.4);
            
            //Adjust texture Coords
                TextureCoordinate bottomLeft = new TextureCoordinate(0.0, 0.0);
                TextureCoordinate topLeft = new TextureCoordinate(0.0, plane.getScaleZ());
                TextureCoordinate bottomRight = new TextureCoordinate(plane.getScaleX(), 0.0);
                TextureCoordinate topRight = new TextureCoordinate(plane.getScaleX(), plane.getScaleZ());
            //End Texture Coords
            plane.getPlaneQuad().getBottomLeft().setTextureCoordinate0(bottomLeft);
            plane.getPlaneQuad().getBottomLeft().setTextureCoordinate1(bottomRight);
            plane.getPlaneQuad().getBottomLeft().setTextureCoordinate2(topRight);
            
            plane.getPlaneQuad().getTopRight().setTextureCoordinate0(bottomLeft);
            plane.getPlaneQuad().getTopRight().setTextureCoordinate1(topRight);
            plane.getPlaneQuad().getTopRight().setTextureCoordinate2(topLeft);
            
            plane.reInit();
            
            try {
                w = PNGTexture.loadFromInputStream(new URL("https://avatars3.githubusercontent.com/u/4717802?s=140").openStream(), 
                        PNGDecoder.Format.RGBA);
                w.load();
                smallCube.getMaterial().setTexture(w);
                smallCube.setScale(0.5);
                smallCube.reInit();
            } catch(Throwable th) {
                Game.GAME_INSTANCE.getLogger().log(th);
                Game.GAME_INSTANCE.showWarning("Texture Error", "Failed to download the online"
                        + " texture! check your internet settings and try later.");
            }
        } catch(Throwable th) {
            Game.GAME_INSTANCE.getLogger().log(th);
            Game.GAME_INSTANCE.showWarning("Texture Error!", "Failed to load Texture! Make sure it exists and is valid!");
            exit();
        }
        
        //Create a new Scene we can override
        Scene myScene = new Scene(this.getName()) {
            @Override
            public void tick() {
                super.tick();
                for(Model m : this.getModels()) {
                    if(m instanceof Plane) continue;
                    m.getLocation().addYaw(1).addPitch(1);
                }
            }
        };
        Scene.ACTIVE_SCENE = myScene;
        
        //Add the Cube
        Scene.ACTIVE_SCENE.addModel(plane);
        Scene.ACTIVE_SCENE.addModel(cube);
        Scene.ACTIVE_SCENE.addModel(smallCube);
        
        //Draw Axis and Grid
        this.getDisplayManager().drawAxis = true;
        this.getDisplayManager().drawGrid = true;
        this.getDisplayManager().clearColor = Color.CORNFLOWER_BLUE;
        
        //Move Camera
        this.getScene().getCamera().setLocation(new Location(3, 3, 3));
    }
}
