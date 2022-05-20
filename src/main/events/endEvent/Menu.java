package main.events.endEvent;

import java.util.ArrayList;
import java.util.Scanner;

class EventList{
	int number;
	String title;
	EventList(){
	}
	EventList(int number, String title){
		this.number = number;
		this.title = title;
	}
}

public class Menu{
	ArrayList<EventList> endEventList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

//	endEventList.add(new EventList(1,"오픈 기념 이벤트1"));
//	endEventList.add(new EventList(2,"오픈 기념 이벤트2"));
	
	
	public void run() {
		int menu=0;
//		for(EventList elist:endEventList) {
//			System.out.println(elist.number +"." + elist.title);
//		}
	while(menu >= 0) {
		System.out.println("오픈 기념 이벤트1(1) 오픈 기념 이벤트2(2) 뒤로가기(3)");
//		for(EventList eList : endEventList) {
//		System.out.print(eList.title +" (" + eList.number +") ");
//		}
//		System.out.println("뒤로가기 (" + (1 + endEventList.size())+")");
		
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("	오픈 기념 이벤트1");
			System.out.println("오픈 기념 포인트 10배 획득 이벤트");
			System.out.println();
			break;
		case 2:
			System.out.println("	오픈 기념 이벤트2");
			System.out.println("오픈 기념 출석체크 이벤트");
			System.out.println();
			break;
		case 3:
			System.out.println("	메인으로 이동합니다.	");
			menu=-1;
			break;
		}
		}
	}
}
