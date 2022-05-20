package main.ingame.horse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class RaceHorse{
	
	
	//���ָ���
	ArrayList<RaceHorse> raceHorses = new ArrayList<RaceHorse>();

	LinkedList<Integer> rank = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

	String name;
	String color;
	double speed;
	int stamina;		
	String levelOfUpbringing;
	String raceType;
	int level;		
	int exp;
	int condition;
	String sympathetic;
	int horseRank;
	String line;
	
	
	int count = 0;
	
	public RaceHorse() {
		super();
	}
	public RaceHorse(String name, double speed, String color) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		this.stamina = 100;
		this.levelOfUpbringing = "��";
		this.raceType = "���";
		this.level = 20;
		this.condition	= 100;
		this.sympathetic = "��";
		this.horseRank = 0;
		this.line = "����";
	}
	
	public LinkedList<Integer> getRank() {
		return this.rank;
	}
	
	public String getLine() {
		return this.line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	
	public ArrayList<RaceHorse> getRaceHorses() {
		return raceHorses;
	}

	public void setRaceHorses(ArrayList<RaceHorse> raceHorses) {
		this.raceHorses = raceHorses;
	}
	
	public int getHorseRank() {
		return this.horseRank;
	}
	public void setHorseRank(int r) {
		this.horseRank = r;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public String getLevelOfUpbringing() {
		return levelOfUpbringing;
	}

	public void setLevelOfUpbringing(String levelOfUpbringing) {
		this.levelOfUpbringing = levelOfUpbringing;
	}

	public String getRaceType() {
		return raceType;
	}

	public void setRaceType(String raceType) {
		this.raceType = raceType;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public String getSympathetic() {
		return sympathetic;
	}

	public void setSympathetic(String sympathetic) {
		this.sympathetic = sympathetic;
	}

	public ArrayList<RaceHorse> getRaceHorse(){
		return this.raceHorses;
	}
	
	
	//���� ���� & ���ָ��� �߰�
	public void addToRaceHorses(ArrayList<MyHorse> h) {
		for(int i = 0; i<h.size(); i++) {
			raceHorses.add(new RaceHorse(h.get(i).getName(),h.get(i).getSpeed(),h.get(i).getColor()));
		}
	}					
		
	//���� ����  & ���ָ��� �ֱ�
	public void createRaceHorses() {
		raceHorses.add(new RaceHorse("�����", 70, "����"));
		raceHorses.add(new RaceHorse("�Ķ���", 75, "������"));
		raceHorses.add(new RaceHorse("�ݹ���", 80, "����"));
		raceHorses.add(new RaceHorse("��ȫ��", 73, "�Ķ�"));
		raceHorses.add(new RaceHorse("�ʷ���", 78, "�ʷ�"));
		raceHorses.add(new RaceHorse("�ݱ���", 88, "Ȳ��"));
		raceHorses.add(new RaceHorse("������", 83, "����"));
		
	}
	
	//���� �� ���� 1~8 // �ӽ÷� 2
	public int[] createRandomNumber() {
		int count = raceHorses.size(); // ���� ���� ����
		
		int a[] = new int[count];
		Random r = new Random();
		
		for(int i=0; i<count; i++){
			a[i] = r.nextInt(raceHorses.size()) + 1; // 1 ~ 8������ ���� 
			for(int j=0; j<i; j++){
				if(a[i] == a[j]){
					i--;
				}
			}
		}
		return a;
	}
	
	//���ο� ��������
	public void giveLine() {
		//������ line
		int randNum[] = createRandomNumber();
	
		for(int i = 0; i<raceHorses.size(); i++) {
			//������ ���ο� ��ġ
			raceHorses.get(i).setLine("["+randNum[i]+"������]");
			
		}
	}
	
	
	//��ü��ȸ(1~8)
	public void printRaceHorse(ArrayList<RaceHorse> raceHorses) {
		
		for(RaceHorse horse :raceHorses) {
			
			System.out.println("�̸�: " + horse.getName());
			System.out.println("����: " + horse.getColor());
			System.out.println("�ӵ�: " + horse.getSpeed());
			System.out.println("ü��: " + horse.getStamina());
			System.out.println("�������̵�: " + horse.getLevelOfUpbringing());
			System.out.println("����Ÿ��: " + horse.getRaceType());
			System.out.println("����: " + horse.getLevel());
			System.out.println("����ġ: " + horse.getExp());
			System.out.println("�����: ��");
			System.out.println("������: " + horse.getSympathetic());
			System.out.println("���� ��ȣ: " + horse.getLine());
			System.out.println();
		}
		
		System.out.println();
	}
	

	//�� �������� ������ȸ
//	public void print_number(int number) {
//		System.out.println("�̸�: " + raceHorses.get(number).getName());
//		System.out.println("����: "  + raceHorses.get(number).getColor());
//		System.out.println("�ӵ�: " + raceHorses.get(number).getSpeed() + "km/h");
//		System.out.println("ü��: "  + raceHorses.get(number).getStamina());
//		System.out.println("�������̵�: " + raceHorses.get(number).getLevelOfUpbringing());
//		System.out.println("����Ÿ��: " + raceHorses.get(number).getRacetype());
//		System.out.println("����: "  + raceHorses.get(number).getLevel());
//		System.out.println("����ġ: " + raceHorses.get(number).getExp());
//		System.out.println("ü��: " + raceHorses.get(number).getCondition());
//		System.out.println("������: " + raceHorses.get(number).getSympathetic());
//		System.out.println();
//	}
	
	
	
	
	//�� �Ѹ��� �� ��� �ð����
	public void getRaceTime(RaceHorse rh) {
		
		
		
		
//		int field = 1200;
//			
//		for (int i = 0; i < field/(rh.getSpeed()/3.6); i++) {
//			System.out.println("\n" + rh.getName() + " : ");
//			for (int j = 0; j < i; j++) {
//				System.out.print("-");
//			}
//		
//			System.out.print(">");
//		
//			for (int j = (int)(field/(rh.getSpeed()/3.6))-1; j > i; j--) {
//				System.out.print("-");
//				}
//		
//		
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {}
//			count++;
//				
//		}
//		System.out.println();
//		rh.setHorseRank(this.rank.poll()); 
//		
//		System.out.println();
		
		
		}
//	public void afterRaceResult(RaceHorse rh) {
//		
//		System.out.println((raceHorses.indexOf(rh)+1) + "����:" + rh.getName() + "\r\n" +" ���:" + count + "��  " +
//				   " ����: " + rh.getHorseRank() +"��");
//
//	}
	
	
	//��ũ ���
	public void printAllRank() {
		int count = 1;
		for(RaceHorse horse : raceHorses) {
			System.out.println(horse.getLine() +" "+count + "����: "+ horse.getName() +" ���:" + count + "��  " +" ����: " + horse.getHorseRank());
			count++;
		}
		System.out.println("=============================================================================");
		System.out.println();
	}

	
	public void addExp(int exp) {
		this.exp +=exp;
		
	}
	
}