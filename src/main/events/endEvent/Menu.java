package main.events.endEvent;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends EndEvent{
	public Menu() {
		
		ArrayList<EventList> endEventList = new ArrayList<>();
		endEventList.add(new EventList(1,"���� ��� �̺�Ʈ1"));
		endEventList.add(new EventList(2,"���� ��� �̺�Ʈ2"));
		
		for(EventList elist:endEventList) {
			System.out.println(elist.number +"." + elist.title);
		}
		
			Scanner sc = new Scanner(System.in);
			int menu=0;
	
	
	while(menu >= 0) {
		for(EventList eList : endEventList) {
		System.out.print(eList.title +" (" + eList.number +") ");
		}
		System.out.println("�ڷΰ��� (" + (1 + endEventList.size())+")");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("	���� ��� �̺�Ʈ1");
			System.out.println("���� ��� ����Ʈ 10�� ȹ�� �̺�Ʈ");
			System.out.println();
			break;
		case 2:
			System.out.println("	���� ��� �̺�Ʈ2");
			System.out.println("���� ��� �⼮üũ �̺�Ʈ");
			System.out.println();
			break;
		case 3:
			System.out.println("�̺�Ʈ �������� �̵��մϴ�.	");
			new main.events.Menu();menu=-1;
			break;
		}
		
	}
	sc.close();
	}
}
