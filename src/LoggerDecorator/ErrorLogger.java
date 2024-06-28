package LoggerDecorator;

public class ErrorLogger implements LoggerDecorator{
    Logger logger;
    public ErrorLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        System.out.print("[ERROR] ");
        logger.log(message);
    }
}

