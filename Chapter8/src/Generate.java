/**
 * Created by PuFan on 2016/12/9.
 */
public class Generate<T> {
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
}