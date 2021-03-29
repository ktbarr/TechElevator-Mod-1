package com.techelevator;

import java.util.Scanner;

public class NotesDay6
{
	public static void main(String[] args) 
	{
		
		/* if( age >= 13) --->> if statements MUST be in () 
		 * -->> don't use a ; after these. the ; will end the code. 
		 * -->> should always just have a test: don't use this same line to identify 
		 */
		
		
		 /* STREAMS -
		  * 
		 * System.out --> stream that goes from CPU to Monitor
		 * Data is always moved in a stream. 
		 * 
		 * System.in --> stream that goes from data source into CPU --> this is raw data in binary ex. 101010101010
		 * Get data from input devices: keyboard, mouse, data source, etc. 
		 * 
		 * in order to read from System.in we need a Scanner. You need to create this:
	 *  
	 *  	Scanner scanner = new Scanner(System.in);
	 *  
	 *  	Scanner --> creates the scanner and tells you it's a scanner data type
	 *  	scanner --> is the name you give it. 
	 *  	= new Scanner(System.in); --> creating a new scanner
		 * 
		 * Example:
		 * 
		   Scanner scanner = new Scanner(System.in);
		
		// get child's name
		
			System.out.println("Please enter the child's name: ");
			String name = scanner.nextLine();
			System.out.println("Hello " + name);
		 
		 // get the child's age
		
			System.out.println("Please enter the child's age: ");
			String ageInput = scanner.nextLine();
		// take the user input and extract an int from it. 
			int age = Integer.parseInt(ageInput);
			
			**Types of parse to convert String to other data (number) types. 
			* Integer.parseInt()
			* Long.parseLong()
			* Double.parse(Double)
			* Float.parse(Float)
		
			int age = 14;
		
			if(age >= 13) 
			{
				System.out.println("You can play");
			}
			else 
			{
				System.out.println("You are not old enough to play");
				System.out.println("Because you are not at least 13 years old");
			}
			
			
		 * 
		 * Result:
		 	Please enter the child's name: --> cursor will blink until data being requested is entered. 
			AJ --> typed this into Console, then below displayed. 
			Hello AJ
			You can play
		 * 
		 * *** Adding Age Groups ***
		 * 
		 * // ** If a child falls into the below age ranges, show which group they can register for. 
	
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
			nameOfAgeGroup = "mighty mites";
		}
		else if(age <= 13) 
		{
			nameOfAgeGroup = "bantam";
		}
		else if(age <= 15) 
		{
			nameOfAgeGroup = "juniors";
		}
		else 
		{
			nameOfAgeGroup = "too old to play";
		}
		
		return nameOfAgeGroup;
	}
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
	}
}
