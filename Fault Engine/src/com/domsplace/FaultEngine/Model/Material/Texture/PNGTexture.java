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

package com.domsplace.FaultEngine.Model.Material.Texture;

import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Utilities.FileUtilities;
import de.matthiasmann.twl.utils.PNGDecoder;
import de.matthiasmann.twl.utils.PNGDecoder.Format;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;

/**
 *
 * @author Dominic Masters
 */
public class PNGTexture extends SimpleTexture {    
    public static Texture loadFromResource(String resource, Format type) throws IOException {
        return loadFromInputStream(FileUtilities.getResource(resource), type);
    }
    
    public static Texture loadFromInputStream(InputStream is, Format type) {
        PNGTexture texture = new PNGTexture(is, type);
        return texture;
    }
    
    private static Texture testing = null;
    public static Texture getTestingTexture() {
        if(testing != null) return testing;
        try {
            testing = PNGTexture.loadFromResource("samples/TextureSample/brick.png", PNGDecoder.Format.RGBA);
        } catch (IOException ex) {
        }
        testing.load();
        return testing;
    }
    
    //Instance
    private int id = -1;
    
    private int tWidth;
    private int tHeight;
    private Format type;
    
    public PNGTexture(InputStream is, Format type) {
        super(is);
        this.type = type;
    }
    
    public PNGTexture(InputStream is) {
        this(is, Format.RGBA);
    }

    @Override
    public void load() {
        if(this.isLoaded()) return;
        if(this.getInputStream() == null) return;
        
        ByteBuffer buf;
        try {
            PNGDecoder decoder = new PNGDecoder(this.getInputStream());
            
            tWidth = decoder.getWidth();
            tHeight = decoder.getHeight();
            buf = ByteBuffer.allocateDirect(4 * decoder.getWidth() * decoder.getHeight());
            decoder.decode(buf, decoder.getWidth() * 4, this.type);
            buf.flip();

            this.getInputStream().close();
        } catch(Throwable t) {
            Game.GAME_INSTANCE.getLogger().log(t);
            this.id = -1;
            return;
        }
        
        this.id = this.genID();
        //Put Texture on GFX card
        this.bindTexture();
        glPixelStorei(GL_UNPACK_ALIGNMENT, 1);
        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, tWidth, tHeight, 0, GL_RGBA, GL_UNSIGNED_BYTE, buf);
        glGenerateMipmap(GL_TEXTURE_2D);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
        
        Game.GAME_INSTANCE.getLogger().log("Texture Loaded.");
    }

    @Override public int getTextureID() {return this.id;}
    @Override public int getWidth() {return this.tWidth;}
    @Override public int getHeight() {return this.tHeight;}
    @Override public boolean isTransparent() {return this.type.isHasAlpha();}
}
    