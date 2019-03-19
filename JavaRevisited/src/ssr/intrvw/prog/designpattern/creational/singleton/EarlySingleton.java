package ssr.intrvw.prog.designpattern.creational.singleton;

public class EarlySingleton {

	private static EarlySingleton instance;

	private EarlySingleton() {

	}

	public static EarlySingleton getInstance() {
		if (instance == null) {
			instance = new EarlySingleton();
		}
		return instance;
	}
	
	public void printSingleton(){
		System.out.println("Instance of the Singleton: "+ instance.toString());
	}
}
