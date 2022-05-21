package main.ingame.race;

import java.util.Scanner;
import main.ingame.horse.MyHorse;
import main.ingame.horse.RaceHorse;
import main.ingame.horse.UpBringing;

public class Ingame implements Runnable{
	
	Scanner sc = new Scanner(System.in);
	
	UpBringing u = new UpBringing();
	MyHorse h = new MyHorse();
	Price g = new Price();
	RaceHorse r = new RaceHorse();
	SaveRaces s = new SaveRaces();

	int raceCount = 1;

	public void run(){
		//임시
		h.getMyHorses().add(new MyHorse("노랑이", "파랑"));
		
		r.addToRaceHorses(h.getMyHorses());
		r.createRaceHorses();
		
		boolean start = true;	
		
		while(start) {
			//첫메뉴
			System.out.println(" _______________________________________________________________________ ");
			System.out.println("#			***인게임에 오신것을 환영합니다!***			# \n"			
					+ "#		   이곳에서 자신만의 말을 키우고 경기를 뛰어보세요!			#");
			System.out.println("#_______________________________________________________________________#");
			System.out.println("~          [   마구간(1)   ]  [   경기(2)    ] [    끝내기(3)   ]           ~");  
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					
					System.out.println(" _______________________________________________________________________");
					System.out.println("#			   ***마구간***                                  #\n"
							+ "#                내 말의 정보를 보거나 새로운 말을 키울 수 있어요!	                #");
					System.out.println("#_______________________________________________________________________#");
					out:
					while(true) {
						//말 메뉴 내부                                                                               
						System.out.println("~     [   내 말(1)   ] [   육성(2)   ] [ 새 말 키우기(3) ] [  메인메뉴(4) ]     ~");
						
						int number = sc.nextInt();
						switch(number) {
							//내 말 조회
							case 1:
								h.print(h.getMyHorses());
								break;
							//육성
							case 2: 
								main:
								while(true) {
									                                                           
								System.out.println("[   전직(1)   ] [   훈련(2)   ] [   밥주기(3)   ] [    잠(4)    ] [  메인메뉴(5)  ]");
								int nb = sc.nextInt();
								
								switch(nb) {
									case 1:
										u.swtichJobs(h.getMyHorses().get(0));
										break;
										//훈련
									case 2:
										ro:
										while(true) {
											
											System.out.println(" _______________________________________________________________________ ");
											System.out.println("#			***어떤 훈련을 하시겠습니까?***			# \n"			
													+ "#    적당한 훈련은 좋은 결과를 가져오지만, 무리한 훈련은 말을 지치게하니 주의하세요!         #");
											System.out.println("#_______________________________________________________________________#");
											System.out.println("[   장거리훈련(1)   ] [   	점프훈련(2)    ] [    전으로 돌아가기(3)    ]");
											int n = sc.nextInt();
											
											switch(n) {
												case 1:
													u.longDistance(h.getMyHorses().get(0));
													break;
												case 2:
													u.jump(h.getMyHorses().get(0));
													break;
												case 3:
													break ro;
												}
												break;
											}
										break;
										
										
									case 3:
										u.eat(h.getMyHorses().get(0));
										break;
									case 4:
										u.sleep(h.getMyHorses().get(0));
										break;
									case 5:
										break main;
								}break; 	
								}
							//새 말 키우기		
							case 3:
			    //추가할부분		h.createHorse();
								break;
							//나가기
							case 4:
								break out;
							}
						}	break;		
				//경기시작
				case 2:
					r.giveLine();
					out:
					while(true) {
					
						System.out.println("[  오늘의 경주마(1)   ] [    경기시작(2)    ] [    메인메뉴(4)    ]");
						int number = sc.nextInt();
						
						switch(number) {
							case 1:
								System.out.println("====================오늘의 경주마 조회를 시작합니다.========================");
								r.printRaceHorse(r.getRaceHorses());
								System.out.println("====================오늘의 경주마가 조회되었습니다.========================");
								break;
							
							case 2:
								System.out.println("                #######제 "+ this.raceCount + "회차 경주를 시작합니다!########");
								try {
									Thread.sleep(5000);
								} catch (InterruptedException e) {}
								System.out.println("                           ####"+ "준비"+"####");
								try { 
									Thread.sleep(200);
								} catch (InterruptedException e) {}
								System.out.println("                              #"+ "시작!"+"#");
								try { 
									Thread.sleep(300);
								} catch (InterruptedException e) {}
								
								
								
								while(true) {
									Thread thread1 = new Thread() {
											public void run() {
												r.getRaceTime(r.getRaceHorses().get(0));
											}
										};
										thread1.start();
								
				
									try {
										Thread.sleep(5000);
									} catch (InterruptedException e) {}
									
									System.out.println();
									//결과
									System.out.println("결과집계=============================================================");
//									for(RaceHorse horse: r.getRaceHorses()) {
//										r.afterRaceResult(horse);
//									}
									System.out.println("###제 " + this.raceCount + "회차 순위###");
									
									r.printAllRank();
									
									System.out.println("==================================================================");
									for(RaceHorse horse: r.getRaceHorses()) {
										g.victoryPrice(horse);
										g.afterGameExp(horse);
									}
									System.out.println("==================================================================");
									
									System.out.println();
									
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {}
									
									s.save(r.getRaceHorses());
							
									this.raceCount +=1;
									
									r.giveLine();
									break;
								}
								break;
							case 4:
								break out;
						}
					}
				break;
					
				//게임종료
				case 3:
					start = false;
					break;
				}
		}
	}
}
