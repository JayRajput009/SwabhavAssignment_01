package com.aurionpro.model;

public class Speaker implements Controllable{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Speaker On");
	}

	@Override
	public void turnOff() {
		System.out.println("Speaker Off");
		
	}

	@Override
	public void setMode(String mode) {
		System.out.println("Speaker Mode:: "+mode);
		
	}

}

	


