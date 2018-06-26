//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(10 - 1 + 1)+1;
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 time
		
		if(randomNumber == 1) {
		System.out.println("You are amazing");	
		}
		if(randomNumber == 2) {
			System.out.println("You are perfect");	
		}
		if(randomNumber == 3) {
			System.out.println("You are the best.");
		}
		if(randomNumber == 4) {
			System.out.println("Have a good day!");
		}
		if(randomNumber == 5) {
			System.out.println("You are cool");
		}
		if(randomNumber == 6) {
			System.out.println("You are awesome");	
		}
		if(randomNumber == 7) {
			System.out.println("You should enter the lottery");
		}
		if(randomNumber == 8) {
			System.out.println("You are beautiful");
		}
		if(randomNumber == 9) {
			System.out.println("You are perfect");
		}
		if(randomNumber == 10) {
			System.out.println("You are the best");
		}


		// 3. Use each value of randomNumber to give the user a random compliment.

		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
