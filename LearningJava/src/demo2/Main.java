package demo2;

public class Main {

	public static void main(String[] args) {
		// Declaring student Marks array
		int s1_mark[] = {89,45,67,23,56,34};
		Student s1 = new Student("Esmadula", 21, "07854333543", s1_mark);
		s1.display();
		int total = s1.get_total();
		System.out.println("Total marks = "+total);
		System.out.println("Average = "+ total/6);
		
		System.out.println();
		System.out.println("Second student");
		//declaring Array variable
		int s2_mark [] = {99,84,44,79,20,40};
		
		//Creating second student object
		Student s2 = new Student("John", 23, "078584584854", s2_mark);
		s2.display();
		int total1 = s2.get_total();
		System.out.println("Total Marks = "+total1);
		System.out.println("Average = "+total1/6);
		
		System.out.println();
		System.out.println("Third student ");
		//third student
		int s3_mark[]= {56,95,89,67,85,76};
		Student s3 = new Student("Mark", 34, "068685747475", s3_mark);
		s3.display();
		int total2 = s3.get_total();
		System.out.println("Total marks " +total2);
		System.out.println("Average " +total2/6);
		

	}

}
