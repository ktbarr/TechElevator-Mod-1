package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald
{
	public static void main(String[] args)
	{

		// add logic to sing about the farm
		//cowDemo();
		
		List<FarmAnimal> animals = new ArrayList<FarmAnimal>();
		animals.add(new Chicken());
		animals.add(new Cow());
		animals.add(new Pig());
		
		for (FarmAnimal animal : animals)
		{
			singVerse(animal);
		}
	

	}

	public static void singVerse(FarmAnimal animal)
	{
		String name = animal.getName();
		String sound = animal.getSound();

		System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
		System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
		System.out.println("With a " + sound + " " + sound + " here");
		System.out.println("And a " + sound + " " + sound + " there");
		System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
		System.out.println();

	}
	
	public static void cowDemo() 
	{
		Cow cow = new Cow();
		System.out.println(cow.getSound());
		cow.startEating();
		System.out.println(cow.getSound());
		cow.stopEating();
		System.out.println(cow.getSound());
		
		FarmAnimal animal = cow;
		System.out.println(animal.getSound());
	}
	
		
	
	public static void chickenDemo() 
	{
FarmAnimal pig = new FarmAnimal("Pig", "oink!");
		
		
		Chicken chicken = new Chicken(); 
		// when this is created, has name, sound, and lay an egg. (get all 3)
		// this can do everything FarmAnimal can do, plus whatever extra a chicken can do
		// specific type
		
		//implict conversion, bc a chicken IS a FarmAnimal
		FarmAnimal animal = chicken;
		//  has name, sound, (get both)
		//creating a FarmAnimal named animal --> points to same memory location, but only to FarmAnimal
		// generic FarmAnimal
		
		System.out.println(animal.getName());
		// animal doesn't know that layEgg() is available
		// to do that we need to convert the animal to a chicken
		// complier doesn't like Chicken c2 = animal; --> because not every animal is a chicken
		
		Chicken c2 = (Chicken)animal;
		c2.layEgg();
		
		
		
		
		
		System.out.println(pig.getName() + " says " + pig.getSound());
		System.out.println(chicken.getName() + " says " + chicken.getSound());
		
		chicken.layEgg();
	}
}