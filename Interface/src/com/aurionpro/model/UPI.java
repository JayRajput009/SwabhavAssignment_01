package com.aurionpro.model;


	public class UPI implements PaymentGateway {

	    @Override
	    public void pay(double amount) {
	        System.out.println("Processing UPI payment of ₹" + amount);
	    }

	    @Override
	    public void refund(double amount) {
	    	 double cashback = amount * 0.15;
	        System.out.println("Cashback ₹" + cashback + " via UPI.");
	    }
	}



