package main.mine.passSeek;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class PassInfo extends main.mine.Frame{

	public PassInfo(String name, int phoneNum, String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
	}
}
public class PassSeek {
	public PassSeek() {
		String ident;
		
		System.out.println("	��й�ȣ ã���Դϴ�.");
		Map<String, PassInfo> hT1 = new Hashtable<>();
		hT1.put("abc", new PassInfo("ȫ����",1234,"1234"));
		hT1.put("bcd", new PassInfo("������",1211,"1653"));

		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("���̵� �Է��ϼ���.");
		ident = "abc";
		if(!hT1.containsKey(ident)) {
			System.out.println("�ش��ϴ� ���̵� �����ϴ�.");
		}
		}while(!hT1.containsKey(ident));
		System.out.println("�̸��� �Է��ϼ���.");
		String name ="ȫ����";
		System.out.println("���ο� ��й�ȣ�� �Է��ϼ���.");
		String pass = "0000";
		System.out.println("��ȭ��ȣ �� ���ڸ��� �Է��ϼ���.");
		System.out.print("010-XXXX-");
		int phoneNum = sc.nextInt();
		
		if(hT1.get(ident).equals(new PassInfo(name,phoneNum,pass))) {
			System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
			hT1.replace(ident, new PassInfo(name,phoneNum,pass));
			System.out.println("����� ��й�ȣ��: " + hT1.get(ident).pass);
		}
		else {
			System.out.println("������ ��ġ���� �ʽ��ϴ�.");
		}
	}
}
