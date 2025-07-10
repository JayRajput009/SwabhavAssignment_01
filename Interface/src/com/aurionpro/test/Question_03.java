package com.aurionpro.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.model.OnlineQuiz;
import com.aurionpro.model.PracticalExam;
import com.aurionpro.model.TheoryExam;

public class Question_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter your Choice -> TheoryExam, PracticalExam, OnlineQuiz or type 'exit' to quit:");
            String examType = scanner.nextLine().toLowerCase();

            if (examType.contains("exit")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            if (examType.contains("theoryexam")) {
                int writtenExamMarks = 0;
                int termWorkMarks = 0;

                while (true) {
                    try {
                        System.out.print("Enter written exam marks (Max 60): ");
                        writtenExamMarks = scanner.nextInt();
                        if (writtenExamMarks < 0 || writtenExamMarks > 60) {
                            System.out.println("Marks must be between 0 and 60.");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter numeric marks.");
                        scanner.nextLine();
                    }
                }

                while (true) {
                    try {
                        System.out.print("Enter term work marks (Max 40): ");
                        termWorkMarks = scanner.nextInt();
                        if (termWorkMarks < 0 || termWorkMarks > 40) {
                            System.out.println("Marks must be between 0 and 40.");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter numeric marks.");
                        scanner.nextLine();
                    }
                }

                scanner.nextLine(); // Clear buffer
                TheoryExam theoryExam = new TheoryExam(writtenExamMarks, termWorkMarks);
                System.out.println("\n=== THEORY EXAM RESULT ===");
                theoryExam.evaluateMarks();
                theoryExam.calculateGrade();
            }

            else if (examType.contains("practicalexam")) {
                int practicalMarks = 0;
                int vivaMarks = 0;

                while (true) {
                    try {
                        System.out.print("Enter practical marks (Max 70): ");
                        practicalMarks = scanner.nextInt();
                        if (practicalMarks < 0 || practicalMarks > 70) {
                            System.out.println("Marks must be between 0 and 70.");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter numeric marks.");
                        scanner.nextLine();
                    }
                }

                while (true) {
                    try {
                        System.out.print("Enter viva marks (Max 30): ");
                        vivaMarks = scanner.nextInt();
                        if (vivaMarks < 0 || vivaMarks > 30) {
                            System.out.println("Marks must be between 0 and 30.");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter numeric marks.");
                        scanner.nextLine();
                    }
                }

                scanner.nextLine(); // Clear buffer
                PracticalExam practicalExam = new PracticalExam(practicalMarks, vivaMarks);
                System.out.println("\n=== PRACTICAL EXAM RESULT ===");
                practicalExam.evaluateMarks();
                practicalExam.calculateGrade();
            }

            else if (examType.contains("onlinequiz")) {
                int correctAnswers = 0;
                int totalQuestions = 0;

                while (true) {
                    try {
                        System.out.print("Enter total number of questions: ");
                        totalQuestions = scanner.nextInt();
                        if (totalQuestions <= 0) {
                            System.out.println("Total questions must be greater than 0.");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter numeric value.");
                        scanner.nextLine();
                    }
                }

                while (true) {
                    try {
                        System.out.print("Enter number of correct answers: ");
                        correctAnswers = scanner.nextInt();
                        if (correctAnswers < 0 || correctAnswers > totalQuestions) {
                            System.out.println("Correct answers must be between 0 and " + totalQuestions);
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter numeric value.");
                        scanner.nextLine();
                    }
                }

                scanner.nextLine(); // Clear buffer
                OnlineQuiz onlineQuiz = new OnlineQuiz(correctAnswers, totalQuestions);
                System.out.println("\n=== ONLINE QUIZ RESULT ===");
                onlineQuiz.evaluateMarks();
                onlineQuiz.calculateGrade();
            }

            else {
                System.out.println("Invalid exam type. Please try again.");
            }
        }

        scanner.close();
    }
}
