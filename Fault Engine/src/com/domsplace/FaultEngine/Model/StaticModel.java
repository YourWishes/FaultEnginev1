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

package com.domsplace.FaultEngine.Model;

import com.domsplace.FaultEngine.Display.DisplayManager;
import com.domsplace.FaultEngine.Model.Material.Texture.TextureCoordinate;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.BufferUtils;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;

/**
 *
 * @author Dominic Masters
 */
public class StaticModel extends SimpleModel {
    private IntBuffer ib;
    private int vHandle = -1;
    private int tHandle;
    
    public StaticModel() {
        super();
    }
    
    public StaticModel(Model model) {
        super(model);
        if(model instanceof StaticModel) {
            StaticModel sm = (StaticModel) model;
            this.ib = sm.ib;
            this.vHandle = sm.vHandle;
            this.tHandle = sm.tHandle;
        }
    }
    
    @Override
    public Model clone() {
        return new StaticModel(this);
    }
    
    public List<Vertice> getVertices() {
        List<Vertice> verts = new ArrayList<Vertice>();
        for(Face f : this.getFaces()) {
            verts.addAll(f.getVertices());
        }
        return verts;
    }
    
    public List<TextureCoordinate> getTextureCoordinates() {
        List<TextureCoordinate> texts = new ArrayList<TextureCoordinate>();
        for(Face f : this.getFaces()) {
            texts.addAll(f.getTextureCoordinates());
        }
        return texts;
    }
    
    public void putOnVBO() {
        if(this.vHandle != -1) return;
        //Create a Float Buffer
        List<Vertice> verts = this.getVertices();
        List<TextureCoordinate> textCoords = this.getTextureCoordinates();
        
        int buffers = 1; //Stores the amount of buffers we need (1 for Verts, 1 for colors, 1 for textures etc)
        
        //Vertex Buffer (Vertices)
        FloatBuffer vBuffer = BufferUtils.createFloatBuffer(3*verts.size());
        for(Vertice v : verts) {
            vBuffer.put(v.getFloatX()).put(v.getFloatY()).put(v.getFloatZ());
        }
        vBuffer.flip();
        
        FloatBuffer tBuffer = null;
        if(this.getMaterial().getTextured()) {
            tBuffer = BufferUtils.createFloatBuffer(2*textCoords.size());
            for(TextureCoordinate coord : textCoords) {
                tBuffer.put(coord.getFloatX()).put(coord.getFloatY());
            }
            buffers += 1;
            tBuffer.flip();
        }
        
        ib = BufferUtils.createIntBuffer(buffers);
        glGenBuffers(ib);
        
        this.vHandle = ib.get(0);
        if(this.getMaterial().getTextured()) this.tHandle = ib.get(1);
        
        glEnableClientState(GL_VERTEX_ARRAY);

        if(this.getMaterial().getTextured()) glEnableClientState(GL_TEXTURE_COORD_ARRAY);
        
        glBindBuffer(GL_ARRAY_BUFFER, vHandle);
        glBufferData(GL_ARRAY_BUFFER, vBuffer, GL_STATIC_DRAW);
        glUnmapBuffer(GL_ARRAY_BUFFER);
        glVertexPointer(3, GL_FLOAT, 3 << 2, 0L);
        
        if(tBuffer != null) {
            glBindBuffer(GL_ARRAY_BUFFER, this.tHandle);
            glBufferData(GL_ARRAY_BUFFER, tBuffer, GL_STATIC_DRAW);
            glUnmapBuffer(GL_ARRAY_BUFFER);
            glTexCoordPointer(2, GL_FLOAT, 0, 0L);
            this.getMaterial().getTexture().bindTexture();
        }
        glDrawArrays(GL_TRIANGLES, 0, this.getFaces().size()*3 /* elements */);

        glBindBuffer(GL_ARRAY_BUFFER, 0);
        glDisableClientState(GL_VERTEX_ARRAY);
        
        if(this.getMaterial().getTextured()) glDisableClientState(GL_TEXTURE_COORD_ARRAY);
    }
    
    @Override
    public void renderMesh() {
        glEnableClientState(GL_VERTEX_ARRAY);
        if(this.getMaterial().getTextured()) glEnableClientState(GL_TEXTURE_COORD_ARRAY);

        List<Face> faces = this.getFaces();
        int faceCount = faces.size();
        
        glBindBuffer(GL_ARRAY_BUFFER, vHandle);
        glUnmapBuffer(GL_ARRAY_BUFFER);
        glVertexPointer(3, GL_FLOAT, 3 << 2, 0L);
        
        if(this.getMaterial().getTextured()) {
            glBindBuffer(GL_ARRAY_BUFFER, tHandle);
            glUnmapBuffer(GL_ARRAY_BUFFER);
            glTexCoordPointer(2, GL_FLOAT, 0, 0L);
            this.getMaterial().getTexture().bindTexture();
        }
        
        glDrawArrays(GL_TRIANGLES, 0, faceCount*3 /* elements */);

        glBindBuffer(GL_ARRAY_BUFFER, 0);
        glDisableClientState(GL_VERTEX_ARRAY);
        
        DisplayManager.CURRENT_RENDERED_FACES += faceCount;
        DisplayManager.CURRENT_RENDERED_VERTICES += faceCount * 3;
    }

    @Override
    public void init() {
        this.putOnVBO();
        
        for(Model m : this.getChildren()) {
            m.init();
        }
    }

    @Override
    public void dispose() {
        try {ib.put(0, vHandle);} catch(Throwable t) {}
        try {glDeleteBuffers(ib);} catch(Throwable t) {}
    }
}
