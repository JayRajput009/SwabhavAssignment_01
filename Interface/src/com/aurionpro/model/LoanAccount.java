package com.aurionpro.model;

public class LoanAccount implements AccountOperations{
	
	double loanBalance = 10000;

	@Override
	public void deposite(double amount) {
		System.out.println(" loan accounts do not allow deposits");
		
	}

	@Override
	public void withdraw(double amount) {
		loanBalance = loanBalance-amount;
	
		
	}

	@Override
	public void checkbalance() {
		System.out.println("Your loan balance:: "+ loanBalance);
	}

}
