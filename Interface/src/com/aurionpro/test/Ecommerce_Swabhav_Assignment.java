package com.aurionpro.test;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.aurionpro.model.CreditCard;
import com.aurionpro.model.NetBanking;
import com.aurionpro.model.PaymentGateway;
import com.aurionpro.model.UPI;

public class Ecommerce_Swabhav_Assignment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nEnter your payment type -> UPI, netbanking, creditcard, exit");
			String paymentType = scanner.nextLine().toLowerCase();

			if (paymentType.equals("exit")) {
				System.out.println("Thank you!");
				break;
			}
			PaymentGateway payment = null;

			if (paymentType.contains("upi")) {
				payment = new UPI();
			} else if (paymentType.contains("netbanking")) {
				payment = new NetBanking();
			} else if (paymentType.contains("creditcard")) {
				payment = new CreditCard();
			} else {
				System.out.println("Invalid payment type. please try again");
				continue;
			}
			
			while(true) {
				System.out.println("\nChoose action -> pay, back to menu");
				String paymentAction = scanner.nextLine().toLowerCase();
				
				
				//pay
				int payAmount = 0;
				if(paymentAction.equals("pay")) {
					while(true) {
						try {
							System.out.print("Enter Pay amount: ");
							payAmount = scanner.nextInt();
							scanner.nextLine(); 
							if (payAmount < 0) {
								System.out.println("amount must be greter than 0");
								continue;
							}
							break;
						} catch (InputMismatchException e) {
							System.out.println("Invalid input! Please enter a number.");
							scanner.nextLine();
						}
					}
					
					payment.pay(payAmount);

					payment.refund(payAmount);
					
					
				}
//				else if(paymentAction.equals("refund")){
//					
//					payment.refund(payAmount);
//					System.out.println(payAmount);
//					
//				}
				else if (paymentAction.equals("back")) {
                    break;
                } else {
                    System.out.println("Invalid action. Try again.");
                }
			}


		}

	}
}
