package Chapter5;

/**
 * Created by PuFan on 2016/11/11.
 */
public class MyExceptionTest {
    public static double[] creatDoubleArray(int length) throws MyException {
        if (length < 1)
            throw new MyException("Array error");
        return new double[length];
    }

    static public void main(String[] args) {
        try {
            creatDoubleArray(-20);
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }

}
