package day24;

public class Main {

	public static void main(String[] args) {
		// creating object
		//first employee
		Employee emp1 = new Employee();
		emp1.assign(101, "Esmadula", 9);
		emp1.display();
		float sal = emp1.getSal();
		System.out.println("Your sallary is "+"£"+ sal);
		
		System.out.println();
		//second employee
		Employee emp2 = new Employee();
		emp2.assign(102, "John", 12);
		emp2.display();
		sal = emp2.getSal();
		System.out.println("Your Sallary is "+"£"+sal);
		
		System.out.println();
		
		//third employee
		
		Employee emp3 = new Employee();
		emp3.assign(103, "Mark", 10);
		emp3.display();
		sal = emp3.getSal();
		System.out.println("Your Sallary is "+"£"+sal);


	}

}
