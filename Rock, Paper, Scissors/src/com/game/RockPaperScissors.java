package com.game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your choice (rock, paper, scissors) or 'q' to quit: ");
            String userChoice = scanner.next().toLowerCase();
            if (userChoice.equals("rock") || userChoice.equals("paper") || 
            	userChoice.equals("scissors") || userChoice.equals("q")) {
                return userChoice;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "draw";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return "user";
        } else {
            return "computer";
        }
    }

    public static void playGame() {
        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        while (true) {
            String userChoice = getUserChoice();
            if (userChoice.equals("q")) {
                break;
            }

            String computerChoice = getComputerChoice();

            System.out.println("User's choice: " + userChoice);
            System.out.println("Computer's choice: " + computerChoice);

            String winner = determineWinner(userChoice, computerChoice);

            if (winner.equals("draw")) {
                System.out.println("It's a draw!");
                draws++;
            } else if (winner.equals("user")) {
                System.out.println("You win!");
                userWins++;
            } else {
                System.out.println("Computer wins!");
                computerWins++;
            }

            System.out.println("Score - User: " + userWins + " Computer: " + computerWins + " Draws: " + draws);
            System.out.println();
        }

        System.out.println("Final score - User: " + userWins + " Computer: " + computerWins + " Draws: " + draws);
    }

    
    public static void main(String[] args) {
        playGame();
    }
	

    
    
    
	
	
	
	
	
}
