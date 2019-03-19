package ssr.intrvw.prog.designpattern.creational.factory;

import ssr.intrvw.prog.designpattern.creational.factory.Cow;

public class AnimalFactory {

	public Animal getAnimal(String animalType) {

		switch (animalType) {
		case "Lion":
			return new Lion();
		case "Cow":
			return  new Cow();
		case "Dog":
			return new Dog();
		default:
			return null;
		}

	}

}
