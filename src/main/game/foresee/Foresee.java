package main.game.foresee;

class Day {
	int day;
	Day(){
		day = 10;
	}
}
class Track{
	String wether;
	int distance;
	Track(){
		wether = "����";
		distance = 2500;
	}
}

public class Foresee {
	
	void dDay() {// ������ ���� �ϼ�.
		int k=1;
		System.out.println(k + "ȸ ������ " + new Day().day + "�� ���ҽ��ϴ�.");
//		System.out.println("���� ��Ⱑ �������Դϴ�.");
		
	}
	
	void trackInfo() {	//Ʈ������ - �Ÿ�, ����,?
		
		System.out.print("���� ����: ");
		System.out.println(new Track().wether);
		System.out.print("Ʈ�� ����: ");
		System.out.println(new Track().distance);
	}
	Foresee(){
		System.out.println();
		dDay();
		trackInfo();
		System.out.println();
	}
}
