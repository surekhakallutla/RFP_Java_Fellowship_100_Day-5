package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		int a = scn.nextInt();
		System.out.println("Enter b value: ");
		int b = scn.nextInt();
		System.out.println("Enter c value: ");
		int c = scn.nextInt();
		
		scn.close();
		
		double delta = b*b - 4*a*c;
		
		double root1x = (-b + Math.sqrt(delta) / (2*a));
		
		double root2x = (-b - Math.sqrt(delta) / (2*a));
		
		System.out.println("The roots of the Equation a*x*x + b*x + c  are ");
		System.out.println("Root 1 of x = "+ root1x +"\tRoot 2 of x = "+ root2x);
		
	}

}
