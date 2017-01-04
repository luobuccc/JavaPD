import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChatClient {

    public static void main(String[] args) {
        ClientThread client = new ClientThread(args[0]);
        client.start();
        BufferedReader sin = new BufferedReader(
                new InputStreamReader(System.in));
        String readline;
        try {
            while ((readline = sin.readLine()) != null) {
                if (readline.equals("bye")) {
                    client.close();
                    System.exit(0);
                }
                client.send(readline);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
