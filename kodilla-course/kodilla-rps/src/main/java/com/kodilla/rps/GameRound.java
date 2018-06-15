package com.kodilla.rps;

import java.util.Random;

public class GameRound implements Round {
    private int generatedNumber;
    
    @Override
    public Result play(int playerMove) {
        generateNumber();
        Result r = new Result();
        r.aiMove = generatedNumber;
        r.outcome = duel(playerMove);
        return r;
    }

    private boolean showIfUserWins(int key, int generatedNumber) {
        if ((key == ROCK && (generatedNumber == SCISSORS || generatedNumber == LIZARD)) ||
                (key == PAPER && (generatedNumber == ROCK || generatedNumber == SPOCK)) ||
                (key == SCISSORS && (generatedNumber == PAPER || generatedNumber == LIZARD)) ||
                (key == LIZARD && (generatedNumber == PAPER || generatedNumber == SPOCK)) ||
                (key == SPOCK && (generatedNumber == ROCK || generatedNumber == SCISSORS))) {
            return true;
        }
        return false;
    }

    public int duel(int key) {
        if (showIfUserWins(key, generatedNumber)) {
            return 1;
        } else if (key == generatedNumber) {
            return 0;
        } else {
            return -1;
        }
    }

    private void generateNumber() {
        Random r = new Random();
        generatedNumber = r.nextInt(5) + 1;
    }
}
