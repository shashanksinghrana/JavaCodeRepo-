package ssr.intrvw.prog.designpattern.creational.AbstractFactory;

public abstract class AnimalFactory {

	public static AnimalFactory getAnimalFactory(String animalFactoryType) {

		if (animalFactoryType.equalsIgnoreCase("Land"))
			return new LandAnimalFactory();
		else if (animalFactoryType.equalsIgnoreCase("Water"))
			return new WaterAnimalFactory();
		else
			return null;

	}

	public abstract Animal getAnimal(String animalType);

}
