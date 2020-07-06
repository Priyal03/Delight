package designpattern.prototype;
/*
 * is used for creating new object by copying or cloning the existing object of same type. It uses java cloning principle.
 * this way we can improve the performance as this method is used when creation of object is costly or complex. 
 * 
 * Example : if a object to be created after costly DB operation, then we can cache the object n return its cloned one
 * when next request is made; once we get clone() we can modify as per our need.
 */
public class PrototypeDemo {

	public static void main(String[] args) {
		
		
		Dog dog = (Dog) AnimalCache.getAnimal("dog");
		displayAnimalProperty(dog);

		Dog cloneddog1 = (Dog) AnimalCache.getAnimal("dog");
		cloneddog1.setName("Jonnie");
		cloneddog1.setAge(4);
		cloneddog1.setColor("Brown");
		displayAnimalProperty(cloneddog1);

		Dog cloneddog2 = (Dog) AnimalCache.getAnimal("dog");
		cloneddog2.setName("Tony");
		cloneddog2.setAge(5);
		cloneddog2.setColor("Brown");
		displayAnimalProperty(cloneddog2);

		Dog cloneddog3 = (Dog) AnimalCache.getAnimal("dog");
		cloneddog3.setName("Jimmy");
		cloneddog3.setAge(8);
		cloneddog3.setColor("Brown");
		displayAnimalProperty(cloneddog3);
		
	}

	private static void displayAnimalProperty(Dog animal) {
		// TODO Auto-generated method stub
		
		if (animal instanceof Dog)
		{
			Dog dog = (Dog) animal;
			System.out.println(dog.toString());
			System.out.println("-----------------------------------------------------------------------------------------------------");

		}
	}
}
