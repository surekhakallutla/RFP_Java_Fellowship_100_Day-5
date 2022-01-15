package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class Library2DArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter no. of rows and columns in an Library Array");
		
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y ; j++)
			{
				String libraryarray[][]= new String[i][j];
				
				System.out.println("The Library Array values are "+libraryarray[i][j]);
			}
		}

	}

}
