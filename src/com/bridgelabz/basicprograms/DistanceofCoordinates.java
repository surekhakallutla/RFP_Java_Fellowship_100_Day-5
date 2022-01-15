package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class DistanceofCoordinates {

	public static void main(String[] args) {

		System.out.println("Enter (x, y) co-ordinate values");
		
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		double distance = Math.sqrt((Math.pow(x, x)  + Math.pow(y, y)));
		
		System.out.println("The distance of ( "+ x +", "+ y + ") and (0 , 0) co-ordinates is "+distance);
		
		scn.close();
	}

}
