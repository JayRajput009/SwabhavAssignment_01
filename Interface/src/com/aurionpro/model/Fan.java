package com.aurionpro.model;

public class Fan implements Controllable{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Fan On");
	}

	@Override
	public void turnOff() {
		System.out.println("Fan Off");
		
	}

	@Override
	public void setMode(String mode) {
		System.out.println("Fan Mode:: "+mode);
		
	}

}
