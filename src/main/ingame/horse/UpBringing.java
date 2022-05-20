package main.ingame.horse;

import java.util.Scanner;

/*����: 
 * ����
 * ������
 * ��Ա�
 * ��Ÿ� �ٱ�
 * �����Ʒ�
 * ��
 * �����/ü�� ���ѵα� <100
 * ��� ����
*/
interface A{
	void swtichJobs(MyHorse h);
	void levelUp(MyHorse h);
	void eat(MyHorse h);
	void longDistance(MyHorse h);
	void jump(MyHorse h);
	void sleep(MyHorse h);
	void condStamiCheck(MyHorse h);
	void status(MyHorse h);
}

public class UpBringing implements A {
	
	MyHorse h = new MyHorse();
	int count = 0;
	
	//����
	public void swtichJobs(MyHorse h) {
		
		System.out.println( "� ���� �����Ͻðڽ��ϱ�?");
		System.out.println("���ָ�(1)  ���ึ(2)  ���Ը�(3)  ������(4)");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		switch(a) {
			case 1: 
				h.setRaceType("���ָ�");
				System.out.println("���ָ��� �����Ͽ����ϴ�!");
				break;
			case 2: 
				h.setRaceType("���ึ");
				System.out.println("���ึ�� �����Ͽ����ϴ�!");
				break;
			case 3: 
				h.setRaceType("���Ը�");
				System.out.println("���Ը��� �����Ͽ����ϴ�!");
				break;
			case 4: 
				h.setRaceType("������");
				System.out.println("�������� �����Ͽ����ϴ�!");
				break;		
		}	
	}
	
	public void condStamiCheck(MyHorse h) {
		if(h.getCondition()>=100) {
			h.setCondition(100);
		}
		if( h.getStamina()>=100) {
			h.setStamina(100);
		}
		
	}
	
	public void status(MyHorse h) {
		System.out.println("���� ����ġ: " + h.getExp() + " �����: " + h.getCondition() + 
				" ü��: " + h.getStamina() + " ȣ����: " + h.getSympathetic());
		System.out.println("=================================================");
	}
	
	
	//�� ������(����ġ ���ǿ� �������)
	public void levelUp(MyHorse h){
		
		
		if(h.getLevel()>=1 && h.getLevel() <=10) {
			if(h.getExp() == h.getLevel() * 100){
				h.addLevel(1);	
				h.setCondition(100);
				h.setExp(0);
				h.setStamina(100);
				h.setSympathetic("��");
				System.out.println("�����մϴ�! " + h.getLevel()+ "������ �޼��߽��ϴ�! ");
				}
		}else if(h.getLevel()>=11 && h.getLevel()<18) {
			if(h.getExp() == h.getLevel()*200-1000) {
				h.addLevel(1);	
				h.setCondition(100);
				h.setExp(0);
				h.setStamina(100);
				h.setSympathetic("��");
				System.out.println("�����մϴ�! " + h.getLevel()+ "������ �޼��߽��ϴ�! ");
				}
		}else if(h.getExp() == h.getLevel()*300-2800) {
				h.addLevel(1);	
				h.setCondition(100);
				h.setExp(0);
				h.setStamina(100);
				h.setSympathetic("��");
				System.out.println("�����մϴ�! " + h.getLevel()+ "������ �޼��߽��ϴ�! ");
		}else {
			System.out.println();
			
		}
	}
	
	
	//����̱�
	public void eat(MyHorse h) {
		if(count<5) {
			this.count +=1;
			System.out.println("======================���� �Ծ����ϴ�" + count +"/5"+ "=======================");
			h.addExp(5);
			h.addCondition(10);
			h.addStamina(40);
			h.setSympathetic("��");
			levelUp(h);
			
			condStamiCheck(h);
			
			System.out.println("���� ����ġ: " + h.getExp() + " �����: " + h.getCondition() + 
					" ü��: " + h.getStamina() + " ȣ����: " + h.getSympathetic());
			System.out.println("=================================================");
		}else {
			System.out.println("===================���̻� ���� ���̸� �ȵ˴ϴ�!!=============");
		}
		
		System.out.println();
	}
	
	public void longDistance(MyHorse h) {
		
		if(h.getStamina() <= 10 || h.getCondition()<=20) {
			System.out.println("===================���̻� �Ʒ��� ��Ű�� �ȵ˴ϴ�!!=============");
		}else {
			System.out.println("=====================��Ÿ� �޸��� �Ʒ��� �Ͽ����ϴ�.===================");
			h.addExp(10);
			h.addCondition(-20);
			h.setSympathetic("��");
			h.addStamina(-10);
			levelUp(h);
			
			condStamiCheck(h);
			status(h);
		}
		System.out.println();
	}
	
	
	public void jump(MyHorse h) {
		if(h.getStamina() <= 10 || h.getCondition()<=10) {
			System.out.println("===================���̻� �Ʒ��� ��Ű�� �ȵ˴ϴ�!!=============");
		}else {
			System.out.println("======================�����Ʒ��� �Ͽ����ϴ�=================");
			h.addExp(50);
			h.addCondition(-10);
			h.setSympathetic("��");
			h.addStamina(-10);
			levelUp(h);
			
			condStamiCheck(h);
			status(h);
		}
		System.out.println();
	}
	
	public void sleep(MyHorse h) {
		
		System.out.println("===================zzzzzz=======================");
		h.addExp(5);
		h.addCondition(10);
		h.setSympathetic("��");
		h.setStamina(100);
		levelUp(h);
		
		condStamiCheck(h);
		status(h);
	
		System.out.println();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}