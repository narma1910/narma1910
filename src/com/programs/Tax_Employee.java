package com.programs;

import java.util.Scanner;

public class Tax_Employee {

	public static void main(String [] args) {
		System.out.println("****Employee Tax****");
		
		Scanner et = new Scanner(System.in);
		System.out.println("Enter your SALARY:");
		int i = et.nextInt();
		System.out.println("Education Loan EMI:");
		int j = et.nextInt();
		int a = i - j;
		System.out.println("After dedected from salary:"+a);
		
		if(a>=1000000) {
			
			System.out.println("your tax is 30%");
		}else if (a>=500000){
			
			System.out.println("your tax is 20%");
			
		}else 
			System.out.println("your tax is 5%");
			
		
			
	}
	
}
