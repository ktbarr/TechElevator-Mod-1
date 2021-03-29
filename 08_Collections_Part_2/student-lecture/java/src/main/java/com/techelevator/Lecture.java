package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) 
	{

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "Zoe");
		
		
		// creates a map with <K, V> <String, String> --> K = Key (Unique Identifier) ; V = Value (can be dupe)
		Map<String, String> dailySpecials = new HashMap<String, String>();
		
		// HashMap --> based on hash -- look this up more
		// TreeMap --> alpha order
		// LinkedHashMap --> in order of .put 
		
		
		// adding items to the map
		dailySpecials.put("Monday", "Waffles");
		dailySpecials.put("Tuesday", "Pancakes" );
		dailySpecials.put("Wednesday", "French Toast");
		dailySpecials.put("Thursday", "Oatmeal");
		dailySpecials.put("Friday", "Eggs Benne");
		dailySpecials.put("Saturday", "Brunch");
		dailySpecials.put("Sunday", "Sunday Funday");
		
		String tuesdaySpecial = dailySpecials.get("Tuesday");
		
		System.out.println("Tuesday's Special is: " + tuesdaySpecial);
		
		// * if you use the same key twice it will override to the item lower in code. 
		dailySpecials.put("Monday", "Crepes");
		
		String mondaySpecial = dailySpecials.get("Monday");
		System.out.println("Monday's Special is: " + mondaySpecial);
		
		// Loop through all the items in the Map. 
		
		// option 1 to loop through all the values
		// 		get the keys - Set<String> keys = dailySpecials.keySet();
		// 		loop through the keys - for each loop (HAS TO BE THIS TYPE OF FOR LOOP) -- for(String key : keys) {
		//  	get the value for each key  - String special = dailySpecials.get(key);
		//		return or print result - key
		
		// keySet -->
		// Set<> --> used for keys
		// the keys of the map are a set
		// we can use just the keySet function to get all the keys
		
		Set<String> keys = dailySpecials.keySet();
		
		for(String key : keys) 
		{
			String special = dailySpecials.get(key);
			System.out.println(key + " : " + special);
			System.out.println(key);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		// Option 2
		//  	loop through each ROW -- for each loop -- for (String key: keys)
		//  	get the key and value from the row -- 
		// 		return/print key
		
		for(Map.Entry<String, String> row : dailySpecials.entrySet()) 
		{
			System.out.println(row.getKey() + " : " + row.getValue());
			System.out.println();
			System.out.println(row);
		}
			
		
	}

}
