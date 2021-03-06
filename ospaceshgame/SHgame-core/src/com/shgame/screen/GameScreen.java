package com.shgame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.shgame.game.MySHgame;
import com.shgame.gameworld.GameRenderer;
import com.shgame.gameworld.GameWorld;
import com.shgame.helpaboutworld.HelpAboutWorld;
import com.shgame.multiplayerworld.MultiplayerWorld;
import com.shgame.shhelpers.InputHandler;
import com.shgame.singleplay.SinglePlayWorld;

public class GameScreen implements Screen{

	// Sreen связывает world и renderer
	
	private GameWorld world;
	private GameRenderer renderer;
	
	private HelpAboutWorld world2;
	
	private MultiplayerWorld world3;
	
	private SinglePlayWorld world4;
	
	public GameScreen(MySHgame game) {
        Gdx.app.log("GameScreen", "Attached");
        
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        
        world = new GameWorld(screenWidth, screenHeight); // initialize world
        renderer = new GameRenderer(world,screenWidth, screenHeight, game); // initialize renderer
        
        world2 = new HelpAboutWorld(screenWidth, screenHeight);
        world3 = new MultiplayerWorld(screenWidth, screenHeight);
        world4 = new SinglePlayWorld(screenWidth, screenHeight);
        
        // так как может быть только один InputProcessor, то здесь передаются ВСЕ обьекты
        // которых нужно обрабатывать касания или другие действия
        Gdx.input.setInputProcessor(new InputHandler(game,world.getSPBtn(),world.getMPBtn(),world.getOPBtn(),world.getHABtn(),
        		world2.getGeneralBtn(),world2.getWeaponBtn(),world2.getEnemyBtn(),world2.getAboutBtn(),world2.getBackBtn(),
        		world2.getEnemy_1Btn(), world2.getEnemy_2Btn(), world2.getEnemy_3Btn(), world2.getEnemy_4Btn(), world2.getEnemy_5Btn(),
        		world2.getEnemy_6Btn(), world2.getEnemy_7Btn(), world2.getEnemy_8Btn(), world2.getPeople_1Btn(), world2.getPeople_2Btn(),
        		world2.getPeople_3Btn(), world2.getPeople_4Btn(), world2.getPeople_5Btn(), world2.getPeople_6Btn(), world2.getPeople_7Btn(),
        		world2.getPeople_8Btn(), world2.getPeople_9Btn(), world2.getPeople_10Btn(), world2.getPeople_11Btn(),
        		world3.getBackBtn(), world4.getControlBtn(), world4.getFireBtn(), world4.getGuyBtn(), world4.getReloadBtn(),
        		world4.getCw1Btn(), world4.getCw2Btn(), world4.getCw3Btn(), world4.getCw4Btn(), world4.getCw5Btn(),
        		world4.getCw6Btn(), world4.getCw7Btn(), world4.getCw8Btn(), world4.getCw9Btn(), world4.getCw10Btn()));
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
