package com.techelevator;

public class ArrayDemosAndNotes {
	
	public static void main(String[] args) {
		
		/*
		
		* Intro to Arrays*
		
		Without arrays you would need to add each individual as a variable. Arrays allow you to have a group
			how it would be written without array:
			
		int score1 = 99;
		int score2 = 87;
		int score3 = 92;
		
		// average 
		int averageScore = (score1 + score2 + score3)/ 3;
		
		Arrays are like a memory block to store data/lists. Will store the data in the same order. To retrieve you can either 
				retrieve all : scores
				retrieve specific: scores[0] ; scores [1] ;
				*can only be an integer*
*/		
//		
//			int score1 = 99;
//			int score2 = 87;
//			int score3 = 92;
		
		// average 
		// int averageScore = (score1 + score2 + score3)/ 3;
		
		int[] scores;	// creating "container"
		scores = new int[3];
		
		scores[0] = 99; //label each item in the "container"
		scores[1] = 87;
		scores[2] = 92;
		
		//print the second score
		System.out.println(scores[1]);
		
		// print how many scores - .length counts the number of items 
		System.out.println(scores.length);
		System.out.println();
		
		// print all scores - loop
		
		int sum = 0;
		
		for(int i = 0; i < scores.length - 1; i++) 
		{
			sum += scores[i];
			System.out.println(scores[i]); 
		}
		
		System.out.println();
		
		System.out.println("sum of scores: " + sum);
		
		double averageScore = (double)sum/scores.length;
		System.out.println("average score: " + averageScore);
	}

}
