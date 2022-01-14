package com.bridgelabz.basicprograms;

import java.util.Scanner;
import java.util.Random;

public class FlipCoin {
	
		static int headCounter;
		static int tailCounter;

		public static void main(String[] args) {

			System.out.println("How many times you want to flip the coin?");

			Scanner scn = new Scanner(System.in);
			int counter = scn.nextInt();
						
			if (counter > 0)
			{
				FlipCoin fc = new FlipCoin();
				fc.flipCoin(counter);

				double headPercentage = ((double)headCounter / counter) * 100;
				double tailPercentage = ((double)tailCounter / counter) * 100;

				System.out.println("Head count percentage : " + headPercentage + "\nTail count percentage : " + tailPercentage);
			} 
			else 
				System.out.println("Invalid input");
			
			scn.close();
			
		}
			
		public void flipCoin(int cnt) 
		{
			headCounter = 0;
			tailCounter = 0;
			
			for (int i = 0; i <= cnt; i++) 
			{
				Random rad  = new Random();
				
				int result = rad.nextInt(2);
				System.out.println("Random Value "+result);
				
				if (result < 0.5) 
					tailCounter++;
				 else 
					headCounter++;
			}
			
		}
}


