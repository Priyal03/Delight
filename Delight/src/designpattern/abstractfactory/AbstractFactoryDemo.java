//package designpattern.abstractfactory;
//
//import designpattern.factory.Animal;
//
//
///*
// * Abstract factory pattern is super factory which creates other factories. this factory is
// * also called as factory of factories.
// */
//
//public class AbstractFactoryDemo {
//
//public static void main(String[] args) {
//		
//		//common interface is this.
//		AnimalFactory factory=new LandAnimalFactory();
//		
//		Animal animal = factory.getAnimal("dog");
//		
//		System.out.println(animal.speak());
//		
//		factory=new SeaAnimalFactory();
//		animal =factory.getAnimal("shark");
//		
//		System.out.println(animal.speak());
//		
//	}
//}
///*
//
//*/