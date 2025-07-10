package com.aurionpro.model;

public class SavingsAccount implements AccountOperations{
	
	final double fixWithDrawAmount = 10000;
	double currentBalance = 15000;
	

	
	// deposite method
	@Override
	public void deposite(double amount) {
		currentBalance = currentBalance +amount;
		System.out.println("Deposite in your saving account:: "+amount);
	
	}
	
	
	// withdraw method
	@Override
	public void withdraw(double amount) {
		if(amount>=fixWithDrawAmount) {
			System.out.println("Withdrawal exceeds the max limit of ₹"+fixWithDrawAmount);
		}
		else{
			System.out.println("Amount withDraw:: -"+amount);
			currentBalance = currentBalance-amount;
		}

	}

	
	// check balance method
	@Override
	public void checkbalance() {
		
		
		System.out.println("current balance of saving account ::"+ currentBalance);
		
	}
	

}
