package com.kodilla.rps;

interface Round {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int LIZARD = 4;
    public static final int SPOCK = 5;

    class Result {
        int aiMove;
        int outcome;
    }

    Result play(int playerMove);
}
