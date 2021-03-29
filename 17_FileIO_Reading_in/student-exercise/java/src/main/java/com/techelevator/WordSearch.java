package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) 
	{
		File inputFile = getInputFileFromUser();
		String keyword = wordToSearch();
		searchingAlice(inputFile, keyword);
	}
	
	private static File getInputFileFromUser() 
	{
		@SuppressWarnings("resource")
		Scanner fileInput = new Scanner(System.in);
		System.out.println("Please enter file path: ");
		String path = fileInput.nextLine();
		
		File inputFile = new File(path);
		
		if (!inputFile.exists()) 
		{
			System.out.println(path + "This path does not exist.");
			System.exit(1);
		}
		else if (!inputFile.isFile()) 
		{
			System.out.println(path + "This is not a file");
			System.exit(1);
		}
		return inputFile;
	}
	
	public static String wordToSearch() 
	{
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a keyword to search: ");
		String searchKeyword = userInput.nextLine();
		
		return searchKeyword;
	}
	
	public static String searchingAlice(File inputFile, String searchKeyword) 
	{
		@SuppressWarnings("resource")
		Scanner caseSensitiveQuestion = new Scanner(System.in);
		System.out.println("Would you like your search to be case sensitive? (Y)es or (N)o ");
		String yesOrNo = caseSensitiveQuestion.nextLine().toLowerCase().substring(0, 1);
		
		try (Scanner input = new Scanner(inputFile)) 
		{
			int x = 0;
			
			while (input.hasNextLine()) 
			{
				if (yesOrNo.equals("n")) 
				{
					x++;
					String line = input.nextLine();
					if (line.toLowerCase().contains(searchKeyword.toLowerCase())) 
					{
						System.out.println(x + ") " + line);
					}
					else 
					{
						
					}
				}
				else 
				{
					String line = input.nextLine();
					if (line.contains(searchKeyword)) 
					{
						System.out.println(x + ") " + line);
					}
				}
			}
		
			
		} catch (FileNotFoundException e)
		{
			System.out.println("Your file does not exist.");
		}
		return "";
	}

}
