package Chapter5;

/**
 * Created by PuFan on 2016/11/11.
 */
public class HandelException {
    static public void main(String[] args) {

        int number = 0;
        try {
            String str = args[0];
            number = Integer.parseInt(str);
            System.out.println("Put num is " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass());
            // throw  new RuntimeException(e);
        } catch (NumberFormatException e) {
            System.out.println(e.getClass());
        }
        System.out.println("End");


    }
}
