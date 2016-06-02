package com.mygdx.game.Sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.MyGdxGame;



/**
 * Created by Gnarly on 5/27/2016.
 */
public class MrBlue extends Sprite {
    public World world;
    public Body b2body;
    public void defineMrBlue(){
        BodyDef bdef = new BodyDef();
        bdef.position.set(50/ MyGdxGame.PPM,50/MyGdxGame.PPM);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body = world.createBody(bdef);
        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();
        shape.setRadius(5 / MyGdxGame.PPM);
        fdef.shape = shape;
        b2body.createFixture(fdef);


    }
    public MrBlue(World world){
        this.world = world;
        defineMrBlue();
    }

}
