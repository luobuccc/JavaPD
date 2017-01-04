import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

class Sok_1_Client {

    public static void main(String[] args) throws IOException {
        Socket sock = new Socket("127.0.0.1", 65500);

        PrintStream ps = new PrintStream(
                sock.getOutputStream());
        ps.println("Hello to server from sok_1_client!");


        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        sock.getInputStream()));
        String ms = br.readLine();
        System.out.println(ms);

        sock.close();

    }

}
