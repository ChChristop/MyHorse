package itemshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Item_1 {	
	String item;
	String Stat;
	int price;
	
	
	
	ArrayList<Item_1> list = new ArrayList<Item_1>();
	Scanner sc = new Scanner(System.in);
	
	public Item_1(String item1, String Stat, int price) {
		this.item = item1;
		this.Stat = Stat;
		this.price = price;
		
	}
	
	public String getName() {
		return this.item;
	}
	
	
	public int getPrice() {
		return this.price;
	}
	
	public String getStat() {
		return this.Stat;
	}
	
	public void print() {
		
		for (int i=0; i<list.size(); i++) {
			System.out.println("이름 " + list.get(i).getName() + list.get(i).getStat()+"가격: " + list.get(i).getPrice()  + "입니다");
		}
	} 
	
	
	
	public Item_1() {	

		// 아이템 이름, 효과, 가격
		Item_1 item1 = new Item_1("스피드  ", "스피드가 10 증가합니다.",  10);
		Item_1 item2 = new Item_1("스테미나  ", "스테미나가 20 증가합니다.",  100);
		Item_1 item3 = new Item_1("공격력  ", "공격력이 20 증가합니다.",  200);
		Item_1 item4 = new Item_1("경험치  ", "경험치가 100 증가합니다.", 300);

		
	}

}
