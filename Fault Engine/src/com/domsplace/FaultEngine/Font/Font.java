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

package com.domsplace.FaultEngine.Font;

import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Location.Location2D;
import com.domsplace.FaultEngine.Model.DynamicModel;
import com.domsplace.FaultEngine.Model.Material.Texture.PNGTexture;
import com.domsplace.FaultEngine.Model.Material.Texture.Texture;
import com.domsplace.FaultEngine.Model.Material.Texture.TextureCoordinate;
import com.domsplace.FaultEngine.Model.Model;
import com.domsplace.FaultEngine.Model.Model2D;
import com.domsplace.FaultEngine.Model.Primitives.Quad;
import de.matthiasmann.twl.utils.PNGDecoder;
import java.io.IOException;

/**
 *
 * @author Dominic Masters
 */
public class Font {
    private static Font SAMPLE_FONT = null;
    public static Font getSampleFont() {
        if(SAMPLE_FONT != null) return SAMPLE_FONT;
        try {
            Texture fontTexture = PNGTexture.loadFromResource("resources/sample_font.png", PNGDecoder.Format.RGBA);
            fontTexture.load();
            SAMPLE_FONT = new Font();
            SAMPLE_FONT.fontMap = fontTexture;
            SAMPLE_FONT.setNumRows(16).setNumCols(16);
        } catch (IOException ex) {
            Game.GAME_INSTANCE.getLogger().log(ex);
        }
        return SAMPLE_FONT;
    }
    
    //Instance
    private Texture fontMap;
    private float charWidth;
    private float charHeight;
    private float charSpaceX = 0;
    private float charSpaceY;
    private int firstCharacter = 0;
    
    public Font() {
        
    }
    
    public Texture getFontMap() {return this.fontMap;}
    public float getCharacterWidth() {return this.charWidth;}
    public float getCharacterHeight() {return this.charHeight;}
    public float getCharacterSpacingX() {return this.charSpaceX;}
    public float getCharacterSpacingY() {return this.charSpaceY;}
    public float getNumCols() {return (float) (this.fontMap.getWidth() / (charWidth+charSpaceX));}
    public float getNumRows() {return (float) (this.fontMap.getHeight() / (charHeight+charSpaceY));}
    public float getCellFromCharacter(char character) {return character - firstCharacter;}
    public float getRowFromCell(float cell) {return (int) ((cell) / (getNumCols())) + 1;}
    public float getColFromCell(float cell) {return (int) (cell - ((getRowFromCell(cell)-1) * getNumCols())) + 1;}
    
    public Font setFontMap(Texture texture) {this.fontMap = texture; return this;}
    public Font setCharacterWidth(float x) {this.charWidth = x; return this;}
    public Font setCharacterHeight(float x) {this.charHeight = x; return this;}
    public Font setCharacterSpacingX(float x) {this.charSpaceX = x; return this;}
    public Font setCharacterSpacingY(float x) {this.charSpaceY = x; return this;}
    public Font setFirstCharacter(int firstCharacter) {this.firstCharacter = firstCharacter; return this;}
    public Font setNumRows(float rows) {return this.setCharacterWidth((float)fontMap.getWidth()/rows);}
    public Font setNumCols(float cols) {return this.setCharacterHeight((float)fontMap.getHeight()/cols);}
    
    public Model generate(String characters) {
        DynamicModel model = new DynamicModel();
        
        int i = 0;
        for(char c : characters.toCharArray()) {
            Quad characterQuad = new Quad();
            characterQuad.getVert0().addX(i + 0.5).addY(0.5);
            characterQuad.getVert1().addX(i + 0.5).addY(0.5);
            characterQuad.getVert2().addX(i + 0.5).addY(0.5);
            characterQuad.getVert3().addX(i + 0.5).addY(0.5);
            
            Location2D topLeft = this.getCoordinateForCharacter(c);
            
            TextureCoordinate tl = new TextureCoordinate(topLeft.getX(), topLeft.getY());
            TextureCoordinate tr = new TextureCoordinate(topLeft.getX() + ((double)this.getCharacterWidth() /(double) this.getFontMap().getWidth()), topLeft.getY());
            TextureCoordinate bl = new TextureCoordinate(topLeft.getX(), topLeft.getY() + ((double)this.getCharacterHeight() /(double) this.getFontMap().getHeight()));
            TextureCoordinate br = new TextureCoordinate(topLeft.getX() + ((double)this.getCharacterWidth() /(double) this.getFontMap().getWidth()), topLeft.getY() + ((double)this.getCharacterHeight() /(double) this.getFontMap().getHeight()));
            
            characterQuad.setTextureCoordinate0(bl);
            characterQuad.setTextureCoordinate1(br);
            characterQuad.setTextureCoordinate2(tr);
            characterQuad.setTextureCoordinate3(tl);
            
            model.addFaces(characterQuad.toQuadArray());
            i+=1;
        }
        
        model.getMaterial().setTexture(fontMap);
        
        return model;
    }
    
    public Model generate2D(String characters) {
        return new Model2D(this.generate(characters));
    }
    
    public Model generate2DGUI(String characters) {
        Model2D d = new Model2D(this.generate(characters));
        d.render3D = false;
        d.render2D = true;
        return d;
    }
    
    public Location2D getCoordinateForCharacter(char character) {
        float cell = getCellFromCharacter(character);
        float col = this.getColFromCell(cell) - 1;
        float row = this.getRowFromCell(cell) - 1;
        float x = col / getNumCols();
        float y = row / getNumRows();
        
        Location2D coord = new Location2D(x,y);
        return coord;
    }
}
