package com.programs;

import java.util.Scanner;

public class Loan {
	
	public static void main(String[] args) {
		
		System.out.println("Loan Elegibility");
		Scanner ln = new Scanner(System.in);
		System.out.println("Are You Married:-");
		String s1 = ln.nextLine();
		System.out.println("are you have a permenent job or temporary job :-");
		String s2 = ln.nextLine();
		System.out.println("your service in years:-");
		int s3 = ln.nextInt();
		
		if(s1.equalsIgnoreCase("unmarried")&&s2.equalsIgnoreCase("permenent job")&& s3>=30 ) {
			
			System.out.println("your loan amount is=Rs.50,000");
			
		}else if(s1.equalsIgnoreCase("married")&&s2.equalsIgnoreCase("permenent job")&& s3>=30) {
			
			System.out.println("your loan amount is=Rs.60,000");
			
		}else if (s1.equalsIgnoreCase("married")&&s2.equalsIgnoreCase("permenent job")&& s3<30) {
			
			System.out.println("your loan amount is=Rs.25,000");
			
		}else if(s1.equalsIgnoreCase("married")&&s2.equalsIgnoreCase("permenent job")&& s3<30) {
			
			System.out.println("your loan amount is=Rs.35,000");
			
		}else if(s1.equalsIgnoreCase("unmarried")&&s2.equalsIgnoreCase(" temporary job")&& s3>=30) {
			
			System.out.println("your loan amount is=Rs.10,000");
			
		}else if(s1.equalsIgnoreCase("married")&&s2.equalsIgnoreCase(" temporary job")&& s3<30) {
			
			System.out.println("your loan amount is=Rs.10,000");
		
		}else if(s1.equalsIgnoreCase("married")&&s2.equalsIgnoreCase(" temporary job")&& s3>=30) {
			
			System.out.println("your loan amount is=Rs.10,000");
			
		}else if(s1.equalsIgnoreCase("married")&&s2.equalsIgnoreCase(" permenent job")&& s3<30) {
			
			System.out.println("your loan amount is=Rs.10,000");
		
		}
	}	
}