package designpattern.prototype;

public class DogEyes {

	private int numberOfEyes;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DogEar [numberOfEyes=" + numberOfEyes + "]";
	}

	public int getNumberOfEyes() {
		return numberOfEyes;
	}

	public void setNumberOfEyes(int numberOfEars) {
		this.numberOfEyes = numberOfEars;
	}
}
