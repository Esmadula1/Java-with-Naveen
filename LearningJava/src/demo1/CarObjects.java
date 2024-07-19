package demo1;

public class CarObjects {

	public static void main(String[] args) {
		// Creating objects
		System.out.println("Car Description \n______________");
		Cars car1 = new Cars();
		car1.assign("Hyundai", "Ioniq", 2018, 2, 2, "White", 15000);
		car1.display();
		
		//Second object
		System.out.println();
		System.out.println("Car Description \n______________");
		
		Cars car2 = new Cars();
		car2.assign("BMW", "X5", 2020, 5, 3, "Black", 20000);
		car2.display();
		
		
		//Third object
		System.out.println();
		System.out.println("Car Description \n______________");
		
		Cars car3 = new Cars();
		car3.assign("Merc", "C Class", 2024, 3, 3, "Pink", 30000);
		car3.display();
		

	}

}
