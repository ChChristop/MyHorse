package main.ingame.horse;

import java.util.ArrayList;

import main.itemshop.Item_1;

public class Item {
	
	MyHorse h = new MyHorse();
	
	
	public void useSpeedItem(MyHorse h) {
		h.addSpeed(10);
	}
	
	public void useStaminaItem(MyHorse h) {
		h.getMyHorses().get(0).addStamina(20);
	} 
	
//	public void useAttackItem(Item_1 list) {
//		h.getMyHorses().get(0).addSpeed(10);
//	}
//	
	public void useExpItem(MyHorse h) {
		h.getMyHorses().get(0).addExp(100);
	}	
}
