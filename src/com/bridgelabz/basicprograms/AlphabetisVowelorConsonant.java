package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class AlphabetisVowelorConsonant {

	public static void main(String[] args) {
		
		System.out.println("Enter any Alphabet ");
		Scanner scn = new Scanner(System.in);
		char chr = scn.next().charAt(0);
		
		if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' || chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U')
			System.out.println("The given Alphabet " + chr + " is Vowel");
		else
			System.out.println("The given Alphabet " + chr + " is Consonant");
		
		scn.close();
	

	
	}

}
