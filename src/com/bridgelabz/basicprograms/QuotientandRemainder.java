package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class QuotientandRemainder {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Dividend Value");
		int dividend = scn.nextInt();
		System.out.println("Enter Divider Value");
		int divisor = scn.nextInt();
		
		int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        
        System.out.println("The Quotient is "+ quotient);
        System.out.println("The Remainder is "+ remainder);
		
        scn.close();
	
	}

}
