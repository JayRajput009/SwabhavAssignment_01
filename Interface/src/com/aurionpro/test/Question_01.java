package com.aurionpro.test;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.aurionpro.model.SavingsAccount;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.LoanAccount;

public class Question_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SavingsAccount savingaccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        LoanAccount loanAccount = new LoanAccount();

        boolean mainLoop = true;

        while (mainLoop) {
            System.out.println("\nChoose Account Type -> Saving, Current, Loan, Exit");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {

                // === SAVINGS ACCOUNT BLOCK ===
                case "saving":
                    boolean savingLoop = true;
                    while (savingLoop) {
                        System.out.println("\nChoose -> Deposit, Withdraw, CheckBalance, Back");
                        String methodType = scanner.nextLine().toLowerCase().trim();

                        switch (methodType) {
                            case "deposit":
                                while (true) {
                                    System.out.println("Enter amount to deposit or type 'back' to return:");
                                    String input = scanner.nextLine().toLowerCase();
                                    if (input.equals("back")) break;
                                    try {
                                        double amount = Double.parseDouble(input);
                                        if (amount > 0) {
                                            savingaccount.deposite(amount);
                                            System.out.println("Deposit successful.");
                                            break;
                                        } else {
                                            System.out.println("Enter valid positive amount.");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid amount.");
                                    }
                                }
                                break;

                            case "withdraw":
                                while (true) {
                                    System.out.println("Enter amount to withdraw or type 'back' to return:");
                                    String input = scanner.nextLine().toLowerCase();
                                    if (input.equals("back")) break;
                                    try {
                                        double amount = Double.parseDouble(input);
                                        if (amount <= 0) {
                                            System.out.println("Enter valid amount.");
                                        } else if (amount > 10000) {
                                            System.out.println("Withdrawal limit exceeded! Maximum allowed is ₹10,000.");
                                        } else {
                                            savingaccount.withdraw(amount);
                                            System.out.println("Withdrawal successful.");
                                            break;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid amount.");
                                    }
                                }
                                break;

                            case "checkbalance":
                                savingaccount.checkbalance();
                                break;

                            case "back":
                                savingLoop = false;
                                break;

                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;

                // === CURRENT ACCOUNT BLOCK ===
                case "current":
                    boolean currentLoop = true;
                    while (currentLoop) {
                        System.out.println("\nChoose -> Deposit, Withdraw, CheckBalance, Back");
                        String methodType = scanner.nextLine().toLowerCase().trim();

                        switch (methodType) {
                            case "deposit":
                                while (true) {
                                    System.out.println("Enter amount to deposit or type 'back' to return:");
                                    String input = scanner.nextLine().toLowerCase();
                                    if (input.equals("back")) break;
                                    try {
                                        double amount = Double.parseDouble(input);
                                        if (amount > 0) {
                                            currentAccount.deposite(amount);
                                            System.out.println("Deposit successful.");
                                            break;
                                        } else {
                                            System.out.println("Enter valid positive amount.");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid amount.");
                                    }
                                }
                                break;

                            case "withdraw":
                                while (true) {
                                    System.out.println("Enter amount to withdraw or type 'back' to return:");
                                    String input = scanner.nextLine().toLowerCase();
                                    if (input.equals("back")) break;
                                    try {
                                        double amount = Double.parseDouble(input);
                                        if (amount <= 0) {
                                            System.out.println("Enter valid amount.");
                                        } else {
                                            currentAccount.withdraw(amount);
                                            System.out.println("Withdrawal successful.");
                                            break;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid amount.");
                                    }
                                }
                                break;

                            case "checkbalance":
                                currentAccount.checkbalance();
                                break;

                            case "back":
                                currentLoop = false;
                                break;

                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;

                // === LOAN ACCOUNT BLOCK ===
                case "loan":
                    boolean loanLoop = true;
                    while (loanLoop) {
                        System.out.println("\nChoose -> Repay, CheckBalance, Back");
                        String methodType = scanner.nextLine().toLowerCase().trim();

                        switch (methodType) {
                            case "repay":
                                while (true) {
                                    System.out.println("Enter amount to repay or type 'back' to return:");
                                    String input = scanner.nextLine().toLowerCase();
                                    if (input.equals("back")) break;
                                    try {
                                        double amount = Double.parseDouble(input);
                                        if (amount <= 0) {
                                            System.out.println("Enter valid amount.");
                                        } else {
                                            loanAccount.withdraw(amount);
                                            System.out.println("Repayment successful.");
                                            break;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid amount.");
                                    }
                                }
                                break;

                            case "checkbalance":
                                loanAccount.checkbalance();
                                break;

                            case "back":
                                loanLoop = false;
                                break;

                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;

                case "exit":
                    mainLoop = false;
                    System.out.println("Thank you for using the banking system!");
                    break;

                default:
                    System.out.println("Invalid account type. Please choose Saving, Current, Loan or Exit.");
            }
        }

        scanner.close();
    }
}
