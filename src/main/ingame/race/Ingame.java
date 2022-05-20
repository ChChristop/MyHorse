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
		//�ӽ�
		h.getMyHorses().add(new MyHorse("�����", "�Ķ�"));
		
		r.addToRaceHorses(h.getMyHorses());
		r.createRaceHorses();
		
		boolean start = true;	
		
		while(start) {
			//ù�޴�
			System.out.println(" _______________________________________________________________________ ");
			System.out.println("#			***�ΰ��ӿ� ���Ű��� ȯ���մϴ�!***			# \n"			
					+ "#		   �̰����� �ڽŸ��� ���� Ű��� ��⸦ �پ����!			#");
			System.out.println("#_______________________________________________________________________#");
			System.out.println("#   [   ������(1)   ] [    ����(2)    ] [   ���(3)    ] [    ������(4)   ]   #");  
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("__________________________________________________________________________________________________________________");
				System.out.println("			***������*** \n"
						+ "�� ���� ������ ���ų� ���ο� ���� Ű��� ���Դϴ�.	");
				System.out.println("__________________________________________________________________________________________________________________");

				out:
				while(true) {
					//�� �޴� ����
					System.out.println("[   �� �� ��ȸ(1)   ] [    �� �� Ű���(2)    ] [     ���θ޴�(3)    ]    ");
					int number = sc.nextInt();
					
					switch(number) {
					case 1:
						h.print(h.getMyHorses());
						break;
					case 2:
//		�߰��Һκ�				h.createHorse();
						break;
					case 3:
						break out;
					}
				}break; 
				
				//����
				case 2: 
					main:
					while(true) {
						
						System.out.println("����(1) �Ʒ�(2) ���ֱ�(3) ��(4)  ���θ޴�(5)");
						int number = sc.nextInt();
						
						switch(number) {
							case 1:
								u.swtichJobs(h.getMyHorses().get(0));
								break;
								//�Ʒ�
							case 2:
								while(true) {
									
									System.out.println("� �Ʒ��� �ϰڽ��ϱ�?");
									
									System.out.println("��Ÿ��Ʒ�(1)  �����Ʒ�(2) ������ ���ư���(3)");
									int n = sc.nextInt();
									ro:
									switch(n) {
										case 1:
											u.longDistance(h.getMyHorses().get(0));
											break;
										case 2:
											u.jump(h.getMyHorses().get(0));
											break;
										case 3:
											break ro;
										}break;
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
						}
					}break;
					
				//������
				case 3:
					r.giveLine();
					out:
					while(true) {
					
						
						System.out.println("������ ���ָ�(1)  ��� ����(2)  ���θ޴�(4)");
						int number = sc.nextInt();
						
						switch(number) {
							case 1:
								r.printRaceHorse(r.getRaceHorse());
								System.out.println("====================������ ���ָ��� ��ȸ�Ǿ����ϴ�.========================");
								break;
							
							case 2:
								System.out.println("                #######�� "+ this.raceCount + "ȸ�� ���ָ� �����մϴ�!########");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {}
								System.out.println("                           ####"+ "�غ�"+"####");
								try { 
									Thread.sleep(500);
								} catch (InterruptedException e) {}
								System.out.println("                              #"+ "����!"+"#");
								try { 
									Thread.sleep(500);
								} catch (InterruptedException e) {}
								
								while(true) {
									Thread thread1 = new Thread() {
											public void run() {
												r.getRaceTime(r.getRaceHorse().get(0));
												
											}
										};
										thread1.start();
						
									Thread thread2 = new Thread() {
										public void run() {
											r.getRaceTime(r.getRaceHorse().get(1));

										}
									};
									thread2.start();
									
									Thread thread3 = new Thread() {
										public void run() {
											r.getRaceTime(r.getRaceHorse().get(2));

										}
									};
									thread3.start();
									
									Thread thread4 = new Thread() {
										public void run() {
											r.getRaceTime(r.getRaceHorse().get(3));

										}
									};
									thread4.start();
					
								Thread thread5 = new Thread() {
									public void run() {
										r.getRaceTime(r.getRaceHorse().get(4));

									}
								};
								thread5.start();
								
								Thread thread6 = new Thread() {
									public void run() {
										r.getRaceTime(r.getRaceHorse().get(5));

									}
								};
								thread6.start();
								
									
								Thread thread7 = new Thread() {
									public void run() {
										r.getRaceTime(r.getRaceHorse().get(6));

									}
								};
								thread7.start();
								Thread thread8 = new Thread() {
									public void run() {
										r.getRaceTime(r.getRaceHorse().get(7));
									}
								};
								thread8.start();
									
									
									try {
										Thread.sleep(5000);
									} catch (InterruptedException e) {}
									
									System.out.println();
									//���
									System.out.println("�������=============================================================");
//									for(RaceHorse horse: r.getRaceHorse()) {
//										r.afterRaceResult(horse);
//									}
									System.out.println("###�� " + this.raceCount + "ȸ�� ����###");
									
									r.printAllRank();
									
									System.out.println("==================================================================");
									for(RaceHorse horse: r.getRaceHorse()) {
										g.victoryPrice(horse);
										g.afterGameExp(horse);
									}
									System.out.println("==================================================================");
									
									System.out.println();
									
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {}
									
									s.save(r.getRaceHorse());
							
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
					
				//��������
				case 4:
					start = false;
					break;
				}
		}
	}
}
