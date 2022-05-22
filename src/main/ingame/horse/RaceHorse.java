package main.ingame.horse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class RaceHorse{
	

	//경주마들
	ArrayList<RaceHorse> raceHorses = new ArrayList<RaceHorse>();


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
	int rank = 1;
	String line;
	
	//경기장 길이
	int fieldLength = 2500;

	
	public RaceHorse() {
		super();
	}
	public RaceHorse(String name, double speed, String color) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		this.stamina = 100;
		this.levelOfUpbringing = "중";
		this.raceType = "잠금";
		this.level = 20;
		this.condition	= 100;
		this.sympathetic = "중";
		this.rank = 0;
		this.line = "미정";
	}
	
	public int getFieldLength() {
		return this.fieldLength;
	}
	public void gsetFieldLength(int field) {
		this.fieldLength = field;
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
	
	public int getRank() {
		return this.rank;
	}
	public void setRank(int r) {
		this.rank = r;
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
	public void addSpeed(int speed) {
		this.speed = this.speed +speed;
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

	
	//내말 생성 & 경주마에 추가
	public void addToRaceHorses(MyHorse h) {
		
			raceHorses.add(0, new RaceHorse(h.getName(), h.getSpeed(),h.getColor()));
		
	}					
		
	//말들 생성  & 경주말에 넣기
	public void createRaceHorses() {
		raceHorses.add(new RaceHorse("얼룩이", 70, "검정"));
		raceHorses.add(new RaceHorse("파랑이", 75, "무지개"));
		raceHorses.add(new RaceHorse("금박이", 80, "빨강"));
		raceHorses.add(new RaceHorse("분홍이", 73, "파랑"));
		raceHorses.add(new RaceHorse("초록이", 78, "초록"));
		raceHorses.add(new RaceHorse("금금이", 88, "황금"));
		raceHorses.add(new RaceHorse("말말이", 83, "갈색"));
		
	}
	
	//랜덤 수 생성 1~8 // 임시로 2
	public int[] createRandomNumber() {
		int count = raceHorses.size(); // 난수 생성 갯수
		
		int a[] = new int[count];
		Random r = new Random();
		
		for(int i=0; i<count; i++){
			a[i] = r.nextInt(raceHorses.size()) + 1; // 1 ~ 8까지의 난수 
			for(int j=0; j<i; j++){
				if(a[i] == a[j]){
					i--;
				}
			}
		}
		return a;
	}
	
	//레인에 랜덤배정
	public void giveLine() {
		//랜덤한 line
		int randNum[] = createRandomNumber();
	
		for(int i = 0; i<raceHorses.size(); i++) {
			//랜덤한 라인에 배치
			raceHorses.get(i).setLine("["+randNum[i]+"번라인]");
			
		}
	}
	
	
	//전체조회(1~8)
	public void printRaceHorse(ArrayList<RaceHorse> raceHorses) {
		
		for(RaceHorse horse :raceHorses) {
			
			System.out.println("이름: " + horse.getName());
			System.out.println("색상: " + horse.getColor());
			System.out.println("속도: " + horse.getSpeed());
			System.out.println("체력: " + horse.getStamina());
			System.out.println("육성난이도: " + horse.getLevelOfUpbringing());
			System.out.println("주행타입: " + horse.getRaceType());
			System.out.println("레벨: " + horse.getLevel());
			System.out.println("경험치: " + horse.getExp());
			System.out.println("컨디션: 상");
			System.out.println("교감도: " + horse.getSympathetic());
			System.out.println("라인 번호: " + horse.getLine());
			System.out.println();
		}
		
		System.out.println();
	}
	
	
	public int createRandomNumber2() {
		int a;
		Random r = new Random();
		a = r.nextInt(7) + 1; // 1 ~ 7까지의 난수 
		return a;
	}
	
	
	public void getRaceTime(RaceHorse rh) {
		String fieldStone[] = new String[40];	
		//현재 거리
		int count = 0;
		int mass = 0;
		int oneStep = fieldLength/40;	// 2500/40 = 62.5 = 1칸 정보
		int stone = 0; 	//현재 위치 정보
		System.out.println();
		while(stone < 40) {
			for(int j = 0 ; j<40; j++) {
				if(stone == j ) 
				fieldStone[stone] = ">";
				else
				fieldStone[j] = "_ ";
			}
			System.out.println(rh.getName()+ ": "+ String.join("", fieldStone));
			mass = (int) (count * rh.getSpeed());
			stone = mass/oneStep;
			count++;// _ 40개
			
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {}
			
		}
		rh.setRank(this.rank);
		this.rank++;	
	
	}
		
		
	
	
		
	
	//랭크 출력
	public void printAllRank() {
		int count = 1;
		for(RaceHorse horse : this.raceHorses) {
			System.out.println(horse.getLine() +" "+count + "번마: "+ horse.getName() +" 순위: " + horse.getRank());
			count++;
		}
		System.out.println("=============================================================================");
		System.out.println();
	}

	
	public void addExp(int exp) {
		this.exp +=exp;
		
	}
	
}
