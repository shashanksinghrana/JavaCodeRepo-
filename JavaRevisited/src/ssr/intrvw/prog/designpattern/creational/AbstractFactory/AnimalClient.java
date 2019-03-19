package ssr.intrvw.prog.designpattern.creational.AbstractFactory;

public class AnimalClient {

	public static void main(String[] args) {
	//AnimalFactory aFactory = new AnimalFactory();
	

		Animal a = AnimalFactory.getAnimalFactory("Water").getAnimal("Octopus");
		if (a != null)
			a.speak();
		else
			System.out.println("Please enter a correct Animal Type..");

	}

}
