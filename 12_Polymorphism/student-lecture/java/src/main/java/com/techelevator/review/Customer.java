package com.techelevator.review;

public class Customer
{
	
	// can change either name or the variables that are passed in to differentiate 
	
	public String searchByName(String lastName, String firstName) 
	{
		// some logic to search for customer
		return "";
	}
	
	public String search(String lastName, String firstName) 
	{
		if(lastName != null && firstName != null) 
		{
			//search by first AND last name
		}
		else if (lastName != null)
		{
			// search just by lastName
		}
		else if (firstName != null) 
		{
			// search just by first
		}
		else 
		{
			// deal with the error
		}
		return "";
	}
	
	public String search(int customerID) 
	{
		return "";
		
	}
	
	public String search(String phoneNumber) 
	{
		return "";
	}

}
