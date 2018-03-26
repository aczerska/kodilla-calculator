package com.kodilla.rps;

public class GameController {
    public static void main(String[] args) {
        GameView view = new GameView();

        while (view.getPlayOrExit()) {
            Game game = new Game();
            game.setUsernameAndRounds(view.getUserName(), view.getNumberOfRounds());
            view.printGameInfo(game.getUsername());

            while (game.getRound() < game.getRounds()) {
                int playedNumber = view.getPlayNumber();
                int roundResult = game.duel(playedNumber);
                view.showWhatWasPlayed(game.getGeneratedNumber(), playedNumber);
                if (roundResult > 0) {
                    view.showRoundWin();
                } else if (roundResult < 0) {
                    view.showRoundLoss();
                } else {
                    view.showRoundTie();
                }
                view.showRoundScore(game.getUserWins(), game.getRound());
            }

            view.showGameScore(game.getUserWins(), game.getRounds());
            int result = game.getResult();
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
}
