package main.game.record;

import java.util.TreeSet;

class Horse implements Comparable<Horse>{
	public int rank;
	public String name;
	Horse(int rank,String name) {
		this.rank = rank;
		this.name = name;
	}
	@Override
		public int compareTo(Horse h1){
		if(rank<h1.rank) { return -1; }
		else if (rank==h1.rank) {return 0;}
		else return 1;
	}
}
public class Record {	//���� ȸ�� ��� Ȯ��
	Record() {
		System.out.println();
		
	TreeSet<Horse> hlist =new TreeSet<>();
	hlist.add(new Horse(3,"1��"));
	hlist.add(new Horse(4,"2��"));
	hlist.add(new Horse(2,"3��"));
	hlist.add(new Horse(1,"4��"));
	hlist.add(new Horse(6,"5��"));
	hlist.add(new Horse(5,"6��"));

	System.out.println("ȸ ��� ����");
	int hSize = hlist.size();
		for(int i = 0; i<hSize; i++) {
			System.out.print(i+1 + "��: ");
			System.out.println(hlist.pollFirst().name);
			}
		System.out.println();
	}
}
