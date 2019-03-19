package ssr.intrvw.prog.designpattern.creational.AbstractFactory;


public class LandAnimalFactory extends AnimalFactory {
	public Animal getAnimal(String animalType) {

		switch (animalType) {
		case "Lion":
			return new Lion();
		case "Dog":
			return new Dog();
		default:
			return null;
		}

	}

}
