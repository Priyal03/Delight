package designpattern.factory;

/**
 * 
 * 
 *
 */
public class AnimalFactory {

	public Animal getAnimal(String type) {
		
		Animal animal=null;
		
		if(type.equals("dog")) {
			
			animal=new Dog();
		}
		
		if(type.equals("duck")) {
			animal=new Duck();
		}
		
		if(type.equals("lion")) {
			animal=new Lion();
		}
		return animal;
	}
}
