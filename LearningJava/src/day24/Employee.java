package day24;

public class Employee {
	int empId,exp;
	String name;
	float sal;
	
	public void assign(int empId, String name, int exp) {
		this.empId = empId;
		this.name = name;
		this.exp = exp;
	}
	public void display() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name :"+name);
		System.out.println("Experience:"+exp);
	}
	public float getSal() {
		if(exp > 5) {
			sal = 50000.00f;
		}if(exp >7){
			sal = 60000.00f;
		}if(exp >= 8){
			sal = 75000.00f;
		}if(exp >= 10){
			sal = 120000.00f;
	}//else {
//			sal = 40000.00f;
//		}
		return sal;
	}

}
