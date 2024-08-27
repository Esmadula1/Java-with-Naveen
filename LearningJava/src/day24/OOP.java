package day24;

public class OOP {

	public static void main(String[] args) {
		//creating object
		
		User u = new User();
		u.set_name("Hasani");
	
		u.id = 101;
		u.memberShip = "Gold";
		System.out.println(u.get_name());
		System.out.println("ID "+u.id);
		System.out.println("MemberShip: "+u.memberShip);
		
		User u2 = new User();
		u2.name= "John";
		u2.id = 102;
		u2.set_age(20);
		u2.memberShip = "Silver";
		System.out.println("Name:"+u2.name);
		System.out.println("ID "+u2.id);
		System.out.println(u2.get_age());
		System.err.println("MemberShip: "+u2.memberShip);//err will display in red colour.
		

	}

}
