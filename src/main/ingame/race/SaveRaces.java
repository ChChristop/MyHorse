package main.ingame.race;

import java.util.ArrayList;

import main.ingame.horse.RaceHorse;

public class SaveRaces{
	
	//저장소
	//각 회차 경주마들/결과
	ArrayList<ArrayList<RaceHorse>> result = new ArrayList<>();
	ArrayList<RaceHorse> rankSave = new ArrayList<>();
	RaceHorse r = new RaceHorse();
	
	
	public ArrayList<ArrayList<RaceHorse>> getResult(){
		return this.result;
	}
	
	public void print() {
		for(ArrayList<RaceHorse> stall : this.result) {
			for(RaceHorse horse : stall) {
				System.out.println(horse.getName());
				System.out.println(horse.getRank());
				System.out.println(horse.getLine());
			}
		}
	}
	
	//각 회 경기 결과 저장 메서드
	public void save(ArrayList<RaceHorse> raceHorses) {
		for(RaceHorse horse : raceHorses) {
			RaceHorse r = new RaceHorse();

			r.setLine(horse.getLine());
			r.setName(horse.getName());
			r.setRank(horse.getRank());
			rankSave.add(r);
		}
		result.add(rankSave);
	}
}
