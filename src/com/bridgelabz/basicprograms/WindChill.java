package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit ");
		double t = scn.nextDouble();
		
		System.out.println("Enter wind Speed in miles per hour ");
		double v = scn.nextDouble();
		
		scn.close();
		
		double w = 0;
		
		if(t <= ~50 || (v > 120 || v < 3))
			System.out.println("Invalid Input");
			
			else
			{
				w = 35.74 + (0.6215 * t) +(((0.4275 * t )- 35.75) * Math.pow( v, 0.16));
				System.out.println("The Wind Chill is "+w);
			}

	}

}
