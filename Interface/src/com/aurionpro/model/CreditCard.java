package com.aurionpro.model;

public class CreditCard implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
    	 double cashback = amount * 0.15;
	     System.out.println("Refunding ₹" + cashback + " to credit card");
       
        
    }
}

