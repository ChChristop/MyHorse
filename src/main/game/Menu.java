package main.game;

import java.util.Scanner;

public class Menu {
	public Menu() {
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		new main.game.foresee.Menu();
		
		while(menu >= 0) {
			System.out.println("��� ����(0) ������ ����(1) ��� ���(2) ���� ����(3) �ڷΰ���(4)");
			menu = sc.nextInt();
			
			switch(menu) {
			case 0:
				new main.game.foresee.Menu();
				break;
			case 1:
				new main.game.horses.Menu();
				break;
			case 2:
				new main.game.record.Menu();
				break;
			case 3:
				new main.game.gambling.Menu();
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
