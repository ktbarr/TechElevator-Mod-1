package com.techelevator;

public class Day7Playground
{

	public static void main(String[] args)
	{
		// "blocking" 2 new arrays on the heap - 
		// ** these are not the same because they point to different locations on the heap (heapName1 & heapName2)
		/* ** input from user will always create new heap for each. 
		 * 
		 *  String name1 = new String("Katie");
			String name2 = new String("Katie");
		
			boolean areEqual = name1 == name2;
		
			System.out.println("name1 == name2: " + areEqual);
			
			
			** These will be the same: use this one
			String name1 = new String("Katie");
			String name2 = new String("Katie");
		
			boolean haveSameValue = name1.equals(name2);
		
			System.out.println("name1.equals(name2): " + haveSameValue);
			
			** These will be true -> not creating new string object, hard coding "Cars" into String Variable.
			String name3 = "Cars";
			String name4 = "Cars";
		
			areEqual = name3 == name4;
		
			System.out.println("Name 3 = Name 4" + areEqual);
		 * 
		 */
		
		String name1 = new String("Katie");
		String name2 = new String("Katie");
		
		boolean areEqual = name1 == name2;
		System.out.println("name1 == name2: " + areEqual);
		
		boolean haveSameValue = name1.equals(name2);
		System.out.println("name1.equals(name2): " + haveSameValue);
		
		int[] numbers = new int[] {1,2,3,4,5};
		
		int first = numbers[0];
		char firstLetter = name1.charAt(0);
		
		for (int i = 0; i < name1.length(); i++) 
		{
			System.out.println(name1.charAt(i));
		}
		
		// Strings are immutable --> they cannot change
		name1 = "John";  // can't change value, can't change length. WHen you do this it creates a new name1 in memory and will show moving forward, but the OG one is stll there. 
		System.out.println(name1);
		
		name1 += " ";
		name1 += "Barr";
		System.out.println(name1); 
		
		String name3 = "Cars";
		String name4 = "Cars";
		
		areEqual = name3 == name4;
		
		System.out.println("Name 3 = Name 4" + areEqual);
		

	}

}
