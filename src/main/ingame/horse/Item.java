package main.ingame.horse;

import java.util.ArrayList;

import main.itemshop.Item_1;

public class Item {
	
	MyHorse h = new MyHorse();
	RaceHorse r = new RaceHorse();
	UpBringing u = new UpBringing();
	
	public void useSpeedItem(MyHorse h) {
		h.addSpeed(10);
	}
	
	public void useStaminaItem(MyHorse h) {
		h.addStamina(20);
	} 

// 수현씨~ 이거 잘 모르겠어요.
// 말 랜덤 생성한거 불러서 ?? addSpeed(-20) 해줘야될거 같은데 
// r.createRandomNumber2().addSpeed(-20) 이렇게 하면 안되네염. ㅠㅠ 
//	public void useAttackItem(RaceHorse r) {
//		r.createRandomNumber2();
//	}
	
	public void useExpItem(MyHorse h) {
		h.addExp(100);
		//아이템 썼을때 경험치가 올라도 레벨이 안올라요.
		//ingame에서 u.levelUp(h.getMyHorses().get(0)); 시도해봣는데 안됩니다
		//(거기도 주석처리 해둠)
		
	}	
}
