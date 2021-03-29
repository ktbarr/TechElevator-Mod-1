package com.techelevator;


import java.util.List;

public class BankCustomer implements Accountable
{
	//attributes
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts;
	
	
	public boolean isVip()
	{
		if(getBalance() >= 25000) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/// very confused on how to complete this? -- would love to walk through this with someone on Friday?
	
//	public void addAccount(Accountable newAccount) 
//	{
//		List<Accountable> accountList = new ArrayList<Accountable>();
		
//		accountList.add(new CheckingAccount(address, address, 0));
	
	
		
//	}
	
	
	
	//getters && setters
	public Accountable[] getAccounts() 
	{
		return accounts.toArray(new Accountable[accounts.size()]);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int getBalance()
	{
		
		return 0;
	}

}
