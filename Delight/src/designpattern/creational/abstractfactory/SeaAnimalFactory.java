package designpattern.abstractfactory;

public class SeaAnimalFactory extends AnimalFactory {

	public Animal getAnimal(String type) {

		Animal animal = null;

		if (type.equals("octopus")) {

			animal = new Octopus();
		}

		if (type.equals("shark")) {
			animal = new Shark();
		}

		return animal;

	}
}
