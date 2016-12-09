import java.util.ArrayList;

/**
 * Created by PuFan on 2016/12/9.
 */
public class Test {
    public static void main(String[] args) {


        Generate<ArrayList> X = new Generate<>(new ArrayList());
        System.out.println(X.getData());
    }
}
