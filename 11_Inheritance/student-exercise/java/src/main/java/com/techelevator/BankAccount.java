package com.techelevator;

public class BankAccount
{
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	
	public BankAccount(String accountHolderName, String accountNumber) 
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(String accountHolderName, String accountNumber, int balance) 
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int deposit(int amountToDeposit) 
	{
		int newBalance = balance = getBalance() + amountToDeposit;
		
		return newBalance;
	}
	
	public int withdraw(int amountToWithdraw) 
	{
		int newBalance = balance = getBalance() - amountToWithdraw;
		return newBalance;
	}
	
	
	public String getAccountHolderName()
	{
		return accountHolderName;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public int getBalance()
	{
		return balance;
	}
	

}
