package com.aurionpro.test;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.aurionpro.model.*;

public class Question_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter your Vehicle Type -> Bike, Car, Truck or type 'exit' to quit:");
            String vehicleType = scanner.nextLine().toLowerCase();

            if (vehicleType.equals("exit")) {
                System.out.println("Exiting vehicle control system. Goodbye!");
                break;
            }

            VehicleControl vehicle = null;

            if (vehicleType.contains("bike")) {
                vehicle = new Bike();
            } else if (vehicleType.contains("car")) {
                vehicle = new Car();
            } else if (vehicleType.contains("truck")) {
                vehicle = new Truck();
            } else {
                System.out.println("Invalid vehicle type. Please try again.");
                continue;
            }

            // ✅ Automatically start the vehicle upon selection
            vehicle.start();

            while (true) {
                System.out.println("\nChoose Action -> stop, changegear, back");
                String action = scanner.nextLine().toLowerCase();

                if (action.equals("start")) {
                    vehicle.start();
                } else if (action.equals("stop")) {
                    vehicle.stop();
                    break; // Exit the control loop
                } else if (action.equals("changegear")) {
                    int gear = 0;
                    while (true) {
                        try {
                            System.out.print("Enter gear number: ");
                            gear = scanner.nextInt();
                            scanner.nextLine(); // Clear buffer

                            if (gear < 0 || gear > 4) {
                                System.out.println("Gear must be between 0 and 4.");
                                continue;
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a number.");
                            scanner.nextLine(); // Clear buffer again
                        }
                    }
                    vehicle.changeGear(gear);
                } else if (action.equals("back")) {
                    break;
                } else {
                    System.out.println("Invalid action. Try again.");
                }
            }
        }
    }
}
