package com.shgame.uiSingleplay.uiCostweapon;

import com.badlogic.gdx.math.Rectangle;
import com.shgame.singleplay.SinglePlayRenderer;

public class Costweapon_2 {


	public float btnWidth,btnHeight;
	public float wx,wy;
	public Rectangle bounds;
	public static boolean sell = false;
	
	public Costweapon_2(float width,float height){
		btnWidth = width/12;
		btnHeight = height/10;
		wx = btnWidth + 7;
		wy = 5;
		
		bounds = new Rectangle(wx, wy, btnWidth, btnHeight);
	}
	
	public void update(float delta){
		
	}
	
	public void offClick(int touchX, int touchY){
		if(bounds.contains(touchX, touchY))
		{
			if(!sell)
				if(SinglePlayRenderer.cash >= 1000)
				{
					SinglePlayRenderer.change_weapon = 2;
					SinglePlayRenderer.cash -= 1000;
					sell = true;
				}
			if(sell)
				SinglePlayRenderer.change_weapon = 2;
		}
	}
	
	public void onClick(int touchX, int touchY){
		if(bounds.contains(touchX, touchY))
			{

			}
	}
}
