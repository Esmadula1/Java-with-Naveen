package day24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(20);
		System.out.println("Not sorted ->"+list);
		
		Collections.sort(list);//Collections will sort the elements
		
		System.out.println("Sorted ->"+list);
		
		System.out.println("Binary Search result"+Collections.binarySearch(list, 100));
		//frequency method will show number of time a number has repeated.
		System.out.println("Freequency of 20-> "+Collections.frequency(list, 20));
		
		List<String>names = new ArrayList<>();
		names.add("Esmadula");
		names.add("hasani");
		names.add("Esmadula");
		names.add("Esmadula");
		names.add("Esmadula");
		System.out.println("Frequency of names -> "+Collections.frequency(names, "hasani"));
		
		System.out.println("Max element in the list"+Collections.max(names));

	}

}
