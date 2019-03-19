package ssr.intrvw.prog.thread;

public class Racers implements Runnable {
	int distance = 100;
	volatile static boolean winner = false;

	@Override
	public void run() {
		
		for (int i = 0; i <= distance ; i++) {
			System.out.println("Distance covered by "+Thread.currentThread().getName()+" is "+ i+" meters.");
			
			if(i==30 &&Thread.currentThread().getName().equals("Hare")){
								
				try {
					System.out.println(Thread.currentThread().getName()+" is sleeping...");
					Thread.sleep(1000*10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(i == distance){
				if(winner == false){
					checkWinner(true);
				}
			 }
			
		}

	}

	public void checkWinner(boolean flag) {
		winner = flag;
		System.out.println(Thread.currentThread().getName()
				+ " has won the race");
	}

}
