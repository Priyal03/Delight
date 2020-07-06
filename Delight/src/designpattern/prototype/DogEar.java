package designpattern.prototype;

public class DogEar {

	private int numberOfEars;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DogEar [numberOfEars=" + numberOfEars + "]";
	}

	public int getNumberOfEars() {
		return numberOfEars;
	}

	public void setNumberOfEars(int numberOfEars) {
		this.numberOfEars = numberOfEars;
	}
}
