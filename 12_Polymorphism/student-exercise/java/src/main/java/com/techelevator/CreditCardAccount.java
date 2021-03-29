package com.techelevator;



public class CreditCardAccount implements Accountable
{
	//attributes
	private String accountHolder;
	private String accountNumber;
	private int debt;
	
	//constructors
	public CreditCardAccount(String accountHolder, String accountNUmber) 
	{
		this.accountHolder = accountHolder;
		this.accountNumber = accountNUmber;
		
	}
	
	public CreditCardAccount(String accountHolder, String accountNUmber, int debt) 
	{
		this.accountHolder = accountHolder;
		this.accountNumber = accountNUmber;
		this.debt = -Math.abs(debt);
	}
	
	//methods
	public int pay(int amountToPay) 
	{
		debt = debt - amountToPay;
		return -Math.abs(debt);
		
	}
	
	public int charge(int amountToCharge) 
	{
		debt = debt + amountToCharge;
		return -Math.abs(debt);
		
	}
	
	
	//getters
	public String getAccountHolder()
	{
		return accountHolder;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public int getDebt() 
	{
		return debt;
	}

	@Override
	public int getBalance()
	{
		
		return 0;
	}
	
	
	
	 

}
