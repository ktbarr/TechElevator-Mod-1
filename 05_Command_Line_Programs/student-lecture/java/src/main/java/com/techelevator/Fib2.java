package com.techelevator;

import java.util.Scanner;

public class Fib2
{

	public static void main(String[] args)
	{
		// helper object - not part of calculation; tool to receive information
		Scanner scanner = new Scanner(System.in);
		
		//variables - will be used
		String input;
		int maxValue;
		String fibonacciSequence = "";
		
		// get user input
		System.out.println("What is the max fibonacci number you want to display? ");
		input = scanner.nextLine();
		maxValue = Integer.parseInt(input);
		
		// perform calculations -> purpose, return the fibonacciSequence is
		fibonacciSequence = calculateFibonacciSequence(maxValue);
		
		
		// display the output
		System.out.println();
		System.out.println("The fibonacci sequence for "  + maxValue + " is: ");
		System.out.println(fibonacciSequence);
		
		scanner.close();
	}
	public static String calculateFibonacciSequence(int maxValue) 
	{
		String sequence = "0";
		int first = 0;
		int second = 1;
		
		while(second <= maxValue) 
		{
			sequence += second + " ";
			
			int temp = first + second;
			first = second;
			second = temp;
		}
		
		
		
		return sequence;
	}
}

