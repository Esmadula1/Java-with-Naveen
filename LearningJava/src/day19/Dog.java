package day19;

public class Dog {
	//instance variables
	String name;
	int age;
	
	//constructor
	public  Dog(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Dog name : "+name);
		System.out.println("Doge age : "+age);
	}
}
