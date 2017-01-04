import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class ChatServer {

    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(12345);
            System.out.println("服务器启动："
                    + server.getInetAddress().getHostAddress() + ":"
                    + server.getLocalPort());
            //客户端的列表
            HashMap<String, ServerThread> clientlist =
                    new HashMap<>();
            //监听客户端
            while (true) {
                Socket socket = server.accept();
                //启动客户端处理线程
                new ServerThread(socket, clientlist).start();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
