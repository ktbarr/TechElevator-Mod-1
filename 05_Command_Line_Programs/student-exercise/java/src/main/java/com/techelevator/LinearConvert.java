package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the length: ");
		String lengthOfUnitString = scanner.nextLine();
		int measurement = Integer.parseInt(lengthOfUnitString);
		
		System.out.println("Is the measurement in (m)eter, or (f)eet? ");
		String typeOfMeasurement = scanner.nextLine();
		
		System.out.println(determineMeasurement(measurement, typeOfMeasurement));

		
		scanner.close();
		
	}
	public static String determineMeasurement(int measurement, String typeOfMeasurement)
	{
		
		if(typeOfMeasurement.toUpperCase().startsWith("M"))
		{
			int resultFeet = (int)(measurement * 3.2808399);
			return measurement + typeOfMeasurement + " is " + resultFeet + "f";
		}
		else
		{
			int resultMeter = (int)(measurement * 0.3048);
			return measurement + typeOfMeasurement + " is " + resultMeter + "m";
		}
	}
}
