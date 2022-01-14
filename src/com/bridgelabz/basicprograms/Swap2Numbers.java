package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first number ");
		int num1 = scn.nextInt();
		
		System.out.println("Enter Second number ");
		int num2 = scn.nextInt();

		scn.close();
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping the numbers are \nFirst number: " + num1 + "\t Second number: " + num2);
	}

}
