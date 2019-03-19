package ssr.intrvw.prog.designpattern.creational.AbstractFactory;

public class WaterAnimalFactory extends AnimalFactory {

	public Animal getAnimal(String animalType) {

		switch (animalType) {
		case "Octopus":
			return new Octopus();
		case "Shark":
			return new Shark();
		default:
			return null;
		}

	}

}
