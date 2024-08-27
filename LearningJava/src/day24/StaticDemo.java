package day24;
class Emp{
	int empId;
	int salary;
	static String ceo;
	public void show() {
		System.out.println(empId + ": " + salary+ ":" + ceo);
	}
}
public class StaticDemo {
	

	public static void main(String[] args) {
		Emp esmadula = new Emp();
		esmadula.empId=8;
		esmadula.salary = 10000;
		Emp.ceo = "HASANI";
		
		
		Emp hasani = new Emp();
		hasani.empId= 9;
		hasani.salary = 2000;
		Emp.ceo = "HASANI";
		Emp.ceo = "ESmasdula";
		hasani.show();
		esmadula.show();
		
		

	}

}
