package com.shgame.shhelpers;

import com.badlogic.gdx.InputProcessor;
import com.shgame.game.MySHgame;
import com.shgame.helpaboutworld.HelpAboutRenderer;
import com.shgame.ui.HelpAbout;
import com.shgame.ui.MultiPlayer;
import com.shgame.ui.Options;
import com.shgame.ui.SinglePlay;
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
import com.shgame.uiMultiplayer.BackMult;
import com.shgame.uiSingleplay.Control;
import com.shgame.uiSingleplay.Fire;
import com.shgame.uiSingleplay.Guy;
import com.shgame.uiSingleplay.Reload;
import com.shgame.uiSingleplay.uiCostweapon.Costweapon_1;
import com.shgame.uiSingleplay.uiCostweapon.Costweapon_10;
import com.shgame.uiSingleplay.uiCostweapon.Costweapon_2;
import com.shgame.uiSingleplay.uiCostweapon.Costweapon_3;
import com.shgame.uiSingleplay.uiCostweapon.Costweapon_4;
import com.shgame.uiSingleplay.uiCostweapon.Costweapon_5;
import com.shgame.uiSingleplay.uiCostweapon.Costweapon_6;
import com.shgame.uiSingleplay.uiCostweapon.Costweapon_7;
import com.shgame.uiSingleplay.uiCostweapon.Costweapon_8;
import com.shgame.uiSingleplay.uiCostweapon.Costweapon_9;

public class InputHandler implements InputProcessor{

	public SinglePlay mySPBtn;
	public MultiPlayer myMPBtn;
	public Options myOPBtn;
	public HelpAbout myHABtn;
	public MySHgame game;
	public General myGeneralBtn;
	public Weapon myWeaponBtn;
	public Enemy myEnemyBtn;
	public About myAboutBtn;
	public Back myBackBtn;
	public Enemy_1 enemyBtn1;
	public Enemy_2 enemyBtn2;
	public Enemy_3 enemyBtn3;
	public Enemy_4 enemyBtn4;
	public Enemy_5 enemyBtn5;
	public Enemy_6 enemyBtn6;
	public Enemy_7 enemyBtn7;
	public Enemy_8 enemyBtn8;
	public People_1 peopleBtn1;
	public People_2 peopleBtn2;
	public People_3 peopleBtn3;
	public People_4 peopleBtn4;
	public People_5 peopleBtn5;
	public People_6 peopleBtn6;
	public People_7 peopleBtn7;
	public People_8 peopleBtn8;
	public People_9 peopleBtn9;
	public People_10 peopleBtn10;
	public People_11 peopleBtn11;
	public BackMult myBackBtnMult;
	public Control myControl;;
	public Fire myFire;
	public Reload myReload;
	public Guy myGuy;
	public Costweapon_1 myCw1;
	public Costweapon_2 myCw2;
	public Costweapon_3 myCw3;
	public Costweapon_4 myCw4;
	public Costweapon_5 myCw5;
	public Costweapon_6 myCw6;
	public Costweapon_7 myCw7;
	public Costweapon_8 myCw8;
	public Costweapon_9 myCw9;
	public Costweapon_10 myCw10;
	
