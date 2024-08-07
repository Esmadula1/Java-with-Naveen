package day14;

//in Hierarchy can have only one parent with many children
//should not sue the same class name in same package.
class Parent{
	void display(int a) {
		System.out.println(a);
	}
}

//child class
class Child1 extends Parent{
	void show(int b) {
		System.out.println(b);
	}
}
//child2
class Child2 extends Parent{
	void print(int c) {
		System.out.println(c);
	}
}

public class HirearchyInheritance {

	public static void main(String[] args) {
		//Creating object for Child1 class
		Child1 c1 = new Child1();
		c1.display(100);
		c1.show(200);
		
		System.out.println();
		//Creating object for Child2 class
		Child2 c2 = new Child2();
		c2.display(300);
		c2.print(400);
	
	}

}
