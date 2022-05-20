package main.mine;

import java.util.Hashtable;
import java.util.Map;

public class MineDao {
	private Map<String, Frame> mineDao = new Hashtable<>();
	private boolean loginFlag=false;
	
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
	public boolean getLoginFlag() {
		return loginFlag;
	}
	public void setLoginFlag(boolean loginFlag) {
		this.loginFlag = loginFlag;
	}
	
}
