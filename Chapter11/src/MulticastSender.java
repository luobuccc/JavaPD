import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

/**
 * Created by PuFan on 2017/1/4.
 */
public class MulticastSender {
    public static void main(String[] args) {
        String str = "S";
        byte[] b = str.getBytes();
        DatagramPacket dg = null;
        MulticastSocket socket = null;
        try {
            dg = new DatagramPacket(b, b.length, InetAddress.getByName("224.0.0.0"), 6789);
            socket = new MulticastSocket();
            socket.send(dg);
            //socket.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
