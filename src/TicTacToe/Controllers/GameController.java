package TicTacToe.Controllers;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
//    Game game;
//
//    public GameController(){
//        this.game = new Game();
//    }
    public Game startGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){

        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public void displayBoard(Game game){

    }

    public void undo(Game game){

    }

    public void makeMove(Game game){

    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
}


// 1. start the Game : create the object of the game :  taking the size , creating the board, getting the players, inputs
// while (gameState is IN_PROGRESS)
//      2. display the board
//      3. make the move

// 4. On the basis of gameState you will show output
//      SUCCESS : getWinner

// 5. undo
