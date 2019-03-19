package ssr.intrvw.prog.designpattern.creational.singleton;

public class SingletonClient {

	public static void main(String args[]) {
		EarlySingleton.getInstance().printSingleton();
		EarlySingleton.getInstance().printSingleton();
		EarlySingleton.getInstance().printSingleton();
	}

}
