package main.game.horses;

import java.util.TreeSet;

class Horse implements Comparable<Horse>{
	public int order;
	public String name;
	
	Horse(int order,String name) {
		this.order = order;
		this.name = name;
	}
	@Override
		public int compareTo(Horse h1){
		if(order<h1.order) { return -1; }
		else if (order==h1.order) {return 0;}
		else return 1;
	}
}
public class Horses {	// ������ ���� ���
	Horses(){
		System.out.println();
		
		TreeSet<Horse> hlist =new TreeSet<>();
		hlist.add(new Horse(3,"1����"));
		hlist.add(new Horse(4,"2����"));
		hlist.add(new Horse(2,"3����"));
		hlist.add(new Horse(1,"4����"));
		hlist.add(new Horse(6,"5����"));
		hlist.add(new Horse(5,"6����"));

		System.out.println("ȸ ������ ����");
		int hSize = hlist.size();
		
		for(int i = 0; i<hSize; i++) {
			System.out.print(i+1 + "����: ");
			System.out.println(hlist.pollFirst().name);
			}
		System.out.println();
	}
}