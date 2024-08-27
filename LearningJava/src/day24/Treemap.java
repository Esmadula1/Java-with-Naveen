package day24;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<String,Integer> sortedMap = new TreeMap<>();
		sortedMap.put("key1", 10);
		sortedMap.put("key5", 20);
		sortedMap.put("key2", 30);
		sortedMap.put("key3", 40);
		//This will sort by they order.
		sortedMap.entrySet().forEach(System.out::println);
		System.out.println();
		TreeMap<String,Integer> age = new TreeMap<>();
		age.put("key2", 21);
		age.put("key5", 22);
		age.put("key1", 20);
		age.entrySet().forEach(System.out:: println);

	}

}
