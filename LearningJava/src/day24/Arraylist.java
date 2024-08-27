package day24;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
//		//Using ArrayList
//		ArrayList<String> cars = 
//				new ArrayList<>(Arrays.asList("BMW","Hyundai","Audi","Ferrari","Merc"));
//		//Printing ArrayList
//		System.out.println(cars);
//		
//		//Adding
//		cars.add("Austin Martin");
//		//printing after added to list
//		System.out.println(cars);
//		
//		//Removing
//		cars.remove("Austin Martin");
//		//Printing after removed
//		System.out.println(cars);
//		
//		//Setting an element will replace the element.
//		cars.set(0, "Toyota");
//		//Printing after set 
//		System.out.println(cars);
		
//		ArrayList<String> frouitList = new ArrayList<>();
//		frouitList.add("Apple");
//		frouitList.add("Orange");
//		System.out.println(frouitList);
//		frouitList.remove(0);
//		System.out.println(frouitList);
		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(40);
//		list.add(50);
//		list.add(30);
//		ListIterator<Integer> her = list.listIterator();
//		System.out.println(((ArrayList<Integer>) her).listIterator());
		
		ArrayList<String> people = new ArrayList<>();
		people.add("John");
		people.add("Dave");
		people.add("Jane");
		
		people.remove("Dave");
		if(people.contains("John")) {
			System.out.println("John is in the list!");
		}
		
		if(people.isEmpty()) {
			System.out.println("The list is empaty!");
		}
		people.clear();
		System.out.println(people);
		
		

	}

}
