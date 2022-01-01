package week3cars;

public abstract class  Car  {
	private String name;
	private double engSize;
	protected int horsePower;

	public Car(String name, double engSize, int horsePower ) {
		super();
		this.name = name;
		this.engSize = engSize;
		this.horsePower = horsePower;
	}


	public Car (double pEngSize) {
		engSize = pEngSize;

	}
	public Car() {
	}

	public abstract void setSpecialName (String name);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEngSize() {
		return engSize;
	}

	public void setEngSize(double engSize) {
		this.engSize = engSize;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;

	}

}





