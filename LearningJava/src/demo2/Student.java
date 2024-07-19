package demo2;

public class Student {
	//instance variable
	String name;
	int age;
	String contact;
	int marks[] = new int [6];
	
	
	//constructor
	
	public Student(String name, int age, String contact, int marks []) {
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.marks = marks;
		
	}
	public void display() {
		System.out.println("Student name :"+name);
		System.out.println("Student age :" +age);
		System.out.println("Student contact: "+contact);
		System.out.println("Subject 1 Mark: "+marks[0]);
		System.out.println("Subject 2 Mark: "+marks[1]);
		System.out.println("Subject 3 Mark: "+marks[2]);
		System.out.println("Subject 4 Mark: "+marks[3]);
		System.out.println("Subject 5 Mark: "+marks[4]);
		System.out.println("Subject 6 Mark: "+marks[5]);
		//System.out.println("Subject 7 Mark:"+marks[6]); Error Index 6 out of bounds for length 6
		
	}
	
	public int get_total() {
		int total=0;
		total = marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5];
		return total;
		
	}

}
