package designpattern.prototype;

import java.util.HashMap;

public class AnimalCache {

	static HashMap<String, Animal> map = new HashMap<>();
	
	public static Animal getAnimal(String type) {
		
		Dog obj=(Dog) map.get(type);
		
		if(obj==null) {
			
			Dogleg dogleg = new Dogleg();
			dogleg.setNumberOflegs(4);

			DogEar dogear = new DogEar();
			dogear.setNumberOfEars(2);

			DogTail dogtail = new DogTail();
			dogtail.setTailLength("long");

			DogEyes dogeye = new DogEyes();
			dogeye.setNumberOfEyes(2);

			obj = new Dog("Tommy", 3, "White",dogear,dogeye,dogtail,dogleg);
			
			map.put("dog", obj);
			
			System.out.println("New Dog Object is created and return\n");
			return obj;
			
		}
		
		System.out.println("\nCloned Dog Object is created and return\n");
		return obj.clone();
	}
}
