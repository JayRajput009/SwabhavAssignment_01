package com.aurionpro.model;

public class Car implements VehicleControl {
	
	public void start() {
		System.out.println("Car Started!");
	}
	
	public void stop() {
		System.out.println("Car Stoped!");
	}
	
	public void changeGear(int gear) {
		
		System.out.println("Car's Gear Changed to "+gear);
	}
}
