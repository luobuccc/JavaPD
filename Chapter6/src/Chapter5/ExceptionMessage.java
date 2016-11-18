package Chapter5;

/**
 * Created by PuFan on 2016/11/11.
 */
public class ExceptionMessage {
    static public void main(String[] args) {
        /*
        try{
            int i=12/0;
        }
        catch(RuntimeException e){
            System.err.println(e);
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
        }
        */
        try {
            throw new Exception("Exception");
        } catch (Exception e) {
            System.err.println(e.getClass());
            System.err.println(e.getLocalizedMessage());
            e.printStackTrace(System.err);
        }
    }
}

