package main.game;

//import java.util.ArrayList;
//import main.ingame.horse.RaceHorse;
//import main.ingame.race.SaveRaces;

public class GameDao {
	private Map<String, Frame> mineDao = new Hashtable<>();
	private String cuId;
  
	SaveRaces sr = new SaveRaces();
	RaceHorse rh = new RaceHorse();
	ArrayList<ArrayList<RaceHorse>> resultDao = new ArrayList<>();
	ArrayList<RaceHorse> stallDao = new ArrayList<>();
	int field;
  
	
	public MineDao(){
		mineDao.put("abc", new Frame("홍지성",1213,"1234"));
		mineDao.put("bcd", new Frame("임지희",1211,"asd"));
	}
	public Map<String, Frame> getmineDao(){
		return mineDao;
	}
	public void setmineDao(Map<String, Frame> mineDao){
		this.mineDao = mineDao;
	}
	public String getcuId(){
		return cuId;
	}
	public void setcuId(String cuId){
		this.cuId = cuId;
	}
	public Frame getFrame(){
		return mineDao.get(cuId);
	}
	public void setDcheck(boolean dcheck){
		mineDao.get(cuId).setDcheck(dcheck);
		mineDao.replace(cuId, mineDao.get(cuId));
	}
	public boolean getDcheck(){
		return mineDao.get(cuId).dcheck;
	}
	public void setPoint(int point){
		mineDao.get(cuId).setPoint(point);
		mineDao.replace(cuId, mineDao.get(cuId));
	}
	public int getPoint(){
		return mineDao.get(cuId).point;

  
public void setResultDao(ArrayList<ArrayList<RaceHorse>> result) {
		this.resultDao =result ;
	}
	public ArrayList<ArrayList<RaceHorse>> getResultDao(){
		this.resultDao = sr.getResult();
		return this.resultDao;
	}
	//경주말 8마리
	public ArrayList<RaceHorse> getStallDao(){
		this.stallDao = rh.getRaceHorses();
		return this.stallDao;
	}
	public void setStallDao(ArrayList<RaceHorse> stall) {
		this.stallDao = stall;
	}
	
	public int getField() {
		this.field = rh.getFieldLength();
		return this.field;
	}
	public void setField(int field) {
		this.field = field;
	}
  
  
	}
}
