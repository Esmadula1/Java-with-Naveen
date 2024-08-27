package day24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// exception = an even that accrues during the execution of a program
		//		that disrupts the normal flow of instruction
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a whole number to divide");
			int x = sc.nextInt();
			
			System.out.println("Enter a whole number to divide by");
			int y = sc.nextInt();
			
			int z = x/y;
			
			System.out.println("Result "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("You can't devide by zero!");
		}
		
		catch(InputMismatchException e) {
			System.out.println("Please enter a number!");
		}
		
		catch(Exception e) {
			System.out.println("Something went wrong!");
		}
		
		finally {
			sc.close();
		}

	}

}
