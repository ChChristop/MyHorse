package main;

import java.util.Scanner;

public class Frame {
	Scanner sc = new Scanner(System.in);
	
	main.mine.Menu mineMenu = new main.mine.Menu();
	main.game.Menu gameMenu = new main.game.Menu();
	main.board.Menu boardMenu = new main.board.Menu();
	main.events.Menu eventsMenu = new main.events.Menu();
	main.ingame.race.Ingame raceMain =new main.ingame.race.Ingame();
	
	Frame(){
			System.out.println("xxx에 오신 걸 환영합니다.");
			System.out.println("메뉴를 선택해주세요");
	}
	
	public void run(){
		int menu=0;
		
	while(true) {
		System.out.println("내정보(0) 경기 정보(1) 게시판(2) 이벤트(3) 인게임(4) 나가기(5)");
		menu = sc.nextInt();
		switch(menu) {
		case 0:
			mineMenu.run();
			break;
		case 1:
			gameMenu.run();
			break;
		case 2:
			boardMenu.run();
			break;
		case 3:
			eventsMenu.run();
			break;
		case 4:
			raceMain.run();
			break;
		case 5:
			System.out.println("	또 와주세요.	");
			System.exit(0);
			break;
			}
		}
	}
}

