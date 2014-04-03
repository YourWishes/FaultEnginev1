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

package samples.FontSample;

import com.domsplace.FaultEngine.Font.Font;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Model.Material.Texture.PNGTexture;
import com.domsplace.FaultEngine.Scene.Scene;
import de.matthiasmann.twl.utils.PNGDecoder;
import sample.SampleApplication;

/**
 *
 * @author Dominic Masters
 */
public class FontSample extends SampleApplication {
    public static void main(String[] args) {
        Game game = new FontSample();
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
    
    public FontSample() {
        super("Font Sample", 1.00, FontSample.class);
    }
    
    @Override
    public void drawScene() {
        //Create a new Scene we can override
        Scene myScene = new Scene(this.getName()) {
            @Override
            public void tick() {
                super.tick();
            }
        };
        Scene.ACTIVE_SCENE = myScene;
        
        //Create a Font
        Font sampleFont = new Font();
        try {
            sampleFont.setFontMap(PNGTexture.loadFromResource("resources/sample_font.png", PNGDecoder.Format.RGBA));
            sampleFont.getFontMap().load();
            sampleFont.setNumRows(16).setNumCols(16);
            
            getLogger().log("The Value of \"0\" is " + ((int)'!'));
        } catch(Throwable t) {
            getLogger().log(t);
        }
        
        myScene.addModel(sampleFont.generate("Hello World!"));
    }
}
