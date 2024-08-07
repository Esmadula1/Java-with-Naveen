package day15;
//ABC parent class
class ABC{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

//XYZ child class
class XYZ extends ABC{
	void m1(int a)//overriding not changed declaration
	{
		System.out.println(a*a);//changed implementation
	}
	//Overriding we can only achieve with inheritance.
	void m2(int a, int b)//this is overloading declaration is changed.This is a new method
	{
		System.out.println(a+b);
	}
	void m2(int b)//overrided
	{
		System.out.println(b*b);
	}
}

public class OverridingVsOverloading {

	public static void main(String[] args) {
		
		XYZ xyzobj = new XYZ();
		xyzobj.m1(20);
		xyzobj.m2(30);
		xyzobj.m2(40, 50);
	}

}
