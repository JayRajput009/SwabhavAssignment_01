package com.aurionpro.model;

public interface PaymentGateway {
	
	public void pay(double amount);
	public void refund(double amount);
	

}
