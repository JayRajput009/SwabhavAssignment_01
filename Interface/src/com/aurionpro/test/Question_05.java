package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.Controllable;
import com.aurionpro.model.Fan;
import com.aurionpro.model.Light;
import com.aurionpro.model.Speaker;
import com.aurionpro.model.TV;

public class Question_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nEnter your Object -> Tv, fan, light, speaker, exit");
			String objectType = scanner.nextLine().toLowerCase();

			if (objectType.equals("exit")) {
				System.out.println("Thank you, Goodbye!");
				break;
			}

			Controllable controller = null;

			if (objectType.contains("tv")) {
				controller = new TV();
			} else if (objectType.contains("fan")) {
				controller = new Fan();
			} else if (objectType.contains("light")) {
				controller = new Light();
			} else if (objectType.contains("speaker")) {
				controller = new Speaker();
			} else {
				System.out.println("Invalid object type. Please try again.");
				continue;
			}

			// Automatically turn on the device after selection
			controller.turnOn();

			while (true) {
				System.out.println("\nEnter Action ->  off, mode, back");
				String action = scanner.nextLine().toLowerCase();

				if (action.equals("on")) {
					controller.turnOn();
				} else if (action.equals("off")) {
					controller.turnOff();
					break; // go back to main menu
				} else if (action.equals("mode")) {
					while (true) {
						System.out.print("\nEnter Mode: ");
						String mode = scanner.nextLine().toLowerCase();

						// Simple switch for mode options per object
						switch (objectType) {
							case "light":
								if (mode.equals("dim") || mode.equals("low") || mode.equals("high")) {
									controller.setMode(mode);
									break;
								} else {
									System.out.println("Invalid mode. Valid: dim, low, high");
									continue;
								}
							case "fan":
								if (mode.equals("slow") || mode.equals("medium") || mode.equals("fast")) {
									controller.setMode(mode);
									break;
								} else {
									System.out.println("Invalid mode. Valid: slow, medium, fast");
									continue;
								}
							case "tv":
								if (mode.equals("news") || mode.equals("sports") || mode.equals("movies")) {
									controller.setMode(mode);
									break;
								} else {
									System.out.println("Invalid mode. Valid: news, sports, movies");
									continue;
								}
							case "speaker":
								if (mode.equals("bass") || mode.equals("vocal") || mode.equals("party")) {
									controller.setMode(mode);
									break;
								} else {
									System.out.println("Invalid mode. Valid: bass, vocal, party");
									continue;
								}
						}
						break;
					}
				} else if (action.equals("back")) {
					break;
				} else {
					System.out.println("Invalid action. Try again.");
				}
			}
		}
	}
}