	public InputHandler(MySHgame game, SinglePlay spBtn, MultiPlayer mpBtn, Options opBtn, HelpAbout haBtn,
			General general, Weapon weapon, Enemy enemy, About about, Back back, Enemy_1 enemy1, Enemy_2 enemy2,
			Enemy_3 enemy3, Enemy_4 enemy4, Enemy_5 enemy5, Enemy_6 enemy6, Enemy_7 enemy7, Enemy_8 enemy8, People_1 people1,
			People_2 people2, People_3 people3, People_4 people4, People_5 people5, People_6 people6, People_7 people7, 
			People_8 people8, People_9 people9, People_10 people10, People_11 people11, BackMult backMult, Control control,
			Fire fire, Guy guy, Reload reload, Costweapon_1 cw1, Costweapon_2 cw2, Costweapon_3 cw3, Costweapon_4 cw4,
			 Costweapon_5 cw5, Costweapon_6 cw6, Costweapon_7 cw7, Costweapon_8 cw8, Costweapon_9 cw9, Costweapon_10 cw10) {
        mySPBtn = spBtn;
        myMPBtn = mpBtn;
        myOPBtn = opBtn;
        myHABtn = haBtn;
        this.game = game;
        myGeneralBtn = general;
		myWeaponBtn = weapon;
		myEnemyBtn = enemy;
		myAboutBtn = about;
		myBackBtn = back;
		enemyBtn1 = enemy1;
		enemyBtn2 = enemy2;
		enemyBtn3 = enemy3;
		enemyBtn4 = enemy4;
		enemyBtn5 = enemy5;
		enemyBtn6 = enemy6;
		enemyBtn7 = enemy7;
		enemyBtn8 = enemy8;
		peopleBtn1 = people1;
		peopleBtn2 = people2;
		peopleBtn3 = people3;
		peopleBtn4 = people4;
		peopleBtn5 = people5;
		peopleBtn6 = people6;
		peopleBtn7 = people7;
		peopleBtn8 = people8;
		peopleBtn9 = people9;
		peopleBtn10 = people10;
		peopleBtn11 = people11;
		myBackBtnMult = backMult;
		myControl = control;
		myFire = fire;
		myReload = reload;
		myGuy = guy;
		myCw1 = cw1;
		myCw2 = cw2;
		myCw3 = cw3;
		myCw4 = cw4;
		myCw5 = cw5;
		myCw6 = cw6;
		myCw7 = cw7;
		myCw8 = cw8;
		myCw9 = cw9;
		myCw10 = cw10;
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
		
		// активен экран главного меню
		if(game.getScreen().toString().contains("GameScreen")){
			mySPBtn.onClick(screenX, screenY);
			myMPBtn.onClick(screenX, screenY);
			myOPBtn.onClick(screenX, screenY);
			myHABtn.onClick(screenX, screenY);
		}
		
		// активен экран HelpAbout
		if(game.getScreen().toString().contains("HelpAboutScreen")){
			myGeneralBtn.onClick(screenX, screenY);
			myWeaponBtn.onClick(screenX, screenY);
			myEnemyBtn.onClick(screenX, screenY);
			myAboutBtn.onClick(screenX, screenY);
			/*try {
			Thread.sleep(100, 0);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}*/
			myBackBtn.onClick(screenX, screenY);
			
			if(HelpAboutRenderer.flagBtn==2){
				peopleBtn1.onClick(screenX, screenY);
				peopleBtn2.onClick(screenX, screenY);
				peopleBtn3.onClick(screenX, screenY);
				peopleBtn4.onClick(screenX, screenY);
				peopleBtn5.onClick(screenX, screenY);
				peopleBtn6.onClick(screenX, screenY);
				peopleBtn7.onClick(screenX, screenY);
				peopleBtn8.onClick(screenX, screenY);
				peopleBtn9.onClick(screenX, screenY);
				peopleBtn10.onClick(screenX, screenY);
				peopleBtn11.onClick(screenX, screenY);
			}
			
			if(HelpAboutRenderer.flagBtn==3){
				enemyBtn1.onClick(screenX, screenY);
				enemyBtn2.onClick(screenX, screenY);
				enemyBtn3.onClick(screenX, screenY);
				enemyBtn4.onClick(screenX, screenY);
				enemyBtn5.onClick(screenX, screenY);
				enemyBtn6.onClick(screenX, screenY);
				enemyBtn7.onClick(screenX, screenY);
				enemyBtn8.onClick(screenX, screenY);
			}
		}
		/*try {
			Thread.sleep(100, 0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		if(game.getScreen().toString().contains("MultiplayerScreen")){
			/*try {
				Thread.sleep(100, 0);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}*/
			myBackBtnMult.onClick(screenX, screenY);
			
		}
		
		if(game.getScreen().toString().contains("SinglePlayScreen")){
			myControl.onClick(screenX, screenY);
			myFire.onClick(screenX, screenY);
			
			myCw1.onClick(screenX, screenY);
			myCw2.onClick(screenX, screenY);
			myCw3.onClick(screenX, screenY);
			myCw4.onClick(screenX, screenY);
			myCw5.onClick(screenX, screenY);
			myCw6.onClick(screenX, screenY);
			myCw7.onClick(screenX, screenY);
			myCw8.onClick(screenX, screenY);
			myCw9.onClick(screenX, screenY);
			myCw10.onClick(screenX, screenY);
		}
		
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		if(game.getScreen().toString().contains("GameScreen")){
			mySPBtn.offClick(screenX, screenY);
			myMPBtn.offClick(screenX, screenY);
			myOPBtn.offClick(screenX, screenY);
			myHABtn.offClick(screenX, screenY);
		}
		/*try {
			Thread.sleep(100, 0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		if(game.getScreen().toString().contains("HelpAboutScreen")){
			//myGeneralBtn.offClick();
			//myWeaponBtn.offClick();
			//myEnemyBtn.offClick();
			//myAboutBtn.offClick();
			/*try {
				Thread.sleep(100, 0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			myBackBtn.offClick(screenX, screenY);
		}
		
		if(game.getScreen().toString().contains("MultiplayerScreen")){
			myBackBtnMult.offClick(screenX, screenY);
		}
		
		if(game.getScreen().toString().contains("SinglePlayScreen")){
			myControl.offClick(screenX, screenY);
			myFire.offClick(screenX, screenY);
			
			myCw1.offClick(screenX, screenY);
			myCw2.offClick(screenX, screenY);
			myCw3.offClick(screenX, screenY);
			myCw4.offClick(screenX, screenY);
			myCw5.offClick(screenX, screenY);
			myCw6.offClick(screenX, screenY);
			myCw7.offClick(screenX, screenY);
			myCw8.offClick(screenX, screenY);
			myCw9.offClick(screenX, screenY);
			myCw10.offClick(screenX, screenY);
		}
		
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
