package main.board;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	int menu2=0;
	
	main.board.freeboard.Menu freeboardMenu = new main.board.freeboard.Menu();
	main.board.qna.QNA qna = new main.board.qna.QNA();
	main.board.ask.Menu askMenu = new main.board.ask.Menu();
	
	public void run() {
		System.out.println("	게시판 입니다.");

		while(menu2 >= 0) {
			System.out.println("자유 게시판(1) Q&A(2) 문의 게시판(3) 뒤로가기(4)");
			menu2 = sc.nextInt();
			
			switch(menu2) {
			case 1:
				freeboardMenu.run();
				break;
			case 2:
				qna.print();
				//관리자 로그인시 수정가능하게 변경예정
				break;
			case 3:
				askMenu.run();
				break;
			case 4:
				System.out.println("	메인으로 이동합니다.	");
				menu2=-1;
				break;
			}
		}
	}
}
