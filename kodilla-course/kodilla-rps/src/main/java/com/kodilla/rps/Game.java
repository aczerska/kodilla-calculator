package com.kodilla.rps;

import java.util.Random;

public class Game {
    private int userWins = 0;
    private int userLoss = 0;
    private int round = 0;
    private String username;
    private int rounds;


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

    public int getUserLoss() {
        return userLoss;
    }

    public void setUsernameAndRounds(String username, int rounds) {
        this.username = username;
        this.rounds = rounds;
    }

    public void countWin() {
        userWins = userWins + 1;
    }

    public void countLoss() {
        userLoss = userLoss + 1;
    }

    public void nextRound() {
        round = round + 1;
    }
}
