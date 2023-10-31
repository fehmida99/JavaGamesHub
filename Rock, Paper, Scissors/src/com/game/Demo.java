package com.game;

import java.util.Random;
import java.util.Scanner;

public class Demo {
	  public static void main(String[] args) {

	        // Display a welcome message.
	        System.out.println("**************************************");
	        System.out.println("Welcome to Rock, Paper, Scissors Game!");
	        System.out.println("**************************************");

	        // Get user input.
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your choice (Rock, Paper, Scissors): ");
	        String userChoice = sc.next();

	        // Generate computer's choice.
	        String[] choices = {"Rock", "Paper", "Scissors"};
	        String computerChoice = choices[new Random().nextInt(choices.length)];

	        // Convert choices to lowercase for case-insensitive comparison.
	        userChoice = userChoice.toLowerCase();
	        computerChoice = computerChoice.toLowerCase();

	        // Compare choices and determine the winner.
	        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
	            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
	            (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
	            System.out.println("You win!!!");
	        } else if ((userChoice.equals("scissors") && computerChoice.equals("rock")) ||
	                   (userChoice.equals("rock") && computerChoice.equals("paper")) ||
	                   (userChoice.equals("paper") && computerChoice.equals("scissors"))) {
	            System.out.println("Computer wins!!!");
	        } else {
	            System.out.println("It's a Tie");
	        }
	    }
}
