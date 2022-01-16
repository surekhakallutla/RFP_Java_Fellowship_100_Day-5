package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class Library2DArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter no. of rows in an Library Array");
		int m = scn.nextInt();
		System.out.println("Enter no. of rows in an Library Array");
		int n = scn.nextInt();
		
		int intlibraryarray[][] = new int[m][n];
		double doublelibraryarray[][] = new double[m][n];
		boolean booleanlibraryarray[][] = new boolean[m][n];
	
		System.out.println("Enter Integer Array values");
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n ; j++)
			{
				intlibraryarray[i][j]=scn.nextInt();
			}
		}
		
		System.out.print("The Integer Library Array values are \n {");
		for(int i = 0; i < m; i++)
		{
			System.out.print("{");
			for(int j = 0; j < n ; j++)
			{
				System.out.print(intlibraryarray[i][j]);
				if(j<n-1)
					System.out.print(", ");
			}
			System.out.print("} ");
		}
		System.out.print("}\n");
		
		
		System.out.println("Enter Double Array values");
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n ; j++)
			{
				doublelibraryarray[i][j]=scn.nextDouble();
			}
		}
		
		System.out.print("The Integer Library Array values are \n {");
		for(int i = 0; i < m; i++)
		{
			System.out.print("{");
			for(int j = 0; j < n ; j++)
			{
				System.out.print(doublelibraryarray[i][j]);
				if(j<n-1)
					System.out.print(", ");
			}
			System.out.print("} ");
		}
		System.out.print("}\n");
		
		System.out.println("Enter Boolean Array values");
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n ; j++)
			{
				booleanlibraryarray[i][j]=scn.nextBoolean();
			}
		}
		
		System.out.print("The Integer Library Array values are \n {");
		for(int i = 0; i < m; i++)
		{
			System.out.print("{");
			for(int j = 0; j < n ; j++)
			{
				System.out.print(booleanlibraryarray[i][j]);
				if(j<n-1)
					System.out.print(", ");
			}
			System.out.print("} ");
		}
		System.out.print("}");
		
		scn.close();
	}

}
