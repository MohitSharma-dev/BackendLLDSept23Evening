package TicTacToe.models;

public class HumanPlayer extends Player {
    public HumanPlayer(Long id , String name , Symbol symbol){
        super(id, name, symbol);
        this.setPlayerType(PlayerType.HUMAN);
    }
}
