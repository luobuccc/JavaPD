package Chapter5;

/**
 * Created by PuFan on 2016/11/11.
 */
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(String message) {
        super(message);
    }


}


