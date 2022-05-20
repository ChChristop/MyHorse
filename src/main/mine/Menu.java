package main.mine;

import java.util.Scanner;

public class Menu {
	main.mine.join.Join join = new main.mine.join.Join();
	main.mine.loginout.Loginout loginout = new main.mine.loginout.Loginout();
	main.mine.passSeek.PassSeek passSeek = new main.mine.passSeek.PassSeek();
	main.mine.withdraw.Withdraw withdraw = new main.mine.withdraw.Withdraw();
	public static MineDao mDao = new MineDao();
	
	Scanner sc = new Scanner(System.in);
	
	
	public void run() {
		int menu=0;
		while(menu >= 0) {
			if(!mDao.getLoginFlag()) {
				System.out.println("로그인이 필요한 메뉴입니다.");
				System.out.println("회원가입(1) 로그인(2) 비밀번호 찾기(3) 뒤로가기(4) 임시-탈퇴(5)");
			}else {
				System.out.println("아이디 : " + "abc");	// 수정필요
				System.out.println("내정보(1) 로그아웃(2) 탈퇴(3) 뒤로가기(4)");
			}
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				join.run();
//								
				break;
			case 2:
				loginout.run();
//				new main.mine.
				break;
			case 3:
				passSeek.run();
				//(loginFlag)? 
				//new main.mine.withdraw.Withdraw(); 
				break;
			case 4:
				System.out.println("	메인으로 이동합니다.	");
				menu=-1;
				break;
			case 5:
				withdraw.run();
				break;	
			}
		}
	}
}
