package ssr.intrvw.prog.thread;

public class Passengers extends Thread {
	
	int seatNeeded;
	

	public int getSeatNeeded() {
		return seatNeeded;
	}


	public Passengers(int seatNeeded,Runnable target, String name) {
		super(target,name);
		this.seatNeeded = seatNeeded;
	}



}
