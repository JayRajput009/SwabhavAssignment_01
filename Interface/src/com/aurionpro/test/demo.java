package com.aurionpro.test;

import java.util.Scanner;

public class demo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Enter your -> subject name 1.english 2.math");
			
			int subjectName = scanner.nextInt();
			if(subjectName>18) {
				
				throw new Exception("Enter Vsalid name");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Enter valid input");
		}
		
	}

}
