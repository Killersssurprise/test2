package com.shgame.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.shgame.screen.GameScreen;
import com.shgame.screen.HelpAboutScreen;
import com.shgame.screen.MultiplayerScreen;
import com.shgame.screen.OptionScreen;
import com.shgame.screen.SinglePlayScreen;
import com.shgame.shhelpers.AssetLoader;

public class MySHgame extends Game {
	
	// 5 переменных для экранов, чтобы была возможность перехода между экранами в других классах
	public GameScreen menu;
	public SinglePlayScreen singleplay;
	public MultiplayerScreen multiplay;
	public OptionScreen options;
	public HelpAboutScreen helpabout;

	@Override
	public void create() {
		// TODO Auto-generated method stub
		Gdx.app.log("ZBGame", "created");
		// загрузка ВСЕХ текстур и звуков
		AssetLoader.load();
		
		menu = new GameScreen(this);
		singleplay = new SinglePlayScreen(this);
		multiplay = new MultiplayerScreen(this);
		options = new OptionScreen();
		helpabout = new HelpAboutScreen(this);
		
		// установка экрана меню при запуске игры
		setScreen(menu);
	}
	
	@Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
		
}
