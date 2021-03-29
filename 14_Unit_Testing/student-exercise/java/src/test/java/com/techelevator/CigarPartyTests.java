package com.techelevator;




import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests
{
	
	@Test
	public void haveParty_shouldReturnFalse_whenFewerThan30CigarsOnWeekday() 
	{
		// arrange
		CigarParty party = new CigarParty(); //object under test
		
		int numberOfCigars = 30;
		boolean isWeekend = false;
		
				
		
		// act
		// call the function of the object under test
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		// assert
		Assert.assertFalse("Because parties with < 40 cigars on a weekeday suck ", actual);
		
	}
	
	@Test
	public void haveParty_shouldReturnFalse_whenMoreThan60CigarsOnWeekday() 
	{
		//arrange
		CigarParty party = new CigarParty();
		
		int numberOfCigars = 65;
		boolean isWeekend = false;
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		// assert
		Assert.assertFalse("Because parties with > 60 cigars on a weekday are too wild ", actual);
	}
	
	@Test
	public void haveParty_shouldReturnFalse_whenLessThan40CigarsOnWeekend() 
	{
		// arrange
		CigarParty party = new CigarParty();
		
		int numberOfCigars = 38;
		boolean isWeekend = true;
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		
		// assert
		Assert.assertFalse("Because parties with < 40 cigars are lame ", actual);
	}
	
	@Test
	public void haveParty_shouldReturnTrue_whenMoreThan40CigarsOnWeekend() 
	{
		// arrange
		CigarParty party = new CigarParty();
		
		int numberOfCigars = 58;
		boolean isWeekend = true;
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		// assert
		Assert.assertTrue("Because parties with > 40 cigars on the weekend are magical ", actual);
		
	}
	
	@Test
	public void haveParty_shouldReturnTrue_whenMoreThan40CigarsOnWeekday() 
	{
		// arrange
		CigarParty party = new CigarParty();
		
		int numberOfCigars = 42;
		boolean isWeekend = false;
		
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		// assert
		Assert.assertTrue("Because parties with > 40 cigars on a weekday are a good mental break", actual);
	}
	
	@Test
	public void haveParty_shouldReturnTrue_whenCigarsEquals60OnWeekday() 
	{
		// arrange
		CigarParty party = new CigarParty();
		
		int numberOfCigars = 60;
		boolean isWeekend = false;
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		// assert
		Assert.assertTrue("Because parties with exactly 60 cigars on a weekday are the best ", actual);
		
	}
	
	@Test
	public void haveParty_shouldReturnTrue_whenCigarsEquals40OnWeekday() 
	{
		// arrange
		CigarParty party = new CigarParty();
		
		int numberOfCigars = 40;
		boolean isWeekend = false;
		
		//act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		// assert
		Assert.assertTrue("Because parties with exactly 40 ciagrs on a weekday are still fun ", actual);
	}
	

}
