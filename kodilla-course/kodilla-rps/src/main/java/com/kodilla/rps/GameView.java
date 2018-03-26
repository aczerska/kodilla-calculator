package com.kodilla.rps;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class GameView {
    private Scanner in = new Scanner(System.in);

    public int scanForInt() {
        while (true) {
            try {
                return in.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Enter only numbers!");
                in.next();
            }
        }
    }

    public String getUserName() {
        in.nextLine();
        System.out.println("Enter your name:");
        return in.nextLine();
    }

    public int getNumberOfRounds() {
        System.out.println("Enter number of rounds you want to play in one game:");
        return scanForInt();
    }

    public void printGameInfo(String username) {
        System.out.println("Hello! " + username);
        System.out.println("\nKey configuration for the game:" + "\nkey 1 - plays ROCK" + "\nkey 2 - plays PAPER" +
                "\nkey 3 - plays SCISSORS" + "\nkey 4 - plays LIZARD" + "\nkey 5 - plays SPOCK" + "\nkey x - END game" +
                "\nkey n - NEW game");
    }

    public void showGameScore(int userWins, int rounds) {
        System.out.println("You won " + userWins + " times in " + rounds + " rounds.");
    }

    public void showGameLoss() {
        System.out.println("Sorry! You lost this game");
    }

    public void showGameWin() {
        System.out.println("You won the game!");
    }

    public void showGameTie() {
        System.out.println("It's a tie this time :)");
    }

    public void showWhatWasPlayed(int generatedNumber, int playedNumber) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ROCK");
        map.put(2, "PAPER");
        map.put(3, "SCISSORS");
        map.put(4, "LIZARD");
        map.put(5, "SPOCK");
        System.out.println("Computer played " + generatedNumber + " - " + map.get(generatedNumber));
        System.out.println("You played " + playedNumber + " - " + map.get(playedNumber));
    }

    public void showRoundScore(int userWins, int round) {
        System.out.println("Round #" + round + " Your wins: " + userWins);
    }

    public void showRoundLoss() {
        System.out.println("You lost :C");
    }

    public void showRoundWin() {
        System.out.println("You won!");
    }

    public void showRoundTie() {
        System.out.println("It's a tie!");
    }

    public boolean getPlayOrExit() {
        System.out.println("\nPress n key to start new game or x to leave");
        String userInput = in.next();

        while (userInput.compareTo("n") != 0 && userInput.compareTo("x") != 0) {
            System.out.println("Please press n to begin new game or x to exit");
            userInput = in.next();
        }

        if (userInput.compareTo("n") == 0) {
            System.out.println("\nLet's start the game!");
            return true;
        } else {
            return false;
        }
    }

    public int getPlayNumber() {
        System.out.println("\nYour move! Pick your number :)");
        int userInput = scanForInt();

        while (userInput < 1 || userInput > 5) {
            System.out.println("Please choose number from 1 to 5");
            userInput = scanForInt();
        }
        return userInput;
    }

    public void exitTheGame() {
        System.out.println("Bye Bye!");
    }
}
