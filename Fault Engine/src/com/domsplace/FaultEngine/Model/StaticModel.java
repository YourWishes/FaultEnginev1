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
    private int tHandle = -1;
    private int nHandle = -1;
    
    public StaticModel() {
        super();
    }
    
    public StaticModel(Model model) {
        super(model);
        if(model instanceof StaticModel) {
            StaticModel sm = (StaticModel) model;
            if(sm.ib != null) {
                this.ib = sm.ib;
                this.vHandle = sm.vHandle;
                this.tHandle = sm.tHandle;
                this.nHandle = sm.nHandle;
            }
        }
    }
    
    //This will not remove the old VBO data!
    public void newVBO() {
        this.vHandle = -1;
        this.tHandle = -1;
        this.ib = null;
        this.putOnVBO();
    }
    
    @Override
    public Model clone() {
        return new StaticModel(this);
    }
    
    public List<TextureCoordinate> getTextureCoordinates() {
        List<TextureCoordinate> texts = new ArrayList<TextureCoordinate>();
        for(Face f : this.getFaces()) {
            texts.addAll(f.getTextureCoordinates());
        }
        return texts;
    }
    
    public List<Normal> getNormals() {
        List<Normal> texts = new ArrayList<Normal>();
        for(Face f : this.getFaces()) {
            texts.addAll(f.getNormals());
        }
        return texts;
    }
    
    public void putOnVBO() {
        if(this.vHandle != -1) return;
        //Create a Float Buffer
        List<Vertice> verts = this.getVertices();
        List<TextureCoordinate> textCoords = this.getTextureCoordinates();
        List<Normal> normals = this.getNormals();
        
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
        
        FloatBuffer nBuffer = null;
        if(normals.size() > 0) {
            nBuffer = BufferUtils.createFloatBuffer(3*normals.size());
            for(Normal norm : normals) {
                nBuffer.put(norm.getFloatX()).put(norm.getFloatY()).put(norm.getFloatZ());
            }
            buffers += 1;
            nBuffer.flip();
        }
        
        
        ib = BufferUtils.createIntBuffer(buffers);
        glGenBuffers(ib);
        
        this.vHandle = ib.get(0);
        if(this.getMaterial().getTextured()) this.tHandle = ib.get(1);
        if(normals.size() > 0) this.nHandle = ib.get(buffers-1);
        
        glEnableClientState(GL_VERTEX_ARRAY);

        if(this.getMaterial().getTextured()) glEnableClientState(GL_TEXTURE_COORD_ARRAY);
        if(nBuffer != null) glEnableClientState(GL_NORMAL_ARRAY);
        
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
        
        if(nBuffer != null) {
            glBindBuffer(GL_ARRAY_BUFFER, this.nHandle);
            glBufferData(GL_ARRAY_BUFFER, nBuffer, GL_STATIC_DRAW);
            glUnmapBuffer(GL_ARRAY_BUFFER);
            glNormalPointer(GL_FLOAT, 0, 0);
        }
        
        glDrawArrays(GL_TRIANGLES, 0, this.getFaces().size()*3 /* elements */);

        glBindBuffer(GL_ARRAY_BUFFER, 0);
        glDisableClientState(GL_VERTEX_ARRAY);
        
        if(this.getMaterial().getTextured()) glDisableClientState(GL_TEXTURE_COORD_ARRAY);
    }
    
    @Override
    public void renderMesh() {
        if(this.vHandle == -1) this.init();
        
        glEnableClientState(GL_VERTEX_ARRAY);
        if(this.getMaterial().getTextured()) glEnableClientState(GL_TEXTURE_COORD_ARRAY);
        if(this.nHandle != -1) glEnableClientState(GL_NORMAL_ARRAY);

        List<Face> faces = this.getFaces();
        int faceCount = faces.size();
        
        glBindBuffer(GL_ARRAY_BUFFER, vHandle);
        glUnmapBuffer(GL_ARRAY_BUFFER);
        glVertexPointer(3, GL_FLOAT, 3 << 2, 0L);
        
        if(this.getMaterial().getTextured() && this.tHandle != -1 && DisplayManager.TEXTURES_ENABLED) {
            glBindBuffer(GL_ARRAY_BUFFER, tHandle);
            glUnmapBuffer(GL_ARRAY_BUFFER);
            glTexCoordPointer(2, GL_FLOAT, 0, 0L);
            this.getMaterial().getTexture().bindTexture();
        }
        
        if(nHandle != -1) {
            glBindBuffer(GL_ARRAY_BUFFER, nHandle);
            glUnmapBuffer(GL_ARRAY_BUFFER);
            glNormalPointer(GL_FLOAT, 0, 0);
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
    
    @Override
    public void reInit() {
        this.newVBO();
    }

    public String getConstructorCode() {
        String x = "";
        
        x += "Face f = null;\n";
        x += "Vertice v = null;\n";
        x += "Normal n = null;\n";
        x += "TextureCoordinate tc = null;\n\n";
        
        for(Face f : this.getFaces()) {
            x += "//Creating Face\n";
            x += "f = new DynamicFace();";
            x += "\n";
            for(Vertice v : f.getVertices()) {
                x += "v = new Vertice(" + v.getX() + "," + v.getY() + "," + v.getZ() + ");\n";
                x += "f.addVertice(v);\n";
            }
            for(Normal n : f.getNormals()) {
                x += "n = new Normal(" + n.getX() + "," + n.getY() + "," + n.getZ() + ");\n";
                x += "f.addNormal(n);\n";
            }
            for(TextureCoordinate tc : f.getTextureCoordinates()) {
                x += "tc = new TextureCoordinate(" + tc.getX() + "," + tc.getY() + ");\n";
                x += "f.addTextureCoordinate(tc);\n";
            }
            x += "\nthis.addFace(f);\n\n";
        }
        
        return x;
    }
}
