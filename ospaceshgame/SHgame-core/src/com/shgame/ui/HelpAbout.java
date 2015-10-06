package com.shgame.ui;

import com.badlogic.gdx.math.Rectangle;
import com.shgame.game.MySHgame;
import com.shgame.gameworld.GameRenderer;
import com.shgame.screen.GameScreen;
import com.shgame.screen.HelpAboutScreen;

public class HelpAbout {

	public float btnWidth,btnHeight;
	public float wx,wy;
	public Rectangle bounds;
	
	public HelpAbout(float width,float height){
		btnWidth = width/5;
		btnHeight = height/10;
		wx = width-width/3;
		wy = height/2+btnHeight*3+15;
		
		bounds = new Rectangle(wx, wy, btnWidth, btnHeight);
	}
	
	public void update(float delta){
		
	}
	
	public void offClick(int touchX, int touchY){
		if(bounds.contains(touchX, touchY))
		{
		GameRenderer.touchBtn=false;
		GameRenderer.upBtn=true;
		}
		GameRenderer.touchBtn=false;
	}
	
	public void onClick(int touchX, int touchY){
		if(bounds.contains(touchX, touchY))
			{
			GameRenderer.touchBtn=true;
			GameRenderer.upBtn=false;
			GameRenderer.nmbBtn=4;
			}
	}
}
