package main;

import java.util.Scanner;

public class Frame {
	Frame(){
		Scanner sc = new Scanner(System.in);
		int menu=0;
			System.out.println("xxx�� ���� �� ȯ���մϴ�.");
			System.out.println("�޴��� �������ּ���");
	while(menu >= 0) {
		System.out.println("������(0) ��� ����(1) �Խ���(2) �̺�Ʈ(3) �ΰ���(4) ������(5)");
		menu = sc.nextInt();
		switch(menu) {
		case 0:
			new main.mine.Menu();menu=-1;
			break;
		case 1:
			new main.game.Menu();menu=-1;
			break;
		case 2:
			new main.board.Menu();menu=-1;
			break;
		case 3:
			new main.events.Menu();menu=-1;
			break;
		case 4:
			new main.ingame.race.Main();menu=-1;
			break;
		case 5:
			System.out.println("	�� ���ּ���.	");menu=-1;
			System.exit(0);
			break;
			}
		}
	}
}

