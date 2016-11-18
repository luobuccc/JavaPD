package Chapter5;

/**
 * Created by PuFan on 2016/11/11.
 */
public class StackTraceTest {
    private void methodA() {
        methodB();
    }

    private void methodB() {
        methodC();
    }

    private void methodC() {
        int i = 10 / 0;
    }


    static public void main(String[] args) {
        StackTraceTest stt = new StackTraceTest();
        stt.methodA();
    }
}



