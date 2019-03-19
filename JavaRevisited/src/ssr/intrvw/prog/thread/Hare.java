package ssr.intrvw.prog.thread;

public class Hare implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			
			System.out.println("Hare has complete "+ i+" meter");
			
			if(i==30){
				try {
					Thread.sleep(1000*30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		System.out.println("");

	}

}
