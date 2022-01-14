package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args)
	{ 

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		int num = scn.nextInt();
        double result = 0.0;
 
        System.out.println("The harmonic series is: ");
 
         for (int i = num; i > 0; i--) 
         {
             
            result = result + (double)1 / i;
 
            System.out.print(result + ", ");
         
         }
       
         scn.close();
         
    }
		
}	



