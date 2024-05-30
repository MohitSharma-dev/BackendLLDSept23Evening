package ExceptionHandling;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Student {
    public static int doSomething(int x) throws StudentNotFoundException , FileNotFoundException {
        if(x == 0){
            return 0;
        }
        if(x % 2 == 0){
            // this is a check exception
            throw new StudentNotFoundException("Even number Student was not found");
        } else if (x % 5 == 0){
            throw new FileNotFoundException();
        }
        return 1 / x;
    }
}

// Exception : checked : give the declare that I can throw this exception
// handle : try & catch
