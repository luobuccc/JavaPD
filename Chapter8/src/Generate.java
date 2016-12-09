import java.util.Collection;

/**
 * Created by PuFan on 2016/12/9.
 */
public class Generate<T extends Collection> {
    private T data;

    public Generate(T data) {
        this.data = data;
    }

    static <T> void f() {

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void getclass() {
        System.out.println("x" + data.getClass().toString());
    }

}
