package com.techelevator.farm;

public class FarmAnimal
{
	private String name;
	private String sound;

	public FarmAnimal(String name, String sound)
	{
		this.name = name;
		this.sound = sound;
	}
	
	public FarmAnimal()   // overloading by being able to create a null farmAnimal. Default constructor. Gives the same ability as above, but gives default capabilities. 
	{
		// call a different constr. with a different signature. 
		
		this("Cow", "moo!");
		
		//this.name = "Cow";
		//this.sound = "moo!";
		
		// so that I don't repeat myself. 
	}

	public String getName()
	{
		return name;
	}

	public String getSound()
	{
		return sound;
	}

}