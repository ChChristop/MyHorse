package main.mine;

import java.util.Scanner;

public class Menu {
	boolean loginFlag=false;
	public Menu() {
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		while(menu >= 0) {
			if(!loginFlag) {
				System.out.println("�α����� �ʿ��� �޴��Դϴ�.");
				System.out.println("ȸ������(1) �α���(2) ��й�ȣ ã��(3) �ڷΰ���(4) �ӽ�-Ż��(5)");
			}else {
				System.out.println("���̵� : " + "abc");
				System.out.println("������(1) �α׾ƿ�(2) Ż��(3) �ڷΰ���(4)");
			}
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				new main.mine.join.Join();
//								
				break;
			case 2:
				new main.mine.loginout.Loginout();
//				new main.mine.
				break;
			case 3:
				//(loginFlag)? 
				//new main.mine.withdraw.Withdraw(); 
				new main.mine.passSeek.PassSeek();
				break;
			case 4:
				System.out.println("	�������� �̵��մϴ�.	");
				new main.Menu();menu=-1;
				break;
			case 5:
				new main.mine.withdraw.Withdraw();
				break;	
			}
		}
		sc.close();
	}
}
