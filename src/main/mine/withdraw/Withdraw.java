package main.mine.withdraw;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class WithdrawInfo extends main.mine.Frame {
	public WithdrawInfo(String name, int phoneNum,String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
	}
}

public class Withdraw {
	public Withdraw() {
		String name="";
		String pass="";
		String ident="";
		int phoneNum=0;
		
		System.out.println("	ȸ��Ż�� �������Դϴ�.");
		Map<String, WithdrawInfo> hT3 = new Hashtable<>();
		hT3.put("abc", new WithdrawInfo("ȫ����",1213,"1234"));
		hT3.put("bcd", new WithdrawInfo("������",1211,"1653"));
		System.out.println(hT3.size());
		
		Scanner sc = new Scanner(System.in);
		
		while(!hT3.containsKey(ident)) {
		System.out.println("���̵� �Է��ϼ���.");
		ident = "abc";
		if(!hT3.containsKey(ident)) {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		}
		}
		while(hT3.get(ident).name.compareTo(name) != 0) {
		System.out.println("�̸��� �Է��ϼ���.");
		name = "ȫ����";
		}
		while(hT3.get(ident).pass.compareTo(pass) != 0) {
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		pass = "1234";
		}
		while(Integer.compare(hT3.get(ident).phoneNum,phoneNum) != 0) {
		System.out.println("��ȭ��ȣ �� ���ڸ��� �Է��ϼ���.");
		phoneNum = 1213;
		}

		System.out.println("ȸ�� Ż��� ��� ��ȭ�� �Ҹ��ϸ� �������� �ʽ��ϴ�.");
		System.out.println("���� ȸ��Ż�� �Ͻðڽ��ϱ�?");
		System.out.println("��(1) �ƴϿ�(2)");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("ȸ��Ż�� ���Դϴ�.");
			hT3.remove(ident); //���̵� ����
			System.out.println(ident + " ���̵��� Ż�� ó���� �Ϸ�Ǿ����ϴ�.");
			System.out.println();
			break;
		case 2:
			System.out.println("����Ͽ����ϴ�.");
			System.out.println();
			break;
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			System.out.println();
			break;
			}
	}
}
