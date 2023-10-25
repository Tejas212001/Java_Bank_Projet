package com.amdocs.tester;

import com.amdocs.bank.BankAccount;
import com.amdocs.bank.CurrentAccount;
import com.amdocs.bank.SavingAccount;

public class Test {

	public static void main(String[] args) 
	{
	        // Create 2 BankAccount with initial balance 500 and 200
	        BankAccount B1 = new BankAccount(500);
	        BankAccount B2 = new BankAccount(200);
		
		//withdraw 200 from 1st BankAccount
		B1.withdraw(200);
		
		//deposit 1000 in second BankAccount
		B2.deposit(1000);
		
		//transfer 500 from second to first bank account
		B2.transfer(B1, 500);
		
		// Check balance of both accounts
		B1.checkBalance();
		B2.checkBalance();
		
		
		//Create a saving account with initial balance 2000
		SavingAccount S = new SavingAccount(2000);
		
		//deposit 500 in it
		S.depositWithInterest(500);
		
		//check its balance
		S.checkBalance();
	
	
	
		//Create current account with initial balance 2000
		CurrentAccount C = new CurrentAccount(2000);
	
		//deposit 500 in it
		C.deposit(500);
		
	    	//withdraw 100 from it
	    	C.withdrawWithPenalty(100);
	    
	    	//Transfer 500 to first saving account
	   	C.transfer(S, 500);
	    
	    	//Check balance both accounts - CurrentAccount and SavingAccount
	    	C.checkBalance();
	    	S.checkBalance();

	}

}
