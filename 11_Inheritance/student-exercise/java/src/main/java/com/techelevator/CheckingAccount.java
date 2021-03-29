package com.techelevator;

public class CheckingAccount extends BankAccount
{


	
	public CheckingAccount(String accountHolderName, String accountNumber)
	{
		super(accountHolderName, accountNumber);
		
	}
	
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) 
	{
		super(accountHolderName, accountNumber, balance);
		
	}
	
	
	@Override
	 public int withdraw(int amountToWithdraw) {
        // Only allow the withdraw if the balance isn't going to go below -$100
        if (getBalance() - amountToWithdraw > -100) {
            // Withdraw the $$
            super.withdraw(amountToWithdraw);
            // If the balance dips below 0, assess $10 charge
            if (getBalance() < 0) {
                super.withdraw(10);
            }
        }
        return getBalance();
		
		
		
		
		
		
//		if(getBalance() < 0 && getBalance() > -100) 
//		{
//			int newBalance = getBalance() - (amountToWithdraw + 10);
			
//			return newBalance;
//		}
//		return amountToWithdraw;
		
	}
	

}
