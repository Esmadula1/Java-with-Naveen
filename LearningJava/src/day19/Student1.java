package day19;

public class Student1 {
	//instance variables
	String name;
	String contact;
	double marks;
	
	//Constructor
	public Student1(String name, String contact,double marks) {
		this.name = name;
		this.contact = contact;
		this.marks = marks;
		
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public String getContact() {
		return contact;
	}
	
	public double getMarks() {
		return marks;
	}
	
	//Display method
	
	public void display() {
		System.out.println("Student Details:\n__________");
		System.out.println("Name: "+ name);
		System.out.println("Contact: " + contact);
		System.out.println("Marks: "+ marks);
		
	}
	

}
