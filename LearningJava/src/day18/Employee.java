package day18;

public class Employee {
	//instance variables
	//constructor is special kind of method
	//initializes instance variables of a class
	//Constructor can be called per object creation one time only.
	int idno;
	String name;
	float salary;
	
	//Default Constructor or non parameter. default constructor gives same value for every objects.
	public Employee() {
		idno = 101;
		name = "Esmadula";
		salary = 12500.0f;
	}
	
	//parameter constructor
	public Employee(int idno,String name,float salary) {
		this.idno = idno;
		this.name=name;
		this.salary = salary;
	}

	
	public void display() {
		System.out.println("Emplyee Idno = "+idno);
		System.out.println("Employee Name = "+name);
		System.out.println("Employee Salary ="+salary);
	}
	
}
