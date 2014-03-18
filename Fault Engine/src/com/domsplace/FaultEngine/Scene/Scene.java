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

package com.domsplace.FaultEngine.Scene;

import com.domsplace.FaultEngine.Display.Camera.Camera;
import com.domsplace.FaultEngine.Display.DisplayManager;
import com.domsplace.FaultEngine.Entity.Entity;
import com.domsplace.FaultEngine.Entity.ModelledEntity;
import com.domsplace.FaultEngine.Game;
import com.domsplace.FaultEngine.Model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic Masters
 */
public class Scene {
    public static Scene ACTIVE_SCENE;
    
    private String name;
    private List<Entity> entities = new ArrayList<Entity>();
    
    public Scene(String name) {
        this.name = name;
        ACTIVE_SCENE = this;
    }
    
    public String getName() {return this.name;}
    public List<Entity> getEntities() {return new ArrayList<Entity>(this.entities);}//Thread Safe
    public Game getGame() {return Game.GAME_INSTANCE;}
    public DisplayManager getDisplayManager() {return getGame().getDisplayManager();}
    public Camera getCamera() {return getDisplayManager().getCamera();}
    public List<Model> getModels() {return getGame().getDisplayManager().getRenderList();}
    
    public void addModel(Model m) {getGame().getDisplayManager().addModelToRenderList(m);}
    public void addEntity(Entity e) {entities.add(e);if(e instanceof ModelledEntity)this.addModel(((ModelledEntity)e).getModel());}
    
    public void removeModel(Model m) {getGame().getDisplayManager().removeModelFromRenderList(m);}
    public void removeEntity(Entity e) {entities.remove(e);if(e instanceof ModelledEntity)this.removeModel(((ModelledEntity)e).getModel());}

    public void tick() {
        for(Entity e : this.entities) {
            e.tick();
        }
    }
}
