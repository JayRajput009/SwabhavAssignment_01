package com.aurionpro.model;

public class NetBanking implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Processing NetBanking payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
    	 double cashback = amount * 0.15;
	        System.out.println("Refunding ₹" + cashback + " through NetBanking.");
     
    }
}
