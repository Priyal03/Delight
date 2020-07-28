package designpattern.abstractfactory;

/*
 * Abstract factory pattern is super factory which creates other factories. this factory is
 * also called as factory of factories.
 */

public class AbstractFactoryDemo {

public static void main(String[] args) {
		
		//common interface is this.
		AnimalFactory factory=null;
		Animal animal=null;
		
		factory = AnimalFactory.getAnimalFactory("landanimalfactory");
		
		animal = factory.getAnimal("dog");
		
		System.out.println(animal.getClass().getName()+" "+animal.speak());
		
		
		factory=AnimalFactory.getAnimalFactory("seaanimalfactory");
		
		animal =factory.getAnimal("shark");
		
		System.out.println(animal.getClass().getName()+" "+animal.speak());
		
		
		factory=AnimalFactory.getAnimalFactory("seaanimalfactory");
		
		animal =factory.getAnimal("octopus");
		
		System.out.println(animal.getClass().getName()+" "+animal.speak());
		
	}
}
/*

*/