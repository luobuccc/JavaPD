import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

public class ServerThread extends Thread {
    Socket socket;
    HashMap<String, ServerThread> clientlist;
    BufferedReader is;
    PrintWriter os;
    String username;

    public ServerThread(Socket socket,
                        HashMap<String, ServerThread> clientlist) {
        this.socket = socket;
        this.clientlist = clientlist;
        try {
            is = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            os = new PrintWriter(socket.getOutputStream());
            //读取客户端用户名
            this.username = is.readLine();
            clientlist.put(username, this);
            System.out.println(username + "连接:" +
                    socket.getInetAddress().getHostAddress() + ":" +
                    socket.getPort());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void run() {
        String line;
        try {
            while ((line = is.readLine()) != null) {
                System.out.println(username + "发来：" + line);
                if (line.equals("bye")) {
                    break;
                } else {
                    String[] arr = line.split(":");
                    if (arr.length == 2) {
                        if (clientlist.containsKey(arr[0])) {
                            clientlist.get(arr[0]).send(arr[1] +
                                    "(from" + username + ")");
                        }
                    }
                }
            }
            is.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void send(String string) {
        System.out.println("发给" + username + "" + string);
        os.println(string);
        os.flush();

    }

}
