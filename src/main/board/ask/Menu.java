package main.board.ask;

import java.util.Scanner;

public class Menu extends Ask{
	public Menu() {
		
		Ask ask = new Ask();
		System.out.println("	�����ϱ� �Խ����Դϴ�");
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (menu >= 0) {
			ask.print();
			System.out.println("�۾���(1)  ����(2)  ����(3)  �ڷΰ���(4)");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				ask.save();
				break;
			case 2:
				ask.editl();
				break;
			case 3:
				ask.remove();
				break;
			case 4:
				System.out.println("	�Խ��� �������� �̵��մϴ�.	");
				new main.board.Menu();menu=-1;
				break;
			}
		}
		sc.close();
	}
}

