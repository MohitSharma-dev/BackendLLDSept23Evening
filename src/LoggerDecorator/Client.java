package LoggerDecorator;

public class Client {
    public static void main(String[] args) {
        Logger l = new BasicLogger();
        l = new InfoLogger(l);
        l = new ErrorLogger(l);
        l.log("This is a logged message");


    }
}
