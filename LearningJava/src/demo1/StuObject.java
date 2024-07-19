package demo1;

public class StuObject {

	public static void main(String[] args) {
		// Creating object
		
		//First Object
		System.out.println("Student Details\n______________");
		Student stu = new Student();
		stu.assign(101, "Esmadula", 21, "West Malling Kent");
		stu.display();
		Student.assign();
		Student.print();
		
		//Second object
		System.out.println();
		System.out.println("Student Details\n______________");
		
		Student stu1 = new Student();
		stu1.assign(102, "Hasani", 24, "Kings Hill");
		stu1.display();
		Student.assign();
		Student.print();
		
		//Third Object
		
		System.out.println();
		System.out.println("Student Details\n______________");
		
		Student stu2 = new Student();
		stu2.assign(103, "John", 30, "Londong Road");
		stu2.display();
		Student.assign();
		Student.print();
		
		

	}

}
