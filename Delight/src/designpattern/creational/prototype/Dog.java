package designpattern.prototype;

public class Dog implements Animal{

	private String name;
	private int age;
	private DogEar dogear;
	private DogEyes dogeye;
	private DogTail dogtail;
	private Dogleg dogleg;
	private String color;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", dogear=" + dogear + ", dogeye=" + dogeye + ", dogtail="
				+ dogtail + ", dogleg=" + dogleg + "]";
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the dogear
	 */
	public DogEar getDogear() {
		return dogear;
	}


	/**
	 * @param dogear the dogear to set
	 */
	public void setDogear(DogEar dogear) {
		this.dogear = dogear;
	}


	/**
	 * @return the dogeye
	 */
	public DogEyes getDogeye() {
		return dogeye;
	}


	/**
	 * @param dogeye the dogeye to set
	 */
	public void setDogeye(DogEyes dogeye) {
		this.dogeye = dogeye;
	}


	/**
	 * @return the dogtail
	 */
	public DogTail getDogtail() {
		return dogtail;
	}


	/**
	 * @param dogtail the dogtail to set
	 */
	public void setDogtail(DogTail dogtail) {
		this.dogtail = dogtail;
	}


	/**
	 * @return the dogleg
	 */
	public Dogleg getDogleg() {
		return dogleg;
	}


	/**
	 * @param dogleg the dogleg to set
	 */
	public void setDogleg(Dogleg dogleg) {
		this.dogleg = dogleg;
	}


	public Dog(String name, int age, String color,DogEar dogear, DogEyes dogeye, DogTail dogtail, Dogleg dogleg) {
		super();
		this.name = name;
		this.age = age;
		this.dogear = dogear;
		this.dogeye = dogeye;
		this.dogtail = dogtail;
		this.dogleg = dogleg;
		this.setColor(color);
	}

	
	public Animal clone()
	{
		Dog obj=null;
		
		try {
			obj=(Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
}
