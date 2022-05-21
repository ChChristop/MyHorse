package main.mine.join;

import java.util.Scanner;
import java.util.Hashtable;
import java.util.Map;

import main.mine.Frame;
import main.mine.MineDao;

class JoinInfo extends main.mine.Frame {
	public JoinInfo(String name, int phoneNum,String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
	}
}

public class Join {
	Map<String, Frame> hT1 = new Hashtable<>();
	MineDao mDao = new MineDao();
	
	public Join() {
		hT1 = mDao.getmineDao();
	}
	public void run(){
		String ident;
		System.out.println("	회원가입 페이지입니다.");
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("아이디를 입력하세요.");
		ident = sc.nextLine();
		if(hT1.containsKey(ident)) {
			System.out.println("이미 사용중인 아이디입니다.");
		}
		}while(hT1.containsKey(ident));
			
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String pass = sc.nextLine();
		System.out.println("전화번호 뒷 네자리를 입력하세요.");
		int phoneNum = sc.nextInt();

		hT1.put(ident, new JoinInfo(name,phoneNum,pass)); //아이디 생성
		System.out.println(ident + "아이디가 생성되었습니다.");
		System.out.println("이름: "+ name + ", 비밀번호: " + pass + ", 전화번호 뒷 4자리: " + phoneNum);
		
	}
}
