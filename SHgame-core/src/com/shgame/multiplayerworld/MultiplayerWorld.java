package com.shgame.multiplayerworld;

import com.shgame.uiMultiplayer.BackMult;

public class MultiplayerWorld {

	private BackMult backBtn;
	
	public MultiplayerWorld(float width, float height){
		backBtn = new BackMult(width, height);
	}
	
	public void update(float delta){
		backBtn.update(delta);
	}
	
	public BackMult getBackBtn(){
		return backBtn;
	}
}
