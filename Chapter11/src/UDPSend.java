import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by PuFan on 2017/1/4.
 */
public class UDPSend {
    public static void main(String[] args) {

        DatagramSocket socket = null;
        String str = "UDP connection test";
        byte[] buffer = str.getBytes();
        try {
            DatagramPacket dg = null;
            dg = new DatagramPacket(buffer, buffer.length, InetAddress.getByName("192.168.10.67"), 6789);
            socket = new DatagramSocket();
            socket.send(dg);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null)
                socket.close();
        }

    }
}
