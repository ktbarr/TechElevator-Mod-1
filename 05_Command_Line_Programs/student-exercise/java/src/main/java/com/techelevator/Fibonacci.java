package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		String userInput = "0";
		int maxValue;
		String fibonacciSequence;
		
		
		System.out.println("Please enter the Fibonacci number: ");
		userInput = scanner.nextLine();
		maxValue = Integer.parseInt(userInput);
		
		fibonacciSequence = returnFibonacciSequence(maxValue);
		
		System.out.println();
		System.out.println("The fibonacci sequence for "  + maxValue + " is: ");
		System.out.println(fibonacciSequence);
		
		scanner.close();
		
	}
	public static String returnFibonacciSequence(int maxValue) 
	{
		String sequence = "0";
		int previousNumber = 0;
		int nextNumber = 1;
		
		while (nextNumber <= maxValue) 
		{
			sequence += nextNumber + " ";
			
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
			
		}
		return sequence;
	}
	

	
}
