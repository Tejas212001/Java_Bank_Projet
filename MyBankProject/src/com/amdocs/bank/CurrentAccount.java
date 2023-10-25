package com.amdocs.bank;

public class CurrentAccount extends BankAccount 
{

	private double withdrawalCharge = 200;
	
	// Set initial balance
	public CurrentAccount(double currentBalance) {
		super(currentBalance);
		System.out.println("Current account details: \nId: "+ this.accountId+ "\nBalance: "+ currentBalance);
	}
	
	public void withdrawWithPenalty(double amount)
	{
		if(amount > 0 && amount <= currentBalance)
		{
			// 200 charge for every withdrawal
			super.withdraw(amount + withdrawalCharge);
		}
		else
		{
			System.out.println("Invalid withdrawal amount");
		}
	}
	
}
