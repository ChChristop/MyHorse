package itemshop;

import java.util.Scanner;

public class ltemlist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Item_1 item1 = new Item_1("���ǵ�  ", 10 );
		Item_1 item2 = new Item_1("���׹̳�  ", 100);
		Item_1 item3 = new Item_1("���ݷ�  ", 200);
		Item_1 item4 = new Item_1("����ġ  ", 300);
	
		
		int choiceMainMenu = 0;
		
		while(choiceMainMenu >= 0) {
		// �����ۼ� ����
		System.out.println(" 1.  �����ۼ� ");
		System.out.println(" 2.  ĳ������ �� ��ȸ ");
		System.out.println("=============");
		System.out.println(" ��ȣ�� �Է����ּ���. ");
		choiceMainMenu = sc.nextInt();

		// ������ ���
		int itemListChoice = 0;
		while(choiceMainMenu >= 0) {
		System.out.println();
		System.out.println(" 1.  ���ǵ� �� ");
		System.out.println(" 2.  ���׹̳� �� ");
		System.out.println(" 3.  ���ݷ� �� ");
		System.out.println(" 4.  ����ġ �� ");
		System.out.println(" ��ȣ�� �Է����ּ���. ");
		itemListChoice = sc.nextInt();
		sc = new Scanner(System.in);
		
		int buyYN1 = 0;
		int buyYN2 = 0;
		int buyYN3 = 0;
		int buyYN4 = 0;
		
		switch(itemListChoice) {
		
		case 1:
			System.out.println( item2.getName() + item2.getPrice() + "�����մϴ�." + item2.getPrice() + "�� �Դϴ�.");
			System.out.println("- ���ſ��θ� �Է����ּ���. (1.�����ϱ� 2.�ڷΰ���) >> ");
			buyYN1 =  sc.nextInt();
			switch(buyYN1) {
			
			case 1:
				// ����
				System.out.println("���Ű� �Ǿ����ϴ�.");
				System.out.println();
				break;
			case 2:
				// �ڷΰ���
				 break;
			} 
			
		
		case 2:
			System.out.println( item2.getName() + item2.getPrice() + "�����մϴ�." + item2.getPrice() + "�� �Դϴ�.");
			System.out.println("- ���ſ��θ� �Է����ּ���. (1.�����ϱ� 2.�ڷΰ���) >> ");
			buyYN2 =  sc.nextInt();
			switch(buyYN2) {	
			
			case 1:
				// ����
				System.out.println("���Ű� �Ǿ����ϴ�.");
				System.out.println();
				break;
			case 2:
				// �ڷΰ���
				break;
			} 
			break;
			
		case 3:
			System.out.println( item2.getName() + item2.getPrice() + "�����մϴ�." + item2.getPrice() + "�� �Դϴ�.");
			System.out.println("- ���ſ��θ� �Է����ּ���. (1.�����ϱ� 2.�ڷΰ���) >> ");
			buyYN3 =  sc.nextInt();
			switch(buyYN3) {
			
			case 1:
				// ���� 
				System.out.println("���Ű� �Ǿ����ϴ�.");
				System.out.println();
				break;
			case 2:
				// �ڷΰ���
				break;
			} 
			break;
			
		case 4:
			System.out.println( item2.getName() + item2.getPrice() + "�����մϴ�." + item2.getPrice() + "�� �Դϴ�.");
			System.out.println("- ���ſ��θ� �Է����ּ���. (1.�����ϱ� 2.�ڷΰ���) >> ");
			buyYN4 =  sc.nextInt();
			switch(buyYN4) {
			
			case 1:
				// ����
				System.out.println("���Ű� �Ǿ����ϴ�.");
				System.out.println();
				break;
			case 2:
				// �ڷΰ���		
				break;
		}
			break;
				}
		
		}
		}
		
	}
		}
