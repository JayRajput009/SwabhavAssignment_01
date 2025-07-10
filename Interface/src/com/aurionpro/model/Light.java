package com.aurionpro.model;

public class Light implements Controllable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Light On");
	}

	@Override
	public void turnOff() {
		System.out.println("Light Off");
		
	}

	@Override
	public void setMode(String mode) {
		System.out.println("Light Mode:: "+mode);
		
	}
	
	
	

}
