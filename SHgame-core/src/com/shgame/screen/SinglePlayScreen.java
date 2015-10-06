package com.shgame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.shgame.game.MySHgame;
import com.shgame.helpaboutworld.HelpAboutRenderer;
import com.shgame.helpaboutworld.HelpAboutWorld;
import com.shgame.singleplay.SinglePlayRenderer;
import com.shgame.singleplay.SinglePlayWorld;

public class SinglePlayScreen implements Screen{
	
	private SinglePlayWorld world;
	private SinglePlayRenderer renderer;
	private MySHgame game;
	
	public SinglePlayScreen(MySHgame game){
		Gdx.app.log("HelpAboutScreen", "Attached");
		
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        
        world = new SinglePlayWorld(screenWidth, screenHeight); // initialize world
        renderer = new SinglePlayRenderer(world,screenWidth, screenHeight); // initialize renderer
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		world.update(delta); // GameWorld updates 
		renderer.render(); // GameRenderer renders
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
