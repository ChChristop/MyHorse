package main.board.ask;

import java.util.Vector;

public class AskDao {
	Vector<AskList> list = new Vector<AskList>();
	public AskDao() {
		//List, ArrayList�� �ۼ��Ͽ� �ʿ�� �޺κи� Vector�� ����
		for(int i = 1; i<10; i++) {
			list.add(new AskList(i+"���� �ۼ�",i+"�� �����ۼ�", i+"�ۼ���", list.size()));
			}
	}
	public Vector<AskList> getAskList(){
		return list;
	}
	public void setAskList(int e, AskList list){
		this.list.set(e, list);
	}
}
