package main.board.qna;

import java.util.Vector;

public class QNADao {
	Vector<QNAList> list = new Vector<QNAList>();
	public QNADao() {
		//List, ArrayList�� �ۼ��Ͽ� �ʿ�� �޺κи� Vector�� ����
		for(int i = 1; i<10; i++) {
			list.add(new QNAList(i+"���� �ۼ�",i+"�� �����ۼ�", i+"�ۼ���", list.size()));
			}
	}
	public Vector<QNAList> getQNAList(){
		return list;
	}
	public void setAskList(int e, QNAList list){
		this.list.set(e, list);
	}
}
