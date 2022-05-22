package horse;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.LinkedList;

import race.Ingame;

public class RaceHorse extends MyHorse{
	
	
	//기본생성
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
	
	public RaceHorse() {
		super();
		
	}
	public RaceHorse(String name, int speed, String color) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		this.stamina = 100;
		this.levelOfUpbringing = "중";
		this.raceType = "잠금";
		this.level = 20;
		this.condition	= 100;
		this.sympathetic = "중";
		this.horseRank = 0;
		this.line = "미정";
	}
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 레인에 랜덤배정
	public void createRaceHorses() {
		raceHorses.add(addToRaceHorses(getMyHorses().get(0)));
		raceHorses.add(new RaceHorse("얼룩이", 70, "검정"));
		raceHorses.add(new RaceHorse("파랑이", 75, "무지개"));
		raceHorses.add(new RaceHorse("금박이", 80, "빨강"));
		raceHorses.add(new RaceHorse("조랑이", 85, "노랑"));
		raceHorses.add(new RaceHorse("분홍이", 73, "파랑"));
		raceHorses.add(new RaceHorse("초록이", 78, "초록"));
		raceHorses.add(new RaceHorse("금금이", 88, "황금"));
//		raceHorses.add(new RaceHorse("말말이", 83, "갈색"));
	}
	
	public LinkedList<Integer> getRank() {
		return this.rank;
	}
	
	public String getline() {
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
			System.out.println("컨디션: " + horse.conditionLevel(horse.getStamina(), horse.getSympathetic()));
			System.out.println("교감도: " + horse.getSympathetic());
			System.out.println();
		}
		System.out.println("====================오늘의 경주마가 조회되었습니다.========================");
		System.out.println();
	}
	

	//말 세부정부 선택조회
//	public void print_number(int number) {
//		System.out.println("이름: " + raceHorses.get(number).getName());
//		System.out.println("색상: "  + raceHorses.get(number).getColor());
//		System.out.println("속도: " + raceHorses.get(number).getSpeed() + "km/h");
//		System.out.println("체력: "  + raceHorses.get(number).getStamina());
//		System.out.println("육성난이도: " + raceHorses.get(number).getLevelOfUpbringing());
//		System.out.println("주행타입: " + raceHorses.get(number).getRacetype());
//		System.out.println("레벨: "  + raceHorses.get(number).getLevel());
//		System.out.println("경험치: " + raceHorses.get(number).getExp());
//		System.out.println("체력: " + raceHorses.get(number).getCondition());
//		System.out.println("교감도: " + raceHorses.get(number).getSympathetic());
//		System.out.println();
//	}
	
	
	
	//MyHorse의 세부 정보를 받아서 새 Racehorse 객체에 전달 후 경주마 리스트에 추가
	public RaceHorse addToRaceHorses(MyHorse h) {
		RaceHorse r = new RaceHorse();
		r.setName(h.getName());
		r.setColor(h.getColor());
		r.setSpeed(h.getSpeed());
		r.setStamina(h.getStamina());
		r.setLevelOfUpbringing(h.getLevelOfUpbringing());
		r.setRaceType(h.getRaceType());
		r.setLevel(h.getLevel());
		r.setExp(h.getExp());
		r.setCondition(h.getCondition());
		r.setSympathetic(h.getSympathetic());
		
		raceHorses.remove(0);
		raceHorses.add(0, r);
		return getRaceHorse().get(0);
	}
	//말 하나당 경기 시간계산(70km/s)
	public void getRaceTime(RaceHorse rh) {
		//초를 샘(쓰레드 sleep로 초를 빠르게샘)
		int field = 1200;
		int count = 0;
		
		while(field >= rh.getSpeed()/3.6) {
			//1초마다 가는 거리를 빼준다, m/s
			field -= rh.getSpeed()/3.6;
			count++;
			System.out.println((raceHorses.indexOf(rh)+1) + "번마:" + rh.getName() 
			+ "\r\n" + "남은거리>> " + field + "/1200" );
			
			System.out.println();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {}
		}
		rh.setHorseRank(this.rank.poll()); 
		
		System.out.println();
		
		System.out.println((raceHorses.indexOf(rh)+1) + "번마:" + rh.getName() + "\r\n" +" 기록:" + count + "초  " +
						   " 순위: " + rh.getHorseRank() +"등");
		
		System.out.println();
	}

	public void printAllRank() {
		int count = 1;
		for(RaceHorse horse : raceHorses) {
			System.out.println(count + "번마: "+ horse.getName() +" 순위: " + horse.getHorseRank());
			count++;
		}
		System.out.println("=============================================================================");
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
