package day19;

import java.lang.reflect.Array;
//ctrl shift + o imports the ArrayList
import java.util.ArrayList;
import java.util.Arrays;


public class ArrayVsArrayList {

	public static void main(String[] args) {
		//Declaring friends Array
		//String[] friendsArray = new String[4];
		
		//Declare and initlizing Array directly
		String [] friendsArray2 = {"John","Chris","Eric","Luke"};
		
		//ArrayList
		//ArrayList<String> friendsArrayList = new ArrayList<>();
		
		//Create
		ArrayList<String> friendsArrayList2 = new ArrayList<>
		(Arrays.asList("John","Chris","Eric","David"));
		
		//This will print out the second from friendsArray2.
		//Get element
		System.out.println(friendsArray2[1]);
		System.out.println(friendsArrayList2.get(1));
		
		//Get size
		System.out.println(friendsArray2.length);
		System.out.println(friendsArrayList2.size());
		
		//We can add to Array list but can't with Arrays.
		
		//Add an element
		friendsArrayList2.add("Mitch");
		System.out.println(friendsArrayList2.get(4));
		
		//Set an element
		friendsArray2[0] = "Esmadula";
		System.out.println(friendsArray2[0]);
		
		friendsArrayList2.set(0, "Esmadula");
		System.out.println(friendsArrayList2.get(0));
		
		//Remove an element
		//You can't do that with Array
		friendsArrayList2.remove(0);
		System.out.println(friendsArrayList2.get(0));
		
		//Price
		System.out.println(friendsArray2);
		System.out.println(friendsArrayList2);
		
		friendsArrayList2.
	}

}
