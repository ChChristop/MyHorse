package main.board.ask;

import java.util.Scanner;
import java.util.Vector;

class AskList{
		String titel;
		String inhalt;
		String writer;
		int num;
		AskList(){
			titel = "����	";
			inhalt = "����";
			writer = "�۾���";
			num = 0;
		}
		AskList(String titel, String inhalt, String writer, int num){
			this.titel = titel;
			this.inhalt = inhalt;
			this.writer = writer;
			this.num = num;
		}
		public String getTitel() {
			return titel;
		}
		public void setTitel(String titel) {
			this.titel = titel;
		}
		public String getInhalt() {
			return inhalt;
		}
		public void setInhalt(String inhalt) {
			this.inhalt = inhalt;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public void showList() {
			if(num == 0) {
			System.out.println("	"+ titel +"	"+ writer);
			}
			else {
			System.out.println(num +"	"+ titel +"		"+ writer);
			System.out.println("����: "+ inhalt);
			}
		}
}

public class Ask {
	String writer = "abc";
	
	AskList askL = new AskList();
	Vector<AskList> askList = new Vector<>();
	AskDao aDao = new AskDao();
	
	Scanner sc = new Scanner(System.in);
	
	//�޴�ȭ��
	public Ask() {
		askList.add(new AskList());
		for(int i = 0; i<aDao.getAskList().size(); i++) {
		askList.add(aDao.getAskList().get(i));
		}
	}
	
	//���� ����: �Ű������� ���ڿ����� ������ �´� arrayList�� �߰�
	void save() {
		askList.add(new AskList(getTitel(),getInhalt(), writer, askList.size()));
	}
	
	String getTitel() {
		System.out.println("����: ");
		String titel = sc.nextLine();
		return titel;
	}
	String getInhalt(){
		System.out.println("����: ");
		return sc.nextLine();
	}
	String getWriter() {
		System.out.println("�۾���: ");
		return sc.nextLine();
	}
	String getNumber() {
		return Integer.toString(askList.size());
	}
	
	//��ü ��ȸ
	void print() {	
		askList.get(0).showList();
		for(int i = askList.size()-1 ; i>0; i--) {
			askList.get(i).showList();
		}
		System.out.println();
		
	}
	void editl() {
		System.out.println("��� �Խù��� �����Ͻðڽ��ϱ�?");
		int z = sc.nextInt();
		sc.nextLine();
		askList.get(z).setTitel(getTitel());
		askList.get(z).setInhalt(getInhalt());
		askList.get(z).showList();
		System.out.println();
	}
	
	void remove() {
		System.out.println("��� �Խù��� �����Ͻðڽ��ϱ�?");
		int z = sc.nextInt();
		askList.remove(z);
	}
	
	void exit() {
		System.out.println("�������� �̵��մϴ�.");
		System.exit(0);
	}
}
