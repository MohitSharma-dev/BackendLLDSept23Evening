package TicTacToe.models;

public class BotPlayer extends Player {
    private BotDifficultyLevel bot;

    public BotDifficultyLevel getBot() {
        return bot;
    }

    public void setBot(BotDifficultyLevel bot) {
        this.bot = bot;
    }
}
