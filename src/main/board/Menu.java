package main.board;

import java.util.Scanner;

public class Menu {
	public Menu() {
		System.out.println("	�Խ��� �Դϴ�.");
		
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		while(menu >= 0) {
			System.out.println("���� �Խ���(1) Q&A(2) ���� �Խ���(3) �ڷΰ���(4)");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				new main.board.freeboard.Menu();menu=-1;
				break;
			case 2:
				new main.board.qna.QNA().print();
				break;
			case 3:
				new main.board.ask.Menu();menu=-1;
				break;
			case 4:
				System.out.println("	�������� �̵��մϴ�.	");
				new main.Menu();menu=-1;
				break;
			}
		}
		sc.close();
	}
}
