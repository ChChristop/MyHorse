# MyHorse
ProjectMyHorse
//말 하나당 경기 시간계산(70km/s)
	public void getRaceTime(RaceHorse rh) {
		//초를 샘(쓰레드 sleep로 초를 빠르게샘)
		int field = 1200;
		int count = 0;
		
		while(field >= rh.getSpeed()/3.6) {
			//1초마다 가는 거리를 빼준다, m/s
			field -= rh.getSpeed()/3.6;
			count++;
			System.out.println((raceHorses.indexOf(rh)+1) + "번마:" + rh.getName() 
			+ "\r\n" + rh.getName()+ ": 남은거리>> " + field + "/1200" );
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {}
		}
		rh.setHorseRank(this.rank.poll());
		System.out.println((raceHorses.indexOf(rh)+1) + "번마:" + rh.getName() + "\r\n" +" 기록:" + count + "초  " +
						   " 순위: " + rh.getHorseRank() +"등");
		System.out.println();
	}
