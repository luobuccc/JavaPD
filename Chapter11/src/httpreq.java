import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;

/**
 * Created by PuFan on 2016/12/28.
 */
public class httpreq {
    public static void main(String[] args) {
        Properties pros = new Properties();
        pros.setProperty("Content-type", "application/x-www-form-urlencoded");
        pros.setProperty("q", "java");
        pros.setProperty("p", "1");
        try {
            sendPost(new URL("http://so.csdn.net/so/"), pros);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static void sendPost(URL url, Properties pros) {
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            PrintWriter out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream()), true);
            for (Iterator it = pros.keySet().iterator(); it.hasNext(); ) {
                String key = (String) it.next();
                String value = pros.getProperty(key);
                out.write(key + "=" + value);
                if (it.hasNext())
                    out.write("&");

            }
            out.close();
            conn.connect();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            for (String line = null; (line = br.readLine()) != null; )
                System.out.println(line);
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
