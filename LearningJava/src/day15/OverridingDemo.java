package day15;
//parent class
//Hierarchy level 
class Bank{
	double roi() {//method declaration
		return 0;//body of method
	}
}
//child class
class Bank1 extends Bank{
	double roi() 
	{
		return 10.5;
	}
	
}
//grand child class
class Bank2 extends Bank{
	
	double roi() {
		return 11.5;
	}
	
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Bank bk = new Bank();//Object created 
		bk.roi();//rio method is called and added the value to bk reference variable.
		System.out.println(bk.roi()); //bk reference variable printed with the value of roi method
		
		//Second object for Bank1
		Bank1 bk1 =new Bank1();
		bk1.roi();//rio method is called and added the value to bk1 reference variable.
		System.out.println(bk1.roi());//bk1 reference variable printed with the value of roi method
		
		Bank2 bk2 = new Bank2();//Object created
		bk2.roi();//rio method is called and added the value to bk2 reference variable.
		System.out.println(bk2.roi());//bk2 reference variable printed with the value of roi method
		

	}

}
