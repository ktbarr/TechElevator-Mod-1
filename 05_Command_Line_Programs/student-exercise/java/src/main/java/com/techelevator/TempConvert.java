package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the temperature: ");
		String tempInput = scanner.nextLine();
		int temperature = Integer.parseInt(tempInput);
		
		System.out.println("Is the temperatire in (C)elsius, or (F)ahrenheit? ");
		String tempType =  scanner.nextLine();
		
		System.out.println(tempInput + tempType + " is " + determineTemp(temperature, tempType) + 
				(tempType.toUpperCase().startsWith("F") ? "C" : "F"));
		
		scanner.close();
		

	}
	public static int determineTemp(int temperature, String tempType)
	{
		
		if(tempType.toUpperCase().startsWith("F"))
		{
			int resultCelsius = (int)((temperature - 32)/ 1.8);
			return resultCelsius;
		}
		else 
		{
			int resultFahrenheit = (int)(temperature * 1.8 + 32);
			return resultFahrenheit;
		
	}
	}
}
