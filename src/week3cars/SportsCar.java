package week3cars;

public class SportsCar extends Car {
	private String specialName;
	private boolean turboCharged;
	protected int horsePower;

	public SportsCar (String specialName, boolean turboCharged,
					   int horsePower1, String name1, double engSize) {

	super();
	this.specialName = specialName;
	this.turboCharged = turboCharged;
	horsePower = 200;
	super.horsePower= 12;
	}

	@Override
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
		super.horsePower = 40;
		//super.setHorsePower(40);
		turboCharged = true;
	}




	public SportsCar() {
		setHorsePower(1200);
	}

	@Override
	public void setSpecialName(String name) {

	}

	public SportsCar (String specialName, double EngSize) {
    	super(EngSize);
  //  	engSize = EngSize;

    }

	public void setDefaultHorsePower () {
		horsePower = 200;
	//	super.horsePower = 100;
	}
}










