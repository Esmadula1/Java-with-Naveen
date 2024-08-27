package day24;

import java.util.HashMap;

public class Hshmap {

	public static void main(String[] args) {
		HashMap<String,Integer> population = new HashMap<>();
		population.put("Tonbridge", 30000);
		population.put("Tunbridge Wells", 2000);
		population.put("London", 7000000);
		
		System.out.println(population.get("London"));
		System.out.println(population);
		population.remove("Tonbridge");
		System.out.println(population);
		population.replace("Tunbridge Well", 10000);
		population.containsValue("T Wells");
		System.out.println(population);
		population.clear();
		System.out.println(population);
	}

}
