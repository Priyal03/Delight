package designpattern.factory;

/*
 * In Factory pattern, we create object without exposing the creation logic to the client 
 * and refer to newly created object using a common interface.
 */

public class FactoryDemo {

	public static void main(String[] args) {
		
		//common interface is this.
		AnimalFactory factory=new AnimalFactory();
		
		Animal animal = factory.getAnimal("dog");
		
		System.out.println(animal.speak());
		
		Duck duck = new Duck(); 
		//3rd point
		
		System.out.println(duck.speak());
	}
}

/*
In simple words, if we have a super class and many sub classes and based on data provided,
we have to return the object of one of the subclasses, we use factory pattern.

The basic principle behind this pattern is that, at runtime, we get an object
of similar type based on the parameter we pass.

normally, If object creation code is spread in whole app, and if u need to change the process of
object creation then you need to go in each n every place to make necessary changes.

with factory method we just need to pass right argument.
*/