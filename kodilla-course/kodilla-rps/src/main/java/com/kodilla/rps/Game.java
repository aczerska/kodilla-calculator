package com.kodilla.rps;

import java.util.Random;

public class Game {
    private int userWins = 0;
    private int round = 0;
    private int generatedNumber;
    private String username;
    private int rounds;


    public int getGeneratedNumber() {
        return generatedNumber;
    }

    public String getUsername() {
        return username;
    }

    public int getRounds() {
        return rounds;
    }

    public int getRound() {
        return round;
    }

    public int getUserWins() {
        return userWins;
    }

    public void setUsernameAndRounds(String username, int rounds) {
        this.username = username;
        this.rounds = rounds;
    }


    public boolean showIfUserWins(int key, int generatedNumber) {
        if ((key == 1 && (generatedNumber == 3 || generatedNumber == 4)) ||
                (key == 2 && (generatedNumber == 1 || generatedNumber == 5)) ||
                (key == 3 && (generatedNumber == 2 || generatedNumber == 4)) ||
                (key == 4 && (generatedNumber == 2 || generatedNumber == 5)) ||
                (key == 5 && (generatedNumber == 1 || generatedNumber == 3))) {
            return true;
        }
        return false;
    }

    public int duel(int key) {
        generateNumber();
        round = round +1;
        if (showIfUserWins(key, generatedNumber)) {
            userWins = userWins + 1;
            return 1;
        } else if (key == generatedNumber) {
            userWins = userWins;
            return 0;
        } else {
            userWins = userWins;
            return -1;
        }
    }

    public int getResult() {
        if (userWins > rounds / 2) {
            return 1;
        } else if ((userWins < rounds / 2)) {
            return -1;
        } else {
            return 0;
        }
    }

    public void generateNumber() {
        Random r = new Random();
        generatedNumber = r.nextInt(5) + 1;
    }


}
