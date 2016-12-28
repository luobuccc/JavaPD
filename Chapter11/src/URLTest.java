import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by PuFan on 2016/12/28.
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            URL u1 = new URL("http://www.zjc.zjut.edu.cn/");
            System.out.println(u1.getHost() + u1.getPort() + u1.getFile());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

}
