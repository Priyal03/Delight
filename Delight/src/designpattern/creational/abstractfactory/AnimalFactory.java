package designpattern.abstractfactory;

/**
 * 
 * 
 *
 */
public abstract class AnimalFactory {

	public abstract Animal getAnimal(String type);
	
	public static AnimalFactory getAnimalFactory(String type){
		
		AnimalFactory animal=null;
		
		if(type.equals("seaanimalfactory")) {
			
			animal=new SeaAnimalFactory();
		}
		else
		{
			animal=new LandAnimalFactory();
		}
		
		
		return animal;
	}
}
