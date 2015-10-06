package com.shgame.ui;

import com.badlogic.gdx.math.Rectangle;
import com.shgame.gameworld.GameRenderer;

public class Options {

	public float btnWidth,btnHeight;
	public float wx,wy;
	public Rectangle bounds;
	
	public Options(float width,float height){
		btnWidth = width/5;
		btnHeight = height/10;
		wx = width-width/3;
		wy = height/2+btnHeight*2+10;
		
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
			GameRenderer.nmbBtn=3;
			}
	}
}