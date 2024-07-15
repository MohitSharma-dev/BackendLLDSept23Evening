package TicTacToe.models;

import ExceptionHandling.C;

import java.util.Scanner;

public abstract class Player {
    private Long id;
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    private Scanner sc = new Scanner(System.in);

    public Player(Long id, String name, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Move makeMove(Board board){
        System.out.println("Please enter the row in which you want to move");
        int r = sc.nextInt();
        System.out.println("Please enter the col in which you want to move");
        int c = sc.nextInt();

        return new Move(new Cell(r ,c) , this);
    }
}
