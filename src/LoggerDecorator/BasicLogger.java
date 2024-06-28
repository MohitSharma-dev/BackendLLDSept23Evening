package LoggerDecorator;

public class BasicLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.print(message);
    }
}


// INFO Logger
// ERROR Logger
// Timestamp Logger
