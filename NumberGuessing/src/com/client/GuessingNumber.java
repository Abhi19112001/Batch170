package com.client;

import java.util.Scanner;

public class GuessingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do{
		int number = 1 + (int) (100 * Math.random());
		int K = 10;
		int i;
			
		System.out.println("  ");
		System.out.println("Number Guessing Game\n"+"A number is chosen" + " between 1 to 100\n" + "Guess the number" + " within 10 trials\n");

		// Iterate over K Trials
		for (i = 0; i < K; i++) {
			System.out.println(" ");
			System.out.println("Trial No:-" + (i + 1));
			System.out.println("Guess the number:");
			int guess = sc.nextInt();

			if (number == guess) {
				System.out.println("Congratulations! You guessed the correct Number .");
				break;

			} else if (number > guess && i != K - 1) {
				System.out.println("The number is greater than " + guess);
			} else if (number < guess && i != K - 1) {
				System.out.println("The number is less than " + guess);
			}
		}

		if (i == K) {
			System.out.println("You have exhausted trials.");
			System.out.println("The number was " + number);
		}
		System.out.println("Do you want to Play again");
		ch=sc.next().charAt(0);
	}while(ch=='y'||ch=='Y');
	}

}
