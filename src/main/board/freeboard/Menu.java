package main.board.freeboard;

import java.util.Scanner;

public class Menu extends Freeboard{
	public Menu() {

		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (menu >= 0) {
			print();
			System.out.println("�۾���(1)  ����(2)  ����(3)  �ڷΰ���(4)");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				save();
				break;
			case 2:
				editl();
				break;
			case 3:
				remove();
				break;
			case 4:
				System.out.println("	�Խ��� �������� �̵��մϴ�.	");
				new main.board.Menu();menu=-1;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
		sc.close();
	}
}
