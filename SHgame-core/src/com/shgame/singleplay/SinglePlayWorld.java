package com.shgame.singleplay;

import com.shgame.uiSingleplay.Bullet;
import com.shgame.uiSingleplay.Control;
import com.shgame.uiSingleplay.Fire;
import com.shgame.uiSingleplay.Guy;
import com.shgame.uiSingleplay.Reload;
import com.shgame.uiSingleplay.Seal;
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

public class SinglePlayWorld {

	private Control controlBtn;
	private Fire fireBtn;
	private Guy guyBtn;
	private Reload reloadBtn;
	private Bullet bul;
	private Seal seal;
	private Costweapon_1 cw1Btn;
	private Costweapon_2 cw2Btn;
	private Costweapon_3 cw3Btn;
	private Costweapon_4 cw4Btn;
	private Costweapon_5 cw5Btn;
	private Costweapon_6 cw6Btn;
	private Costweapon_7 cw7Btn;
	private Costweapon_8 cw8Btn;
	private Costweapon_9 cw9Btn;
	private Costweapon_10 cw10Btn;
	
	public SinglePlayWorld(float width, float height){
		controlBtn = new Control(width, height);
		fireBtn = new Fire(width, height);
		guyBtn = new Guy(width, height);
		reloadBtn = new Reload(width, height);
		bul = new Bullet(width, height);
		seal = new Seal(width, height);
		cw1Btn = new Costweapon_1(width, height);
		cw2Btn = new Costweapon_2(width, height);
		cw3Btn = new Costweapon_3(width, height);
		cw4Btn = new Costweapon_4(width, height);
		cw5Btn = new Costweapon_5(width, height);
		cw6Btn = new Costweapon_6(width, height);
		cw7Btn = new Costweapon_7(width, height);
		cw8Btn = new Costweapon_8(width, height);
		cw9Btn = new Costweapon_9(width, height);
		cw10Btn = new Costweapon_10(width, height);
	}
	
	public void update(float delta){
		controlBtn.update(delta);
		fireBtn.update(delta);
		guyBtn.update(delta);
		reloadBtn.update(delta);
		bul.update(delta);
		seal.update(delta);
		cw1Btn.update(delta);
		cw2Btn.update(delta);
		cw3Btn.update(delta);
		cw4Btn.update(delta);
		cw5Btn.update(delta);
		cw6Btn.update(delta);
		cw7Btn.update(delta);
		cw8Btn.update(delta);
		cw9Btn.update(delta);
		cw10Btn.update(delta);
	}
	
	public Control getControlBtn(){
		return controlBtn;
	}
	
	public Fire getFireBtn(){
		return fireBtn;
	}
	
	public Guy getGuyBtn(){
		return guyBtn;
	}
	
	public Reload getReloadBtn(){
		return reloadBtn;
	}
	
	public Bullet getBul(){
		return bul;
	}
	
	public Seal getSeal(){
		return seal;
	}
	
	public Costweapon_1 getCw1Btn(){
		return cw1Btn;
	}
	
	public Costweapon_2 getCw2Btn(){
		return cw2Btn;
	}
	
	public Costweapon_3 getCw3Btn(){
		return cw3Btn;
	}
	
	public Costweapon_4 getCw4Btn(){
		return cw4Btn;
	}
	
	public Costweapon_5 getCw5Btn(){
		return cw5Btn;
	}
	
	public Costweapon_6 getCw6Btn(){
		return cw6Btn;
	}
	
	public Costweapon_7 getCw7Btn(){
		return cw7Btn;
	}
	
	public Costweapon_8 getCw8Btn(){
		return cw8Btn;
	}
	
	public Costweapon_9 getCw9Btn(){
		return cw9Btn;
	}
	
	public Costweapon_10 getCw10Btn(){
		return cw10Btn;
	}
}
