package main.game.gambling;

import java.util.ArrayList;
import java.util.TreeSet;

class Betting implements Comparable<Betting>{
	public int point;
	public String name;
	
	Betting(int point,String name) {
		this.point = point;
		this.name = name;
	}
	@Override
		public int compareTo(Betting b1){
		if(point<b1.point) { return 1; }
		else if (point==b1.point) {return 0;}
		else return -1;
	}
}

public class Gambling {	// �������� ����
	Gambling(){
		System.out.println();
		
		TreeSet<Betting> blist =new TreeSet<>();
		blist.add(new Betting(1000,"1����"));
		blist.add(new Betting(1500,"2����"));
		blist.add(new Betting(2000,"3����"));
		blist.add(new Betting(1500,"4����"));
		blist.add(new Betting(5000,"5����"));
		blist.add(new Betting(500,"6����"));

		System.out.println("ȸ ���� ����");
		int bSize = blist.size();
		long btotal = 0L;
		ArrayList<Betting> btemp = new ArrayList<>();
		
		for(int i = 0; i<bSize; i++) {
			btemp.add(blist.pollFirst()); 
			btotal += (long)btemp.get(i).point;
		}
			for(int i = 0; i<bSize; i++) {
			System.out.print(i+1 + "��: " + btemp.get(i).name + ", " + btemp.get(i).point +"����Ʈ");
			System.out.printf(". ���� %.2f��%n",0.9*btotal/(btemp.get(i).point));
			}
		
		System.out.println("���þ�: �� " + btotal+ "����Ʈ");
		System.out.println();
	}
}
