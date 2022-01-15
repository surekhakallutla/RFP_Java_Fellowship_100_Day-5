package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class Sumof3Integers0 {

	public static void main(String[] args) {
		
		System.out.println("Enter Array values");
		
		Scanner scn = new Scanner(System.in);
		int [] numarray = new int[10];
		int arraysum=0;
		int i, count=0;	
		
		scn.close();
		
		for(i=0; i<numarray.length ; i++)
		{
			numarray[i]=scn.nextInt();
			
			arraysum = arraysum + numarray[i];
		}
		
		System.out.println("The sum of array values is "+ arraysum);
		
		System.out.println("The sum of Triplets in an array that sum upto 0 are");
		
		for(i=0; i<numarray.length-2; i++) 
		{
		
			for(int j= i+1; j<numarray.length-1; j++)
			{
				for(int k=j+1; k<numarray.length; k++)
				{
					if(numarray[i]+numarray[j]+numarray[k] == 0)
					{
						System.out.println("("+numarray[i]+" " +numarray[j]+" "+numarray[k]+")");
						count++;
					}
					
				}
			}
		
		}
		System.out.println("The total no. of Triplets that sum upto 0 are "+count);
	}

}
