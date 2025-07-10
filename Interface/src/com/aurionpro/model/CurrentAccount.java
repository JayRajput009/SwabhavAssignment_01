package com.aurionpro.model;

public class CurrentAccount implements AccountOperations{
	

	double currentBalance = 15000;
	
	// for deposite amount
	@Override
	public void deposite(double amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount deposite to current account:: "+ amount);
	}

	@Override
	public void withdraw(double amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount withdraw to current account:: "+ amount);
		
	}

	@Override
	public void checkbalance() {
		System.out.println("Your current balance is"+ currentBalance);
	}
	
	
	
	
	

}
