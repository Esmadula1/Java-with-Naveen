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

	}

}
