package LoggerDecorator;

public class InfoLogger implements LoggerDecorator{
    Logger logger;
    InfoLogger(Logger logger){
        this.logger = logger;
    }
    @Override
    public void log(String message) {
        System.out.print("[INFO] ");
        logger.log(message);
    }
}
