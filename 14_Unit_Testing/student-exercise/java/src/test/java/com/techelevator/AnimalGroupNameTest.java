package com.techelevator;



import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest
{
	@Test
	public void getHerd_shouldReturnPrideWhenlionIsEnteredInAllLowerCase_Rawr() 
	{
		// arrange
		AnimalGroupName herdName = new AnimalGroupName();
		
		
		
		// act
		String actual = herdName.getHerd("Pride");
	
		//assert
		Assert.assertEquals("Input: animalGroupName(\"lion\")", "Tower", actual);
		
	}

}
