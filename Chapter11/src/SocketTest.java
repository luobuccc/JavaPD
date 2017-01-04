import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class Sok_1_Server {

    public static void main(String[] args) throws IOException {
        ServerSocket sersock = new ServerSocket(65500);
        Socket sock = sersock.accept();

        InputStreamReader ir = new InputStreamReader(
                sock.getInputStream());
        BufferedReader br = new BufferedReader(ir);

        String ms = br.readLine();
        System.out.println(ms);

        if (ms != null) {
            //BufferedWriter BW=new BufferedWriter()
            PrintStream ps = new PrintStream(
                    sock.getOutputStream());
            ps.println("Message received!");
        }

        sersock.close();

    }

}
