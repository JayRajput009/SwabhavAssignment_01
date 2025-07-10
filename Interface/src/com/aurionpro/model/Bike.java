package com.aurionpro.model;

public class Bike implements VehicleControl{
	
	public void start() {
		System.out.println("Bike Started!");
	}
	
	public void stop() {
		System.out.println("Bike Stoped!");
	}
	
	public void changeGear(int gear) {
		
		System.out.println("Bike's Gear Changed to "+gear);
	}

}
