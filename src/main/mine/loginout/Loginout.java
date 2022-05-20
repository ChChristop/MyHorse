package main.mine.loginout;

import java.util.Scanner;

import main.mine.Frame;

import java.util.Hashtable;
import java.util.Map;

class LogInfo{
	String name;
	int phoneNum;
	String pass;

	public LogInfo(String name, int phoneNum, String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LogInfo) {
			if (((LogInfo) obj).pass.equals(pass))
				return true;
		}
		return false;
	}
}
public class Loginout {
	Map<String, Frame> hT2 = new Hashtable<>();
	
	public Loginout() {
		hT2 =  main.mine.Menu.mDao.getmineDao();
	}
	public void run(){
		String ident;
		Scanner sc = new Scanner(System.in);
		
		if( main.mine.Menu.mDao.getLoginFlag()) {
			System.out.println("	로그아웃 하시겠습니까?");
			System.out.println("네(1) 아니오(2)");
			if(sc.nextInt() == 1) {
			 main.mine.Menu.mDao.setLoginFlag(false);
			System.out.println("	로그아웃 되었습니다");
			}
			else
			System.out.println("취소하였습니다.");
		}
		System.out.println("	로그인 입니다.");

		do {
		System.out.println("아이디를 입력하세요.");
		ident = sc.nextLine();
		if(!hT2.containsKey(ident)) {
			System.out.println("해당하는 아이디가 없습니다.");
		}
		}while(!hT2.containsKey(ident));

		System.out.println("비밀번호를 입력하세요.");
		String pass = sc.nextLine();
		
		System.out.println(hT2.get(ident).pass);
		
		if(hT2.get(ident).pass.compareTo(pass) == 0) {
			System.out.println(ident + "로 로그인 되었습니다.");
			 main.mine.Menu.mDao.setLoginFlag(true);
			 //로그인 정보 저장할 것
		}
		else 
			System.out.println("비밀번호가 일치하지 않습니다.");
	}
}
