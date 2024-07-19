package day18;

public class Run {

	public static void main(String[] args) {
		// Calling constructor
		//creating the object and assigning it to emp1 variable.
		// Object is an instance of a class.
		//Instance means allocating memory which holds garbage value.
		//none parameter constructor
		
		Employee emp1 = new Employee();
		emp1.display();
		emp1.display();//display method is called 
		
		System.out.println();
		//parameter constructor
		Employee emp2 = new Employee(102,"Hasani",140000f);//value assigned to parameter variables
		emp2.display();//Display method is called
		
		System.out.println();
		
		//
		Employee emp3 = new Employee(103,"John",50000f);
		emp3.display();
		

	}

}
