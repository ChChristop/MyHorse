package main.events.cuEvent;

import java.util.ArrayList;
import java.util.Scanner;

class EventList{
	int number;
	String title;
	EventList(){
	}
	EventList(int number, String title){
		this.number =number;
		this.title =title;
	}
}

public class Menu{
	ArrayList<EventList> cuEventList = new ArrayList<>();
	
//	cuEventList.add(new EventList(1,"출석 체크"));
//	cuEventList.add(new EventList(2,"포인트 2배 이벤트"));
//	
	Scanner sc = new Scanner(System.in);


	public void run() {
		int menu=0;
		
	System.out.println("	진행중인 이벤트 목록");
//	
//	for(EventList clist:cuEventList) {
//		System.out.println(clist.number +"." + clist.title);
//	}
	while(menu >= 0) {
		System.out.println("출석체크 (1), 포인트 2배 이벤트 (2) 뒤로가기 (3)");
//		for(EventList clist:cuEventList) {
//		System.out.print(clist.title +" (" + clist.number +") ");
//		}
//		System.out.println("뒤로가기 (" + (1 + cuEventList.size())+")");
		
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			new CalcCheck();
			break;
		case 2:
			System.out.println("	포인트 2배 이벤트");
			System.out.println("홀수일 획득 포인트 2배 이벤트");
//			new main.events.endEvent.Menu();
			break;
		case 3:
			System.out.println("	이전으로 이동합니다.	");
			menu=-1;
			break;
		}
	}
	}
}
