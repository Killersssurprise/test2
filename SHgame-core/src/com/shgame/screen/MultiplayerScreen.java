package com.shgame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.shgame.game.MySHgame;
import com.shgame.multiplayerworld.MultiplayerRenderer;
import com.shgame.multiplayerworld.MultiplayerWorld;

public class MultiplayerScreen implements Screen{

	private MultiplayerWorld world;
	private MultiplayerRenderer renderer;
	private MySHgame game;
	
	public MultiplayerScreen(MySHgame game){
		Gdx.app.log("HelpAboutScreen", "Attached");
		
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        
        world = new MultiplayerWorld(screenWidth, screenHeight); // initialize world
        renderer = new MultiplayerRenderer(world,screenWidth, screenHeight, game); // initialize renderer
        
        
        //Gdx.input.setInputProcessor(new InputHandlerHA(world.getGeneralBtn(),world.getWeaponBtn(),world.getEnemyBtn(),world.getAboutBtn(),world.getBackBtn()));
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
