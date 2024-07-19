package demo1;

public class Cars {
	
	//Declaring instance variables
	public String make;
	public String model;
	public int year;
	public int doorNum;
	public int engineSize;
	public String color;
	public float price;
	
	//Assigning instance method
	public void assign(String make, String model, int year, int doorNum,int engineSize,String color,float price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.doorNum = doorNum;
		this.engineSize = engineSize;
		this.color = color;
		this.price = price;
		
	}
	
	//Displaying instance method
	
	public void display() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Number of Doors: "+doorNum);
		if(doorNum < 3) {
			System.out.println("Something is not right!");
		}
		System.out.println("Engine Size: "+engineSize+" Letter");
		if(engineSize < 2) {
			System.out.println("Very economical car!");
		}
		System.out.println("Color: "+color);
		if(color == "White" || color == "Black" || color == "Red" || color == "Silver") {
			System.out.println("Great joice!");
		}else {
			System.out.println("Special color!");
		}
		System.out.println("Price: "+price);
		if(price >= 15000) {
			System.out.println("That's a great car!");
		}
	}

}
