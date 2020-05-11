package designpattern;

import java.io.Serializable;

//simple way is to make constructor private and all object final.
public final class Singleton implements Serializable// to restrict inheriting we have to make classs final.
{
	private static final long serialVersionUID = 1L;
	static Singleton obj = null; 
	

	private Singleton() {
		
		// one way to avoid having new object is as below
		if (obj != null) {
			throw new IllegalStateException();
		}
	}

	public static Singleton getInstance() {
		// return obj; or lazy loading as follows
		
		synchronized (Singleton.class) {
			if (obj == null) {
				obj = new Singleton();
			}
		}
		
		return obj;
	}
	// but this implementation is not thread safe. many threads can see "null" at
	// the same time of obj creation and lead to creating objects at the same time.
	// To avoid that we should place initialization code inside sync block

	
	//to preserve singleton property. let GC tc of singleton impersonator and return one same obj all the time.
	private Object readResolve() {
		return obj;
	}

}
