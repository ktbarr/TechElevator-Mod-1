package com.techelevator;

import java.util.Scanner;

public class Plaground
{
	
	// where my program starts
	// entry point to the application
	public static void main(String[] args) 

	{
		/* int age = 14;
		
		if(age >= 13)
			System.out.println("You can play");
		else 
			System.out.println("You are not old enough to play");
			System.out.println("Because you are not at least 13 years old");
			
			If you don't use the {   } your system will read this as the last line as it's own line of code. It will print both 
			"You can play"
			"Because you are not at least 13 years old"
			
			to fix, add {  } like below. 
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		
		// get child's name
		
		System.out.print("Please enter the child's name: ");
		String name = scanner.nextLine();
		
		// get the child's age
		
		System.out.println("Please enter the child's age: ");
		String ageInput = scanner.nextLine();
		// take the user input and extract an int from it. 
		int age = Integer.parseInt(ageInput);
		
		// call the function that determines what age group
		String ageGroup;
		ageGroup = determineAgeGroup(age);
		
		System.out.println("Name: " + name);
		System.out.println("Age Group: " + ageGroup);
		
		
		// <10 		can't register
		// 10-11	mighty mites
		// 12-13	bantam
		// 14-15	juniors
		
		if(age >= 10) 
		{
			System.out.println(name + " can play");
		}
		else 
		{
			System.out.println(name + " is not old enough to play");
			System.out.println("Because " + name + " is not at least 13 years old");
		}
	
	/* Streams
	 * System.out output stream - console 
	 * System.in input stream - from console
	 * 
	 *  in order to read from System.in we need a Scanner. You need to create this:
	 *  
	 *  Scanner scanner = new Scanner(System.in);
	 *  
	 *  Scanner --> creates the scanner and tells you it's a scanner data type
	 *  scanner --> is the name you give it. 
	 *  = new Scanner(System.in); --> creating a new scanner
	 *   
	 */
	
		
	}
	
	// ** If a child falls into the below age ranges, show which group they can register for. 
	
			// <10 		can't register
			// 10-11	mighty mites
			// 12-13	bantam
			// 14-15	juniors
	
	public static String determineAgeGroup(int age) 
	{
		
		String nameOfAgeGroup;
		
		
		if(age < 10) 
		{
			nameOfAgeGroup = "too young to play";
		}
		else if(age <= 11)
		{
			nameOfAgeGroup = "Mighty Mites";
		}
		else if(age <= 13) 
		{
			nameOfAgeGroup = "Bantam";
		}
		else if(age <= 15) 
		{
			nameOfAgeGroup = "Juniors";
		}
		else 
		{
			nameOfAgeGroup = "Too old to play";
		}
		
		return nameOfAgeGroup;
	}
}
