package itemshop;

import java.util.Scanner;

public class CasgRecharge_new1 {

	public static void main(String[] args) {
		int money = 0; 
	
		
		System.out.println("������ �Ͻðڽ��ϱ�?");
		System.out.println("ĳ����ȸ(1), ĳ������(2) ����(3)");
		Scanner sc = new Scanner(System.in); 
		
		
		for(int i=0;i<100;i++) {// ����ڰ� ���ϴ� ��ŭ Ƚ���� �ݺ��ؾ� �ϹǷ� �ݺ��� ���
			int choice=sc.nextInt(); // ����ڷκ��� ��ȣ�� �Է¹ޱ� ���� choice ����
			
			// ĳ����ȸ
			if(choice==1) {
				System.out.println("���� �ܾ��� "+money+"�� �Դϴ�");
			}
			
			//ĳ������
			if(choice==2) {
				System.out.println("�󸶸� �����Ͻðڽ��ϱ�?");
				int insertMoney=sc.nextInt(); // ����ڰ� �Ա��� �ݾ� 
				money+=insertMoney;
				System.out.println(money+ "����Ʈ�� �����Ǿ����ϴ�.");
			}
			
			// ���� 
			if(choice==3) {
				System.out.println("������ �� �ٽ� �̿����ּ���");
				break;
			} 
			
			System.out.println("���Ͻô� �޴��� �������ּ��� ĳ����ȸ(1), ĳ������(2) ����(3)");
		}
	}

}

	
	