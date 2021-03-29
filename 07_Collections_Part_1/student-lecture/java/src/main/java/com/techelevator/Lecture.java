package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.stream.events.Namespace;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		// List is comparable to an array
		// Lists are managed on the Heap 
		// Primitives are managed on the Stack --> int, double, float, etc. 
		
		// how you declare an array --> declare int data type; called numbersArray; 5 numbers;
		int[] numbersArray = new int[5];

		// how you declare a List --> declare List; Set type; name; new array name
		List<Integer> numbers = new ArrayList<>();
		
		//int is managed on the Stack
		// Java has wrapper classes for ALL primitives (int, double, float, etc.) --> managed on Stack
		// Integer is a wrapper for int (Integer, String, Double, etc.) --> managed on Heap
		
		// this is intuitive unlike an array. number will be added to the end of the list. 
		numbers.add(25);
		numbers.add(13);
		
		// since declared as Integer cannot add String --> numbers.add("Katie"); --> will not work. 
		
		
		// creating lists:
		// in new ArrayList --> can put <String>, but it infers this so it is not needed.
		
		List<String> superheroName = new ArrayList<>();
		
		// adding to the new list. 
		superheroName.add("Wolverine");
		superheroName.add("Iron Man");
		superheroName.add("Captain America");
		superheroName.add("Deadpool");
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		//getting name at position 0
		String firstSuperhero = superheroName.get(0);
		System.out.println("the first superhero is: " + firstSuperhero);
		
		// in the List for loop it says .size instead of .length. These are basically the same
		// .length : int  --> .size : List --> size tells you how many elements have been used. Collections will always be .size
		// default size for an array list is 10 (bucket)
		
		for(int i = 0; i < superheroName.size(); i++) 
		{
			System.out.println(superheroName.get(i));
		}

		
	
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		// can add duplicates
		superheroName.add("Iron Man");
		
		for(int i = 0; i < superheroName.size(); i++) 
		{
			System.out.println(superheroName.get(i));
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");


		// to add in a specific location in index. 
		superheroName.add(3, "Hulk");
		for(int i = 0; i < superheroName.size(); i++) 
		{
			System.out.println(superheroName.get(i));
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");


		// this will remove the item at index 2
		superheroName.remove(2);
		for(int i = 0; i < superheroName.size(); i++) 
		{
			System.out.println(superheroName.get(i));
		}
		
		System.out.println();
		
		
		// removing by object --> as soon as it finds one to remove it will remove that one and stop. 
		superheroName.remove("Iron Man");
		for(int i = 0; i < superheroName.size(); i++) 
		{
			System.out.println(superheroName.get(i));
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");


		// used to find if something is in the list. 
		boolean hasWolverine = superheroName.contains("Wolverine");
		System.out.println("Wolverine is in list: " + hasWolverine);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		
		//Where is Wolverine? --> will return the index number of where this text is found. 
		int wolverineIndex = superheroName.indexOf("Wolverine");
		System.out.println("Wolverine was found at index: " + wolverineIndex);
		
		System.out.println();
		System.out.println();
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		//  - ****** EXERCISES *******
		// sometimes need to convert to array
		// toArray(new String[0]) --> is creating new array with size 0;
		// toArray(new String[superheroName.size()]) --> populates the size of the current List. 
		
		//
// remove to see// String[] addressOnHeap = new String[superheroName.size()];
		// then you can use addressOnHeap instead of having this in the same line. 
		
		String[] superheroNamesArray = superheroName.toArray(new String[superheroName.size()]);
		
		System.out.println("Looping through the array, NOT the list: ");
		
		for(int i = 0; i < superheroNamesArray.length; i++) 
		{
			System.out.println(superheroNamesArray[i]);
		}
		
		

		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");


		// null is default comparison - this will be alpha. 
		superheroName.sort(null);
		
		for(int i = 0; i < superheroName.size(); i++) 
		{
			System.out.println(superheroName.get(i));
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		
		//can use Collections. to access more commands. (is a class that has a library of common functions that work with Lists.)
		
		Collections.reverse(superheroName);
		for(int i = 0; i < superheroName.size(); i++) 
		{
			System.out.println(superheroName.get(i));
		}

		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		
		// DIFFERENT TYPE OF LOOP
		
		
		// if you need to have control over what is printed , like printing every other. 
		for(int i = 0; i < superheroName.size(); i++)
		
		{
			String superheroNameString = superheroName.get(i);
			System.out.println(superheroNameString);
		}
		
		// if you want to print all items in the array; use this one. --> for each
		for(String superheroNameString: superheroName)
		{
			System.out.println(superheroNameString);
		}
		
		System.out.println();
		System.out.println();

	}
}
