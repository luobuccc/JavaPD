import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientThread extends Thread {
    Socket socket;
    BufferedReader is;
    PrintWriter os;

    public ClientThread(String username) {
        try {
            socket = new Socket("localhost", 12345);
            is = new BufferedReader(new
                    InputStreamReader(
                    socket.getInputStream()));
            os = new PrintWriter(socket.getOutputStream());
            os.println(username);
            os.flush();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void run() {
        String readline;
        try {
            while ((readline = is.readLine()) != null) {
                System.out.println(readline);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void close() {
        try {
            is.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void send(String readline) {
        os.println(readline);
        os.flush();
    }
}
