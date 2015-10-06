package com.shgame.helpaboutworld;

import com.shgame.uiHelpAbout.About;
import com.shgame.uiHelpAbout.Back;
import com.shgame.uiHelpAbout.Enemy;
import com.shgame.uiHelpAbout.General;
import com.shgame.uiHelpAbout.Weapon;
import com.shgame.uiHelpAbout.uiEnemy.Enemy_1;
import com.shgame.uiHelpAbout.uiEnemy.Enemy_2;
import com.shgame.uiHelpAbout.uiEnemy.Enemy_3;
import com.shgame.uiHelpAbout.uiEnemy.Enemy_4;
import com.shgame.uiHelpAbout.uiEnemy.Enemy_5;
import com.shgame.uiHelpAbout.uiEnemy.Enemy_6;
import com.shgame.uiHelpAbout.uiEnemy.Enemy_7;
import com.shgame.uiHelpAbout.uiEnemy.Enemy_8;
import com.shgame.uiHelpAbout.uiWeapon.People_1;
import com.shgame.uiHelpAbout.uiWeapon.People_2;
import com.shgame.uiHelpAbout.uiWeapon.People_3;
import com.shgame.uiHelpAbout.uiWeapon.People_4;
import com.shgame.uiHelpAbout.uiWeapon.People_5;
import com.shgame.uiHelpAbout.uiWeapon.People_6;
import com.shgame.uiHelpAbout.uiWeapon.People_7;
import com.shgame.uiHelpAbout.uiWeapon.People_8;
import com.shgame.uiHelpAbout.uiWeapon.People_9;
import com.shgame.uiHelpAbout.uiWeapon.People_10;
import com.shgame.uiHelpAbout.uiWeapon.People_11;

public class HelpAboutWorld {

	private General generalBtn;
	private Weapon weaponBtn;
	private Enemy enemyBtn;
	private About aboutBtn;
	private Back backBtn;
	// кнопки на экране HelpAbout врагов
	private Enemy_1 btnEnemy1;
	private Enemy_2 btnEnemy2;
	private Enemy_3 btnEnemy3;
	private Enemy_4 btnEnemy4;
	private Enemy_5 btnEnemy5;
	private Enemy_6 btnEnemy6;
	private Enemy_7 btnEnemy7;
	private Enemy_8 btnEnemy8;
	// кнопки оружий
	private People_1 btnPeople1;
	private People_2 btnPeople2;
	private People_3 btnPeople3;
	private People_4 btnPeople4;
	private People_5 btnPeople5;
	private People_6 btnPeople6;
	private People_7 btnPeople7;
	private People_8 btnPeople8;
	private People_9 btnPeople9;
	private People_10 btnPeople10;
	private People_11 btnPeople11;
	
	public HelpAboutWorld(float width, float height){
		generalBtn = new General(width, height);
		weaponBtn = new Weapon(width, height);
		enemyBtn = new Enemy(width, height);
		aboutBtn = new About(width, height);
		backBtn = new Back(width, height);
		btnEnemy1 = new Enemy_1(width, height);
		btnEnemy2 = new Enemy_2(width, height);
		btnEnemy3 = new Enemy_3(width, height);
		btnEnemy4 = new Enemy_4(width, height);
		btnEnemy5 = new Enemy_5(width, height);
		btnEnemy6 = new Enemy_6(width, height);
		btnEnemy7 = new Enemy_7(width, height);
		btnEnemy8 = new Enemy_8(width, height);
		btnPeople1 = new People_1(width, height);
		btnPeople2 = new People_2(width, height);
		btnPeople3 = new People_3(width, height);
		btnPeople4 = new People_4(width, height);
		btnPeople5 = new People_5(width, height);
		btnPeople6 = new People_6(width, height);
		btnPeople7 = new People_7(width, height);
		btnPeople8 = new People_8(width, height);
		btnPeople9 = new People_9(width, height);
		btnPeople10 = new People_10(width, height);
		btnPeople11 = new People_11(width, height);
	}
	
	public void update(float delta){
		generalBtn.update(delta);
		weaponBtn.update(delta);
		enemyBtn.update(delta);
		aboutBtn.update(delta);
		backBtn.update(delta);
		btnEnemy1.update(delta);
		btnEnemy2.update(delta);
		btnEnemy3.update(delta);
		btnEnemy4.update(delta);
		btnEnemy5.update(delta);
		btnEnemy6.update(delta);
		btnEnemy7.update(delta);
		btnEnemy8.update(delta);
		btnPeople1.update(delta);
		btnPeople2.update(delta);
		btnPeople3.update(delta);
		btnPeople4.update(delta);
		btnPeople5.update(delta);
		btnPeople6.update(delta);
		btnPeople7.update(delta);
		btnPeople8.update(delta);
		btnPeople9.update(delta);
		btnPeople10.update(delta);
		btnPeople11.update(delta);
	}
	
	public General getGeneralBtn(){
		return generalBtn;
	}
	
	public Weapon getWeaponBtn(){
		return weaponBtn;
	}
	
	public Enemy getEnemyBtn(){
		return enemyBtn;
	}
	
	public About getAboutBtn(){
		return aboutBtn;
	}
	
	public Back getBackBtn(){
		return backBtn;
	}
	
	public Enemy_1 getEnemy_1Btn(){
		return btnEnemy1;
	}
	
	public Enemy_2 getEnemy_2Btn(){
		return btnEnemy2;
	}
	
	public Enemy_3 getEnemy_3Btn(){
		return btnEnemy3;
	}
	
	public Enemy_4 getEnemy_4Btn(){
		return btnEnemy4;
	}

	public Enemy_5 getEnemy_5Btn(){
		return btnEnemy5;
	}
	
	public Enemy_6 getEnemy_6Btn(){
		return btnEnemy6;
	}
	
	public Enemy_7 getEnemy_7Btn(){
		return btnEnemy7;
	}
	
	public Enemy_8 getEnemy_8Btn(){
		return btnEnemy8;
	}
	
	public People_1 getPeople_1Btn(){
		return btnPeople1;
	}
	
	public People_2 getPeople_2Btn(){
		return btnPeople2;
	}
	
	public People_3 getPeople_3Btn(){
		return btnPeople3;
	}
	
	public People_4 getPeople_4Btn(){
		return btnPeople4;
	}
	
	public People_5 getPeople_5Btn(){
		return btnPeople5;
	}
	
	public People_6 getPeople_6Btn(){
		return btnPeople6;
	}
	
	public People_7 getPeople_7Btn(){
		return btnPeople7;
	}

	public People_8 getPeople_8Btn(){
		return btnPeople8;
	}
	
	public People_9 getPeople_9Btn(){
		return btnPeople9;
	}
	
	public People_10 getPeople_10Btn(){
		return btnPeople10;
	}
	
	public People_11 getPeople_11Btn(){
		return btnPeople11;
	}
}
