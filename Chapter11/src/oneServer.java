import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by PuFan on 2016/12/30.
 */
public class oneServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        String line;
        try {
            server = new ServerSocket(65500);
            //Socket sc=server.accept();
            System.out.println(server.getInetAddress().getHostAddress() + ':' + server.getLocalPort());
            while (true) {
                Socket socket = server.accept();
                System.out.println(socket.getInetAddress().getHostAddress() + socket.getPort());
                BufferedReader BI = new BufferedReader(new InputStreamReader(System.in));

                BufferedReader BR = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter os = new PrintWriter(socket.getOutputStream());

                while ((line = BR.readLine()) != null) {
                    System.out.println(line);
                    line = BI.readLine();
                    os.println(line);
                    os.flush();
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
