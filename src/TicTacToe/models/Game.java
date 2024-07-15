package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
//    private Long id;
    private Board board;
    private List<Player> players;
    private Player winner;
    private int nextPlayerIndex;
    private List<Move> moves;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    private Game(Builder builder){
        board = new Board(builder.dimension);
        this.players = builder.players;
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.winningStrategies = builder.winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void display(){
        board.displayBoard();
    }

    public boolean validateMove(Move move){
        int r = move.getCell().getRow();
        int c = move.getCell().getCol();

        if(r < 0 || r > board.getSize() - 1 || c < 0 || c > board.getSize() - 1){
            return false;
        }

        // we also need to check if Cell is not already filled
        return board.getGrid().get(r).get(c).getCellState().equals(CellState.EMPTY);
    }

    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerIndex);

        System.out.println("It's " + currentPlayer.getName() + "'s turn! Please make your move");

        Move move = currentPlayer.makeMove(board);

        if (!validateMove(move)) {
            System.out.println("Invalid Move! Please try again");
            return;
        }

        int r = move.getCell().getRow();
        int c = move.getCell().getCol();

        Cell cellToChange = board.getGrid().get(r).get(c);
        cellToChange.setSymbol(currentPlayer.getSymbol());
        cellToChange.setCellState(CellState.FILLED);

        move.setCell(cellToChange);
        moves.add(move);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

        // we need to check if someone has won the game or not
        if(checkWinner(move)){
            setWinner(currentPlayer);
            setGameState(GameState.SUCCESS);
        } else if (moves.size() ==  board.getSize() * board.getSize()){
            setWinner(null);
            setGameState(GameState.DRAW);
        }
    }

    public boolean checkWinner(Move move){
        // we should go through winning strategies available and check if any of
        // those produces a winner
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(this.board , move)){
                return true;
            }
        }
        return false;
    }

    public void undo(){
        // whatever we did while making the move
        // we just need to do reverse of that

        if(moves.isEmpty()){
            System.out.println("Nothing to Undo! Please make a move first");
            return;
        }

        Move lastMove = moves.get(moves.size()-1);
        moves.remove(moves.size()-1);

        lastMove.getCell().setCellState(CellState.EMPTY);
        lastMove.getCell().setSymbol(null);

        nextPlayerIndex--;
        // (a - b ) % n  = (a - b + n ) % n
        nextPlayerIndex = (nextPlayerIndex + players.size()) % players.size();


        // decrease the frequencies in the hashmap
        for (WinningStrategy winningStrategy : winningStrategies) {
            winningStrategy.handleUndo(board , lastMove);
        }

    }

    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public void validate(){
            // validations
            // 1. count of players = dimension - 1
            if(players.size() != dimension - 1){
                throw new RuntimeException("Incorrect number of players");
            }
            // 2. Bot count <= 1
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT))
                    botCount+=1;
            }
            if(botCount > 1){
                throw new RuntimeException("Too many Bot players");
            }
            // 3. Every player has different symbol : HW
            // clean the validate code in multiple validate functions : HW


        }

        public Game build(){
            validate();
           return new Game(this);
        }
    }
}
