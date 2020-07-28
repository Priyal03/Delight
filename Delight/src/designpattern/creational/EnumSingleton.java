package designpattern;

public enum EnumSingleton {

	Instance; // recommended approach. 

}

// the above code is equvivalent to
// public class Singleton {
//	   public static final Singleton INSTANCE = new Singleton();
//	   private Singleton() {}
//	} 

//enum singleton is probably the best way to implement a singleton. Unlike public field approach, enum is more concise and guarantees against multiple instantiation, even in the face of sophisticated serialization or reflection attacks.


