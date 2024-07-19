package demo1;

public class Student {
	//instance variables
	public int studentId;
	public String name;
	public int age;
	public String address;
	
	//static variables
	static String faculty;
	static double fee;
	
	//Assigning instance method
	public void assign(int studentId,String name,int age,String address) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//Displaying instance variables
	public void display() {
		System.out.println("Student ID: "+studentId);
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
		System.out.println("Address: "+address);
		
	}
	
	//Assigning static method.
	
	public static void assign() {
		 faculty = "Naveen";
		 fee = 1900;
	}
	
	//Displaying static method
	public static void print() {
		
		System.out.println("Faculty: "+faculty);
		System.out.println("Fee: "+fee);
	}
}
