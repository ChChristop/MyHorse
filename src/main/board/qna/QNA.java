package main.board.qna;

import java.util.Scanner;
import java.util.Vector;

class QNAList{
	String titel;
	String inhalt;
	String writer;
	int num;
	QNAList(){
		titel = "����	";
		inhalt = "����";
		writer = "�۾���";
		num = 0;
	}
	QNAList(String titel, String inhalt, String writer, int num){
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

public class QNA {
	String writer = "abc";
	
	QNAList qnaL = new QNAList();
	Vector<QNAList> qnaList = new Vector<>();
	QNADao qDao = new QNADao();
			
	Scanner sc = new Scanner(System.in);
	
	//�޴�ȭ��
	public QNA() {
		qnaList.add(new QNAList());
		for(int i = 0; i<qDao.getQNAList().size(); i++) {
			qnaList.add(qDao.getQNAList().get(i));
		}
	}
	
	//���� ����: �Ű������� ���ڿ����� ������ �´� arrayList�� �߰�
	void save() {
		qnaList.add(new QNAList(getTitel(),getInhalt(), writer, qnaList.size()));
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
		return Integer.toString(qnaList.size());
	}
	
	//��ü ��ȸ
	public void print() {	
		qnaList.get(0).showList();
		for(int i = qnaList.size()-1 ; i>0; i--) {
			qnaList.get(i).showList();
			}
	}
	void editl() {
		System.out.println("��� �Խù��� �����Ͻðڽ��ϱ�?");
		int z = sc.nextInt();
		sc.nextLine();
		qnaList.get(z).setTitel(getTitel());
		qnaList.get(z).setInhalt(getInhalt());
		qnaList.get(z).showList();
		System.out.println();
	}
	
	void remove() {
		System.out.println("��� �Խù��� �����Ͻðڽ��ϱ�?");
		int z = sc.nextInt();
		qnaList.remove(z);
		
	}
	
	void exit() {
		System.out.println("�������� �̵��մϴ�.");
		System.exit(0);
	}
}
