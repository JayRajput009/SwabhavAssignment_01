package com.aurionpro.model;

public class Truck implements VehicleControl{
	
	public void start() {
		System.out.println("Truck Started!");
	}
	
	public void stop() {
		System.out.println("Truck Stoped!");
	}
	
	public void changeGear(int gear) {
		
		System.out.println("Truck's Gear Changed to "+gear);
	}
}
