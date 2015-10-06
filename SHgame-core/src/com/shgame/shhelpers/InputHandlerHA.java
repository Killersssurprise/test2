package com.shgame.shhelpers;

import com.badlogic.gdx.InputProcessor;
import com.shgame.uiHelpAbout.About;
import com.shgame.uiHelpAbout.Back;
import com.shgame.uiHelpAbout.Enemy;
import com.shgame.uiHelpAbout.General;
import com.shgame.uiHelpAbout.Weapon;

// бесполезный файл,удалить нужно

public class InputHandlerHA implements InputProcessor{

	public General myGeneralBtn;
	public Weapon myWeaponBtn;
	public Enemy myEnemyBtn;
	public About myAboutBtn;
	public Back myBackBtn;
	
	public InputHandlerHA(General general, Weapon weapon, Enemy enemy, About about, Back back){
		myGeneralBtn = general;
		myWeaponBtn = weapon;
		myEnemyBtn = enemy;
		myAboutBtn = about;
		myBackBtn = back;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		myGeneralBtn.onClick(screenX, screenY);
		myWeaponBtn.onClick(screenX, screenY);
		myEnemyBtn.onClick(screenX, screenY);
		myAboutBtn.onClick(screenX, screenY);
		myBackBtn.onClick(screenX, screenY);
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		myGeneralBtn.offClick();
		myWeaponBtn.offClick();
		myEnemyBtn.offClick();
		myAboutBtn.offClick();
		myBackBtn.offClick(screenX, screenY);
		return true;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
