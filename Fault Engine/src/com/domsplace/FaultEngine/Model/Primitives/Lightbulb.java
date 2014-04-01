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

package com.domsplace.FaultEngine.Model.Primitives;

import com.domsplace.FaultEngine.Display.Color;
import com.domsplace.FaultEngine.Display.RenderPass;
import com.domsplace.FaultEngine.Model.StaticModel;

/**
 *
 * @author Dominic Masters
 */
public class Lightbulb extends StaticModel {
    private static Lightbulb MESH = null;
    private static Lightbulb getMesh() {
        if(MESH != null) return MESH;
        MESH = new Lightbulb(true);
        MESH.init();
        return MESH;
    }
    
    public Lightbulb() {
        this(getMesh());
    }
    
    private Lightbulb(boolean t) {
        super();
        
        Cube c = new Cube();
        c.setScale(0.5);
        c.cloneMaterial().setColor(Color.YELLOW);
        c.getMaterial().setOutlined(true);
        c.getMaterial().setOutlineColor(Color.RED);
        c.getMaterial().setOutlineThickness(3);
        addChild(c);
        
        c = new Cube();
        c.setScale(0.25);
        c.cloneMaterial().setColor(Color.GRAY);
        c.getMaterial().setOutlined(true);
        c.getMaterial().setOutlineColor(Color.BLACK);
        c.getLocation().setY(this.getChildren().get(0).getScaleY()/2d + c.getScaleY()/2d);
        addChild(c);
        this.getPivotLocation().setY(-this.getChildren().get(0).getScaleY()/2d);
        
        this.setScale(0.25);
    }
    
    private Lightbulb(Lightbulb mesh) {
        super(mesh);
    }
    
    @Override
    public void render(RenderPass rp) {
        this.getLocation().setYaw(0).setPitch(0).setRoll(-180);
        super.render(rp);
    }
}
