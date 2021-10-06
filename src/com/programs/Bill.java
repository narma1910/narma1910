package com.programs;

import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		System.out.println("***Electrical bill***");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("---Enter your current unit---");
		long ut = input.nextLong();
		if(ut>=1000) {
			System.out.println("your electrical charge:10/-");
		}else if(ut>=500) {
			System.out.println("your electrical charge:5/-");
		}else if(ut>=200){
			System.out.println("your electrical charge:2/-");
		}else {
			System.out.println("your electrical charge:1/-");
		}
		System.out.println(" ");
		System.out.println("***THANK YOU***");
	}

}
