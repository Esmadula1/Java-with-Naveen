package day19;

public class NewCars {
	//instance variables
	String make;
	String model;
	int doors;
	String fuel;
	
	//constructor
	NewCars(String make,String model, int doors,String fuel){
		this.make = make;
		this.model = model;
		this.doors = doors;
		this.fuel = fuel;
		
	}

	public void disply() {
		System.out.println("Make:"+ make);
		System.out.println("Model:" +model);
		System.out.println("Doors: "+doors);
	}
	void fuelType() {
		System.out.println("This vehicle is "+fuel);
	}

}
