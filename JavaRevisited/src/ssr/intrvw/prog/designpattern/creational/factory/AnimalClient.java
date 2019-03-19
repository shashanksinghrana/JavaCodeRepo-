package ssr.intrvw.prog.designpattern.creational.factory;

public class AnimalClient {

	public static void main(String[] args) {
		AnimalFactory aFactory = new AnimalFactory();

		Animal a = aFactory.getAnimal("dxd");
		if (a != null)
			a.speak();
		else
			System.out.println("Please enter a correct Animal Type..");

	}

}
