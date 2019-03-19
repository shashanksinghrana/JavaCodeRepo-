package ssr.intrvw.prog.thread;

public class Race {

	public static void main(String[] args) {
		Racers racers = new Racers();
		Thread t1 = new Thread(racers,"Hare");
		Thread t2 = new Thread(racers,"Turtoise");
		
		t1.start();
		t2.start();

	}

}
