package com.mygdx.game.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.Scenes.Hud;

/**
 * Created by Gnarly on 5/2/2016.
 */
public class PlayScreen implements Screen {

    private MyGdxGame game;
    Texture texture;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private Hud hud;

    public PlayScreen(MyGdxGame game)
    {

        this.game = game;
        texture = new Texture("badlogic.jpg");
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(MyGdxGame.V_WIDTH,MyGdxGame.V_HEIGHT, gamecam);
        hud = new Hud(game.batch);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
    Gdx.gl.glClearColor(1,0,0,1);
     Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
         }

    @Override
    public void resize(int width, int height) {
gamePort.update(width,height);
    }

    @Override
    public void pause() {
  
    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}