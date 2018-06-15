package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class GameView {
    public void printUserNamePropmpt() {
        System.out.println(Strings.NAME_PROMPT);
    }

    public void printNumberOfRoundsPrompt() {
        System.out.println(Strings.NUMBER_OF_ROUNDS_PROMPT);
    }

    public void printGameInfo(String username) {
        System.out.println(Strings.HELLO + username);
        System.out.println(Strings.KEY_CONFIGURATION);
    }

    public void showGameScore(int userWins, int rounds) {
        System.out.println(Strings.YOU_WON1 + userWins + Strings.YOU_WON2 + rounds + Strings.YOU_WON3);
    }

    public void showGameLoss() {
        System.out.println(Strings.GAME_LOSS);
    }

    public void showGameWin() {
        System.out.println(Strings.GAME_WIN);
    }

    public void showGameTie() {
        System.out.println(Strings.GAME_TIE);
    }

    public void showWhatWasPlayed(int generatedNumber, int playedNumber) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, Strings.ROCK);
        map.put(2, Strings.PAPER);
        map.put(3, Strings.SCISSORS);
        map.put(4, Strings.LIZARD);
        map.put(5, Strings.SPOCK);
        System.out.println(Strings.COMPUTER_PLAYED + generatedNumber + " - " + map.get(generatedNumber));
        System.out.println(Strings.YOU_PLAYED + playedNumber + " - " + map.get(playedNumber));
    }

    public void showRoundScore(int userWins, int round) {
        System.out.println(Strings.ROUND_SCORE1 + round + Strings.ROUND_SCORE2 + userWins);
    }

    public void showRoundLoss() {
        System.out.println(Strings.ROUND_LOSS);
    }

    public void showRoundWin() {
        System.out.println(Strings.ROUND_WIN);
    }

    public void showRoundTie() {
        System.out.println(Strings.ROUND_TIE);
    }

    public void printPlayOrExit() {
        System.out.println(Strings.PLAY_OR_EXIT);
    }

    public void printStartGame() {
        System.out.println(Strings.START_GAME);
    }

    public void printPickMove() {
        System.out.println(Strings.PICK_MOVE);
    }

    public void printChooseNumber() {
        System.out.println(Strings.CHOOSE_NUMBER);
    }

    public void exitTheGame() {
        System.out.println(Strings.EXIT_GAME);
    }
}
