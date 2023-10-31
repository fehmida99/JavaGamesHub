package com.game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	/*Algorithm:

		Display a welcome message.
		Ask the user to choose Rock, Paper, or Scissors.
		Generate a random choice for the computer.
		Compare the user's choice with the computer's choice to determine the   winner.
		Display the result.*/
	public static void main(String[] args) {
		
		//Display a welcome message.
		System.out.println("**************************************");
		System.out.println("Welcome to Rock, Paper, Scissors Game!");
		System.out.println("**************************************");
		
		
		//Get user input.
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your choice (Rock, Paper, scissors) : ");
		String userChoice = sc.next();
		
		
		//Generate computer's choice.
		String[] choices = {"Rock", "Paper", "scissors"};
		//new Random(): This part creates a new instance of the Random class. The      Random class is part of the Java standard library and is used for generating random numbers.
		String computerChoice = choices [new Random().nextInt(choices.length)];
		
		//Compare choices and determine the winner.
		if(userChoice.equals(computerChoice)) {
			System.out.println("It's a Tie");
		} else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
		           (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
		           (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
		         System.out.println("You win!!!");
		} else {
			System.out.println("Computer wins!!!");
		}
			
		
		
		
		
	}
	
	

	
	
	
	
	
}
