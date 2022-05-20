package main.ingame.race;

import java.util.ArrayList;
import java.util.Scanner;

import main.ingame.horse.MyHorse;
import main.ingame.horse.RaceHorse;
/*���� ����	
 * ��ݹޱ�(������)	
 * ���ñ� �ޱ�(������ ��)	
 * ������ ����ġ �ο�		
*/
interface Get{
	
	void victoryPrice(RaceHorse rh);
	void afterGameMoney(int n);
	void afterGameExp(RaceHorse rh);
	
}

public class Price implements Get{
	ArrayList<RaceHorse> raceHorces = new ArrayList<RaceHorse>();
	RaceHorse r = new RaceHorse();
	
	Scanner sc = new Scanner(System.in);

	int betPersons=7;
	int betTotal = 7000;
	

	//1�� ��ݹޱ�(������)
	public void victoryPrice(RaceHorse rh) {
		if(rh.getHorseRank()==1) {
			System.out.println(rh.getLine()+" " + rh.getName() + ": ��� 1000$�� ȹ���ϼ̽��ϴ�.");
		}else
			System.out.println(rh.getLine()+" " + rh.getName() + ": ���� ��ȸ�� ���������.");
	}
	
	//���ñ� �ޱ�(������)
	public void afterGameMoney(int n) {//n = ������ �� ��� ��
		System.out.println("���ñ� total/n�� ȹ���ϼ˽��ϴ�.");
	
	}

	//������ ����ġ �ֱ�
	//1-3������� ����ġ �߰�
	public void afterGameExp(RaceHorse rh) {
		
		switch(rh.getHorseRank()) {
			case 1:
				rh.addExp(30);
				break;
			case 2:
				rh.addExp(20);
				break;
			case 3:
				rh.addExp(10);
				break;
			default:
				if(rh.getExp()>10)
				rh.addExp(-10);
				break;
		}
		System.out.println();
	}

	
}
