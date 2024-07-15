package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    HashMap<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();
    @Override
    public boolean checkWinner(Board board , Move move) {
        // O(1)
        // 0 -> {{"X" , 2}, {"O" , 1}}
        int r = move.getCell().getRow();
        Symbol symbol = move.getCell().getSymbol();

        if(!counts.containsKey(r)){
            counts.put(r, new HashMap<>());
        }

        HashMap<Symbol, Integer> countRow = counts.get(r);

        if(!countRow.containsKey(symbol)){
            countRow.put(symbol, 0);
        }
        countRow.put(symbol, countRow.get(symbol) + 1);

        return  countRow.get(symbol) == board.getSize();
    }
}
