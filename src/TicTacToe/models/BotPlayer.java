package TicTacToe.models;

import TicTacToe.strategies.BotPlayingStrategy;
import TicTacToe.strategies.BotPlayingStrategyFactory;

public class BotPlayer extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(Long id, String name , Symbol symbol , BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
        this.setPlayerType(PlayerType.BOT);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
    public Move makeMove(Board board){
        Move move =  botPlayingStrategy.makeMove(board);
        move.setPlayer(this);
        return move;
    }
}
