package main.mine.join;

import java.util.Scanner;

import java.util.Hashtable;
import java.util.Map;

class JoinInfo extends main.mine.Frame {
	public JoinInfo(String name, int phoneNum,String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
	}
}

public class Join {
	public Join() {
		String ident;
		
		System.out.println("	ȸ������ �������Դϴ�.");
		Map<String, JoinInfo> hT1 = new Hashtable<>();
		hT1.put("abc", new JoinInfo("ȫ����",1213,"1234"));
		hT1.put("bcd", new JoinInfo("������",1211,"1653"));
		System.out.println("����"+hT1.size()+"���� ȸ���� �ֽ��ϴ�.");

		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("���̵� �Է��ϼ���.");
		ident = "ab";
		if(hT1.containsKey(ident)) {
			System.out.println("�̹� ������� ���̵��Դϴ�.");
		}
		}while(hT1.containsKey(ident));
			
		System.out.println("�̸��� �Է��ϼ���.");
		String name = "������";
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String pass = "2580";
		System.out.println("��ȭ��ȣ �� ���ڸ��� �Է��ϼ���.");
		int phoneNum = sc.nextInt();

		hT1.put(ident, new JoinInfo(name,phoneNum,pass)); //���̵� ����
		System.out.println(ident + "���̵� �����Ǿ����ϴ�.");
		System.out.println("�̸�: "+ name + ", ��й�ȣ: " + pass + ", ��ȭ��ȣ �� 4�ڸ�: " + phoneNum);
		
	}
}
