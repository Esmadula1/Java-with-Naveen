package day19;

public class Human {
	//Declaring instance variables
	String name;
	int age;
	double weight;
	//constructor
	Human(String name,int age,double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name +" is eating");
	}
	
	void drink() {
		System.out.println(this.name+" is drinking");
	}
}
