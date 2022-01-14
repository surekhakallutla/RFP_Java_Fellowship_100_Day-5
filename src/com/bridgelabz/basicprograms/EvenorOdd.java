package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter a a number ");
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		if(num % 2 == 0)
			System.out.println("The number " + num + " is even");
		else
			System.out.println("The number " + num + " is odd");
		scn.close();

	}

}
