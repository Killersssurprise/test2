package com.shgame.uiSingleplay;

import com.badlogic.gdx.math.Rectangle;
import com.shgame.singleplay.SinglePlayRenderer;

public class Bullet {
	
	// класс пули , в апдейте должно обновляться координаты прямоугольника для анализа касания
	public static float btnWidth,btnHeight;
	public static float wx,wy;
	public static Rectangle bounds;
	
	public Bullet(float width,float height){
		btnWidth = 15;
		btnHeight = 5;
		wx = width/2 + Guy.btnWidth/2;
		wy = height/2 + Guy.btnHeight/2;
		
		bounds = new Rectangle(wx, wy, btnWidth, btnHeight);
	}
	
	public void update(float delta){
		bounds.x = SinglePlayRenderer.bx;
		bounds.y = SinglePlayRenderer.by;
	}
	
	public void offClick(){

	}
	
	public void onClick(int touchX, int touchY){
		if(bounds.contains(touchX, touchY))
			{

			}
	}
}
