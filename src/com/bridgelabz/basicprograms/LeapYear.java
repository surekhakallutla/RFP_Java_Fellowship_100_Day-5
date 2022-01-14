package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter a four digit Year");
		Scanner scn = new Scanner(System.in);
		
		int year = scn.nextInt();
		
		if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
			System.out.println(year+ " is a Leap Year");
		
		else 
			System.out.println(year+ " is not a Leap Year");
		
		scn.close();
		

	}

}
