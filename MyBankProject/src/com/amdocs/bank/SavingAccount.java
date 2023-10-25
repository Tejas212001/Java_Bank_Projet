package com.amdocs.bank;

public class SavingAccount extends BankAccount 
{
	private double depositInterest = 0.03;

	public SavingAccount(double currentBalance) 
	{
		super(currentBalance);
		System.out.println("Saving account details: \nId: "+ this.accountId+ "\nBalance: "+ currentBalance);
		
	}
	
	public void depositWithInterest(double amount)
	{
		if(amount > 0)
		{
			// Add 3% interest on every deposit
			super.deposit(amount + amount * depositInterest);
		}
		else
		{
			System.out.println("Invalid deposit amount");
		}
	}

}
