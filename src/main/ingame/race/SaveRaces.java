package main.ingame.race;

import java.util.ArrayList;

import main.ingame.horse.RaceHorse;

public class SaveRaces{
	
	//�����
	//�� ȸ�� ���ָ���/���
	ArrayList<ArrayList<RaceHorse>> result = new ArrayList<>();
	ArrayList<RaceHorse> rankSave = new ArrayList<>();
	RaceHorse r = new RaceHorse();
	
	
	public ArrayList<ArrayList<RaceHorse>> getResult(){
		return this.result;
	}
	
	//�� ȸ ��� ��� ���� �޼���
	public void save(ArrayList<RaceHorse> raceHorses) {
		for(RaceHorse horse : raceHorses) {
			RaceHorse r = new RaceHorse();
			r.setLine(horse.getLine());
			r.setName(horse.getName());
			r.setHorseRank(horse.getHorseRank());
			rankSave.add(r);
		}
		result.add(rankSave);
	}
}
