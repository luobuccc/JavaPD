import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by PuFan on 2016/12/30.
 */
public class oneclint {
    public static void main(String[] args) {
        String line;
        try {
            Socket sc = new Socket("192.168.10.2", 12345);
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

            BufferedReader BI = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            PrintWriter os = new PrintWriter(sc.getOutputStream());

            while ((line = BR.readLine()) != null) {
                os.println(line);
                os.flush();

                line = BI.readLine();
                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
