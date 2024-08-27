package day24;

public class User {
	String name;
	int id;
	int age;
	String memberShip;
	
	//Setting up setters
	void set_name(String name) {
		System.out.println("Hello ");
		this.name = name;
	}
	void set_age(int age) {
		this.age = age;
	}
	int get_age() {
		
		return age;
	}
	//Setting up getters
	String get_name() {
		return this.name;
	}
	

}
