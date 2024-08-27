package day24;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		// we use array when we same a group a collection of the same type of objects.
		//Arrays has fixed size.
		//In array can hold any type of data.
		String [] friendsArray2 = {"John","David","Chris","Martin"};
		
		//ArrayList do not have a fixed size.
		//In ArrayList can only hold objects
		//If you want to use premitve data type just use it's wrapper class
		//eg Integer insted of int.
		ArrayList<String> friendsArrayList2 = 
		new ArrayList<>(Arrays.asList("John","Chris","David","Mark"));
		//getting an element from Array
		System.out.println(friendsArray2 [0]);
		
		//getting an element from ArrayList
		System.out.println(friendsArrayList2.get(0));
		
		//printing the size of an Array
		System.out.println(friendsArray2.length);
		
		//printing the size of an ArrayList
		System.out.println(friendsArrayList2.size());
		
		//You can't add an element to the end of an Array.
		//But you can add element to ArrayList eg.
		friendsArrayList2.add("Esmadula");
		System.out.println(friendsArrayList2.get(4));
		
		//Set an element
		friendsArray2[0] = "Esmadula";
		friendsArrayList2.set(0, "Esmadula");
		
		System.out.println(friendsArray2[0]);
		System.out.println(friendsArrayList2.get(0));
		
		//Remove an element
		//Can't do with Array
		friendsArrayList2.remove("Esmadula");
		System.out.println(friendsArrayList2.get(0));
		
		//printing Array and ArrayList
		System.out.println(friendsArray2);
		System.out.println(friendsArrayList2);
		
	}

}
