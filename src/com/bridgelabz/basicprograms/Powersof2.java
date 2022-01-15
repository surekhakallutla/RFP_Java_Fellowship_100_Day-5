package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class Powersof2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the power of 2 lessthan 31 ");
		
		Scanner scn = new Scanner(System.in);
		 int power = scn.nextInt();
		int result = 2;
		
		if(power<31)
		{
			
			 for(int i=1; i<power; i++)
			 {
				 if(power == 0)
				 result = 1;
				 
				 else 
//					 result = 2*result;
					 
					 result=(int) Math.pow(2, power);
				 
			 }
			 
			 System.out.println("The 2 power "+power+"th value is "+result);
		}	
				
		else
			System.out.println("Invalid Input");
		scn.close();

	}

}
