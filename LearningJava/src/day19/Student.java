package day19;

public class Student {
	
	public String name;
	public int age;
	public String gender;
	public int contact;
	public String email;
	public int marks;
	
	//contractor method
	public Student(String name,int age,String gender,int contact,String email,int marks) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact = contact;
		this.email = email;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Contact: "+contact);
		System.out.println("Email: "+email);
		System.out.println("Marks: "+marks[]);
	}

}
