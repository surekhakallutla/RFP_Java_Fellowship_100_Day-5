package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class Largestof3Numbers {

	public static void main(String[] args) {
		
		System.out.println("Enter three Numbers");
		
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		System.out.println((a>b && a>c)? "a is largest number":(b>a && b>c)?"b is largest number":"c is largest number");

		scn.close();
	}

}