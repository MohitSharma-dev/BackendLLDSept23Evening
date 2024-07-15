package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Symbol;

import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy {
    HashMap<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();
    @Override
    public boolean checkWinner(Board board , Move move) {
        // O(1)
        // 0 -> {"X" , 2}
        // 0 -> {"O" , 0}
        int c = move.getCell().getCol();
        Symbol symbol = move.getCell().getSymbol();

        if(!counts.containsKey(c)){
            counts.put(c, new HashMap<>());
        }

        HashMap<Symbol, Integer> countCol = counts.get(c);

        if(!countCol.containsKey(symbol)){
            countCol.put(symbol, 0);
        }
        countCol.put(symbol, countCol.get(symbol) + 1);

        return  countCol.get(symbol) == board.getSize();
    }
}
