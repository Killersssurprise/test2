package com.shgame.uiSingleplay.uiCostweapon;

import com.badlogic.gdx.math.Rectangle;
import com.shgame.singleplay.SinglePlayRenderer;

public class Costweapon_6 {


	public float btnWidth,btnHeight;
	public float wx,wy;
	public Rectangle bounds;
	public static boolean sell = false;
	
	public Costweapon_6(float width,float height){
		btnWidth = width/12;
		btnHeight = height/10;
		wx = btnWidth*5 + 15;
		wy = 5;
		
		bounds = new Rectangle(wx, wy, btnWidth, btnHeight);
	}
	
	public void update(float delta){
		
	}
	
	public void offClick(int touchX, int touchY){
		if(bounds.contains(touchX, touchY))
		{
			if(!sell)
				if(SinglePlayRenderer.cash >= 5000)
				{
					SinglePlayRenderer.change_weapon = 6;
					SinglePlayRenderer.cash -= 5000;
					sell = true;
				}
			if(sell)
				SinglePlayRenderer.change_weapon = 6;
		}
	}
	
	public void onClick(int touchX, int touchY){
		if(bounds.contains(touchX, touchY))
			{

			}
	}
}
