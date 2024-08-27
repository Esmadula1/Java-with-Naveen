package day24;
import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		//creating Hashmap to store emplyee name and Ids
		/*

		HashMap<String,Integer> empIds = new HashMap<String,Integer>();
		empIds.put("Esmadula",10234);
		empIds.put("Hassani", 9763);
		empIds.put"John", 34343);
		empIds.put("Clair", 343243);
		empIds.put("Jahn", 3434);
		System.out.println(empIds);//printsout all employee names and Ids.
		System.out.println(empIds.get("Esmadula"));//prints out Esmadula's Id.
		System.out.println(empIds.containsKey("Jourge"));//this will check if Jourge exist
		System.out.println(empIds.containsKey("Hassani"));
		empIds.put("Esmadula", 123456789);//this will override the Esmadula's Id.
		System.out.println(empIds);
		empIds.replace("Esmadula", 777);//this will replace the Esmadula's Id.
		System.out.println(empIds);
		empIds.putIfAbsent("Esmadola", 222);//this will add new empId to the list.It only works if already doesn't exist
		empIds.remove("Esmadola");//This will remove Esmadola from the map.
		System.out.println(empIds);
		
		*/
		/*
		HashMap<String,Integer> catNameAge = new HashMap<String,Integer>();
		catNameAge.put("Jazpa",10);
		catNameAge.put("Tome", 11);
		catNameAge.put("Morly", 2);
		System.out.println(catNameAge);
		catNameAge.remove("Jazpa");//removes from the list
		System.out.println(catNameAge);
		catNameAge.putIfAbsent("Alex", 13);//adds new cat to the list
		System.out.println(catNameAge);
		System.out.println(catNameAge);
		*/
		
		HashMap<String,Integer> stAge = new HashMap<>();
		stAge.put("Esmadula", 21);
		stAge.put("David", 34);
		stAge.put("Cameron", 18);
		stAge.put("Clair", 19);
		stAge.put("Alexander", 45);
		System.out.println(stAge);
		stAge.putIfAbsent("eamdula", 19);
		System.out.println(stAge);
		stAge.remove("eamula");
		stAge.remove("eamdula");
		System.out.println(stAge);
		
		
		
		
	}

}
