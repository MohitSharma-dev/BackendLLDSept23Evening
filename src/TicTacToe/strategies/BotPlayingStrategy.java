package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}
// Easy : first empty cell
// Medium : Try to avoid the loss
// Hard : figure out certain game-plays to win the game