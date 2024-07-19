package day19;

public class CarsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCars cars = new NewCars("BMW", "X5", 4, "Petro");
		cars.disply();
		cars.fuelType();
		
		System.out.println();

		NewCars car1 = new NewCars("Audi", "Q7", 5, "Desiel");
		car1.disply();
		car1.fuelType();
		
		System.out.println();
		NewCars car3 = new NewCars("Ferrari", "Best", 2, "Petrol");
		car3.disply();
		car3.fuelType();

	}

}
