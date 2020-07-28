package designpattern;

public class SimpleSingleton {

	// The constructor must be private to prevent another class instance
	private SimpleSingleton() {
		
	}
	
	// static and final to prevent later modification of instance/obj.
	private final static SimpleSingleton ss = new SimpleSingleton();
	
	public SimpleSingleton getInstance() {
		return ss;
	}
}
