package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.RowWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // GameController can only be one and multiple games can be controlled
        // this will be automatically SB
        GameController gameController = new GameController();

        // Eventually the client will not have the direct access to the game object
        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer(1L , "Mohit", new Symbol('O')));
        players.add(new BotPlayer(2L , "Bot 1 " , new Symbol('X') , BotDifficultyLevel.EASY));

        Game game = gameController.startGame(3 , players , List.of(new RowWinningStrategy()));

        gameController.displayBoard(game);
        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }

        if(gameController.checkState(game).equals(GameState.SUCCESS)) {
            System.out.println(gameController.getWinner(game).getName() +  " You win!");
        } else if (gameController.checkState(game).equals(GameState.DRAW)) {
            System.out.println("Nobody Wins");
        }
    }
}

// Tic Tac Toe

// 1. create packages
// 2. Converting your class diagram into Models
