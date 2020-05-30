package designpattern;
//nested class method
public class HolderPattern {

	private HolderPattern() {
	
	}

	// the static field of inner class are only initialized when class is explicitly
	// called. which is happening only once from getInstance() method. As LazyHolder is private
	
	private static class LazyHolder {
		
		static final HolderPattern INSTANCE = new HolderPattern();
	}

	public static HolderPattern gettheObj() {
		return LazyHolder.INSTANCE;
	}
}

//initialization on demand holder pattern for creating singleton