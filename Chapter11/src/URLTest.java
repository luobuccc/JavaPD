import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by PuFan on 2016/12/28.
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.zjc.zjut.edu.cn/");
            URLConnection c = url.openConnection();
            String std;

            BufferedReader BR = new BufferedReader(new InputStreamReader(c.getInputStream(), "UTF-8"));
            BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("H:\\test\\don.html")));
            while ((std = BR.readLine()) != null)
                BW.write(std);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
