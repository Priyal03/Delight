package designpattern.prototype;

public class Dogleg {

	private int numberOfLegs;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DogEar [numberOfLegs=" + numberOfLegs + "]";
	}

	public int getNumberOflegs() {
		return numberOfLegs;
	}

	public void setNumberOflegs(int numberOfEars) {
		this.numberOfLegs = numberOfEars;
	}
}
