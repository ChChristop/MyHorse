package itemshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Item_1 {	
	String item;
	int price;
	
	ArrayList<Item_1> list = new ArrayList<Item_1>();
	Scanner sc = new Scanner(System.in);
	
	public Item_1(String item1, int price) {
		this.item = item1;
		this.price = price;
	}
	
	public String getName() {
		return this.item;
	}
	
	public void print() {
		
		for (int i=0; i<list.size(); i++) {
			System.out.println("�̸� " + list.get(i).getName() + "����: " + list.get(i).getPrice() + "�� �Դϴ�.");
		}
	} 
	
	public int getPrice() {
		return this.price;
	}
	
	public Item_1() {
		
		
	}

}
