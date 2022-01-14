package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		
		System.out.println("Enther the Number ");
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		for(int i = 2; i*i< num; i++)
		{
			while(num%i == 0)
			{
				System.out.println(i+" ");
				num= num /i;
				
			}
		}
		
		if(num>2)
			System.out.println(num);

		scn.close();
	}

}
