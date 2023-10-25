package com.amdocs.bank;

public class BankAccount 
{
	protected int accountId;
	protected double currentBalance;
	
	//Set Id and Initial balance
	public BankAccount(double currentBalance)
	{
		this.accountId = (int) System.currentTimeMillis();
		this.currentBalance = currentBalance;
	}
	
	// Deposit amount into account
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			currentBalance = currentBalance + amount;
			System.out.println(amount + " INR deposited");
		}
		else
		{
			System.out.println("Invalid deposit amount");
			this.checkBalance();
		}
	}
	
	// Withdraw amount from account
	public void withdraw(double amount)
	{
		if(amount > 0 && amount <= currentBalance)
		{
			currentBalance = currentBalance - amount;
			System.out.println(amount + " INR withdrawn");
		}
		else
		{
			System.out.println("Invalid withdrawal amount");
			this.checkBalance();
		}
	}
	
	// Check available balance
	public void checkBalance()
	{
		System.out.println("Remaining balance is " + currentBalance + "\n");
	}
	
	// Transfer amount from one account to another
	public void transfer(BankAccount toBank, double amount)
	{
		if(amount > 0 && amount <= currentBalance)
		{
			this.withdraw(amount);
			toBank.deposit(amount);
			System.out.println("Amount transfer successfully\n");
		}
		else
		{
			System.out.println("Invalid transfer amount");
			this.checkBalance();
		}
	}
}
