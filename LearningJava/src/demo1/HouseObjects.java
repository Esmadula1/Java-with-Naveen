package demo1;

public class HouseObjects {

	public static void main(String[] args) {
		// Creating object
		System.out.println("House Details \n________________");
		House house1 = new House();
		house1.assign("2B", "West Malling", 210, 4, 6, 7, 2, "Brick", "Wood");
		house1.display();
		
		
		//Second object
		System.out.println();
		System.out.println("House Details \n________________");
		
		House house2 = new House();
		house2.assign("2B Albert Road", "Tonbridge", 300, 4, 6, 7, 2, "Wood", "Plaster boared");
		house2.display();

	}

}
