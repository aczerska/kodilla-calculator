package com.kodilla.rps;

import com.kodilla.rps.Round.Result;

public class GameController {
    private Reader reader = new Reader();
    private GameView view = new GameView();
    private GameRound round = new GameRound();

    public void run() {
        while (getPlayOrExit()) {
            Game game = new Game();
            game.setUsernameAndRounds(getUserName(), getNumberOfRounds());
            view.printGameInfo(game.getUsername());

            while (game.getRound() < game.getRounds()) {
                int playedNumber = getPlayNumber();
                Result roundResult = round.play(playedNumber);
                view.showWhatWasPlayed(roundResult.aiMove, playedNumber);
                if (roundResult.outcome > 0) {
                    game.countWin();
                    view.showRoundWin();
                } else if (roundResult.outcome < 0) {
                    game.countLoss();
                    view.showRoundLoss();
                } else {
                    view.showRoundTie();
                }
                view.showRoundScore(game.getUserWins(), game.getRound());
                game.nextRound();
            }

            view.showGameScore(game.getUserWins(), game.getRounds());
            int result = getResult(game.getUserWins(), game.getUserLoss());
            if (result < 0) {
                view.showGameLoss();
            } else if (result > 0) {
                view.showGameWin();
            } else {
                view.showGameTie();
            }
        }
        view.exitTheGame();
    }

    public String getUserName() {
        reader.readLine();
        view.printUserNamePropmpt();
        return reader.readLine();
    }

    public int getNumberOfRounds() {
        view.printNumberOfRoundsPrompt();
        return reader.readInt();
    }

    private boolean getPlayOrExit() {
        view.printPlayOrExit();
        String userInput = reader.readKey();

        while (userInput.compareTo("n") != 0 && userInput.compareTo("x") != 0) {
            view.printPlayOrExit();
            userInput = reader.readKey();
        }

        if (userInput.compareTo("n") == 0) {
            view.printStartGame();
            return true;
        } else {
            return false;
        }
    }

    public int getPlayNumber() {
        view.printPickMove();
        int userInput = reader.readInt();

        while (userInput < 1 || userInput > 5) {
            view.printChooseNumber();
            userInput = reader.readInt();
        }
        return userInput;
    }

    private int getResult(int userWins, int userLoss) {
        if (userWins > userLoss) {
            return 1;
        } else if (userWins < userLoss) {
            return -1;
        } else {
            return 0;
        }
    }
}
