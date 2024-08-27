package day24;

public class TernaryOperator {
	public static void main(String[] args) {
		//Using Ternary operator
		int num1 = 0;
		int num2 = 20;
		
		String result = (num1 > num2)?"num1 is bigger":"num2 is bigger";
		System.out.println(result);//num2 is bigger
		
		boolean result1=(num1>2)?true:false;
		System.out.println(result1);//this will print false
		
		int result3 = (num1>num2)?1:2;
		System.out.println(result3);//will print 2
		
	}
}
