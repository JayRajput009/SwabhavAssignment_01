package com.aurionpro.model;

public class TV implements Controllable{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV On");
	}

	@Override
	public void turnOff() {
		System.out.println("TV Off");
		
	}

	@Override
	public void setMode(String mode) {
		System.out.println("TV Mode:: "+mode);
		
	}

}
