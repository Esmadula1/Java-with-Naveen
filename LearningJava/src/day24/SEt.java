package day24;

import java.util.HashSet;
import java.util.Set;

public class SEt {

	public static void main(String[] args) {
		//Set method avoids the repeated elements and it will print out in order.
		Set<Integer> set = new HashSet<>();
		set.add(6);
		set.add(4);
		set.add(3);
		set.add(5);
		set.add(5);
		set.add(25);
		
		System.out.println(set);

	}

}
