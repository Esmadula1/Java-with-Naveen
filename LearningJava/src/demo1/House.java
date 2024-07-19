package demo1;

public class House {
	//Declaring instance variables
	public String houseName ;
	public String address;
	public float squareMeter;
	public int numOfRooms;
	public int numOfDoors;
	public int numOfWindows;
	public int numOfFloors;
	public String exterMadeOff;
	public String interMadeOff;
	
	//Assigning instance method
	
	public void assign(String houseName, String address, 
			float squareMeter,int numOfRooms, int numOfDoors,
			int numOfWindows, int numOfFloors, String exterMadeOff, String interMadeOff
			) {
		this.houseName = houseName;
		this.address = address;
		this.squareMeter = squareMeter;
		this.numOfRooms = numOfRooms;
		this.numOfDoors = numOfDoors;
		this.numOfWindows = numOfWindows;
		this.numOfFloors = numOfFloors;
		this.exterMadeOff = exterMadeOff;
		this.interMadeOff = interMadeOff;
		
		
	}
	
	//Displaying instance method.
	
	public void display() {
		System.out.println("House Name: "+houseName);
		System.out.println("Address: "+address);
		System.out.println("House Size: "+squareMeter);
		System.out.println("No Of Rooms:"+numOfRooms);
		System.out.println("No of Doors: "+numOfDoors);
		System.out.println("No of Windows: "+numOfWindows);
		System.out.println("No of Floors: "+numOfFloors);
		System.out.println("External: "+exterMadeOff);
		System.out.println("Interior: "+interMadeOff);
	}
	
	
	

}
