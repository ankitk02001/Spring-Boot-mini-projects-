package p1;

public class Car {
	private DieselEngine dieselengine;
	public Car() {
		super();
		System.out.println("Car Constructor");
	}
	
	public Car(DieselEngine dieselengine) {
		super();
		this.dieselengine = dieselengine;
	}

	public void setDieselengine(DieselEngine dieselengine) {
		this.dieselengine = dieselengine;
	}
	public void drive() {
		int start = dieselengine.start();
		if(start>=1) {
			System.out.println("Journey started");
		}
	}
	

}
