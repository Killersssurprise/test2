package com.shgame.uiMultiplayer;

import com.badlogic.gdx.math.Rectangle;
import com.shgame.multiplayerworld.MultiplayerRenderer;

public class BackMult {

	public float btnWidth,btnHeight;
	public float wx,wy;
	public Rectangle bounds;
	
	public BackMult(float width,float height){
		btnWidth = width/5;
		btnHeight = height/10;
		wx = width - width/3;
		wy = height - height/3;
		
		bounds = new Rectangle(wx, wy, btnWidth, btnHeight);
	}
	
	public void update(float delta){
		
	}
	
	public void offClick(int touchX, int touchY){
		if(bounds.contains(touchX, touchY))
		{
			MultiplayerRenderer.touchBtn = false;
			MultiplayerRenderer.upBtn = true;
		}
		MultiplayerRenderer.touchBtn = false;
	}
	
	public void onClick(int touchX, int touchY){
		if(bounds.contains(touchX, touchY))
			{
				MultiplayerRenderer.touchBtn = true;
				MultiplayerRenderer.upBtn = false;
			}
	}
}
