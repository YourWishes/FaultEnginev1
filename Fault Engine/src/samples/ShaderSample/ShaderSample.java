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

package samples.ShaderSample;

import com.domsplace.FaultEngine.CloseReason;
import com.domsplace.FaultEngine.Display.Color;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Lighting.Light;
import com.domsplace.FaultEngine.Lighting.SimpleLight;
import com.domsplace.FaultEngine.Location.Location;
import com.domsplace.FaultEngine.Model.Material.*;
import com.domsplace.FaultEngine.Model.Material.Texture.*;
import com.domsplace.FaultEngine.Model.*;
import com.domsplace.FaultEngine.Model.Primitives.*;
import com.domsplace.FaultEngine.Scene.Scene;
import com.domsplace.FaultEngine.Shader.Shader;
import com.domsplace.FaultEngine.Shader.ShaderProgram;
import com.domsplace.FaultEngine.Utilities.FileUtilities;
import de.matthiasmann.twl.utils.PNGDecoder;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL20;
import sample.SampleApplication;

/**
 *
 * @author Dominic Masters
 */
public class ShaderSample extends SampleApplication {
    public static void main(String[] args) {
        Game game = new ShaderSample();
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
    
    public ShaderSample() {
        super("Shader Sample", 1.00, ShaderSample.class);
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
                
                for(Model m : this.getModels()) {
                    if(m instanceof Plane) continue;
                    m.getLocation().addYaw(1).addPitch(1);
                }
            }
        };
        Scene.ACTIVE_SCENE = myScene;
        
        //Create some cubes
        SimpleMaterial mat = new SimpleMaterial();
        mat.setOutlined(true);
        mat.setOutlineColor(Color.PINK);
        int grid = 2;
        for(int x = -grid; x <= grid; x++) {
            for(int z = -grid; z <= grid; z++) {
                if(z == 0 && x == 0) continue;
                Model model = new Sphere();
                model.getLocation().setZ(z*2d).setX(x*2d);
                myScene.addModel(model);
                model.setMaterial(mat);
            }
        }
        
        Model cube = new Cube();
        try {
            Texture t = PNGTexture.loadFromResource("samples/TextureSample/brick.png", PNGDecoder.Format.RGBA);
            t.load();
            
            cube.getMaterial().setTexture(t);
            cube.getMaterial().setOutlined(true);
            cube.getMaterial().setOutlineThickness(10);
            cube.getMaterial().setOutlineColor(Color.GREEN);
            ((Cube) cube).reInit();
            myScene.addModel(cube);
        } catch(Exception e) {
            this.getLogger().log(e);
            cube.getMaterial().setColor(Color.RED);
        }
        
        
        Model plane = new Plane();
        plane.getMaterial().setColor(Color.BLUE);
        plane.setScale(10);
        plane.getLocation().setY(-1);
        //myScene.addModel(plane);
        
        //Create a light
        Light light = new SimpleLight();
        light.getLocation().set(2, .5, 0);
        this.getScene().addLight(light);
        
        //Load the Shader
        Shader toonFragShader = new Shader();
        Shader toonVertShader = new Shader();
        ShaderProgram toonShader = new ShaderProgram();
        try {
            toonFragShader.compile(FileUtilities.getResourceAsString("shaders/ToonShader/toon_shader.frag"), GL20.GL_FRAGMENT_SHADER);
            toonVertShader.compile(FileUtilities.getResourceAsString("shaders/ToonShader/toon_shader.vert"), GL20.GL_VERTEX_SHADER);
            toonShader.addShader(toonFragShader).addShader(toonVertShader);
            toonShader.compile();
            
            for(Model m : myScene.getModels()) {
                m.setShaderProgram(toonShader);
            }
        } catch(Exception e) {
            Game.GAME_INSTANCE.showWarning("Shader Error!", e.getMessage());
            this.forceClose(CloseReason.ERROR);
        }
        
        //Draw Axis, Lights and Grid
        this.getDisplayManager().drawAxis = true;
        this.getDisplayManager().clearColor = Color.BLACK;
        this.getDisplayManager().drawLights = true;
        this.getDisplayManager().showFPS = false;
        
        //Move Camera
        this.getScene().getCamera().setLocation(new Location(3, 3, 3));
    }
}
