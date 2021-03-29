package com.techelevator;


import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest
{
	@Test
	public void getATable_shouldReturn2_yes_whenBothYouAndDateAre8OrMore() 
	{
		// arrange
		DateFashion table = new DateFashion();
		
		int you = 8;
		int date = 9;
		
		// act
		int actual = table.getATable(you, date);
		
		// assert
		Assert.assertEquals("You and your date get a table because of course you are both fashionable", 2, actual);
		
	}
	
	@Test
	public void getATable_shouldReturn2_yes_whenYouAreA8OrMore_butYourDateIsWearingPolkaDotsWithPlaid_alsoKnownAsLessThan8_butMoreThan2_() 
	{
		// arrange
		DateFashion table = new DateFashion();
		
		int you = 9;
		int date = 6;
		
		// act
		int actual = table.getATable(you, date);
		
		// assert
		Assert.assertEquals("You and your date get a table, but you will make fun of your date at least twice during dinner", 2, actual);
	}
	
	@Test
	public void getATable_shouldReturn2_yes_whenYourDryCleaningWasLateSoYourOutfitIsOutdated_akaLessThan8_butMoreThan2_andYourDateLooksGreat_akaAPerfect10() 
	{
		// arrange
		DateFashion table = new DateFashion();
		
		int you = 7;
		int date = 10;
		
		// act
		int actual = table.getATable(you, date);
		// assert
		Assert.assertEquals("You and your date get a table and laugh together about your dry cleaning mishap during dinner", 2, actual);
	}
	
	@Test
	public void getATable_shouldReturn0_no_whenYouAreWearingSweatpantsToANiceResturantForNoGoodReason_aka2OrLess_butYourDateIsWearingTheNewestStyles_akaAn8OrMore() 
	{
		// arrange
		DateFashion table = new DateFashion();
		
		int you = 2;
		int date = 9;
		
		// act
		int actual = table.getATable(you, date);
		
		// assert
		Assert.assertEquals("You want to crawl in a hole since you missed the Memo on your date activity, hot dog cart for dinner it is", 0, actual);
	}
	
	@Test
	public void getATable_shouldReturn0_no_whenYouLookGreat_aka8OrMore_butYourBumbleMatchIsWearingACutOffGymShirtThatMightBeDirty_aka2OrLess() 
	{
		// arrange
		DateFashion table = new DateFashion();
		
		int you = 8;
		int date = 1;
		
		// act
		int actual = table.getATable(you, date);
		
		// assert
		Assert.assertEquals("You swear to delete this darn app yet again, but agree to slices with this guy since you are already out", 0, actual);
		
	}
	
	@Test
	public void getATable_shouldReturn1_whenBothYouAndYourDateAreMoreThan2ButLessThan8_andYouBothForgotToMakeValentinesDayReservations_WaitingListItIs() 
	{
		// arrange
		DateFashion table = new DateFashion();
		
		int you = 6;
		int date = 7;
		
		// act
		int actual = table.getATable(you, date);
		
		//assert
		Assert.assertEquals("You and your date might get a table, but next time you will confirm the reservations ahead of time", 1, actual);
		
	}
	

}
