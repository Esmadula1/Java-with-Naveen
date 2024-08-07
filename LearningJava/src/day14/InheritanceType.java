package day14;

//calss A
	class A{
		int a ;
		public char[] b;
		void display() {
			System.out.println(a);
		}
	}
	
	//class B extends class A
	// A is parent and B is child class
	//single level inheritance
	class B extends A{
		int b ;
		void show() {
			System.out.println(b);
		}
	}
	//multi level inheritance
	class C extends B{
		int c;
		void print() {
			System.out.println(c);
		}
	}

public class InheritanceType {
	
	public static void main(String[] args) {
//		B obj=new B();
//		System.out.println(obj.a);
//		System.out.println(obj.b);
//		
		C objc = new C();
		objc.a = 200;
		objc.b = 300;
		objc.c = 400;
		objc.display();
		objc.show();
		objc.print();
		
	}

}
