package ssr.intrvw.prog.thread;

public class ThreadA extends Thread {
	
	public ThreadA(){
		
	}
	
	public ThreadA(Runnable r){
		super(r);
	}
	
	@Override
	public void run() {
		System.out.println("Thread A");
		
	}

}
