import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * Created by PuFan on 2017/1/4.
 */
public class MulticeatReceiver {
    public static void main(String[] args) {
        byte[] b = new byte[65600];
        DatagramPacket dg = new DatagramPacket(b, b.length);
        try {
            MulticastSocket socket = new MulticastSocket(6789);
            socket.joinGroup(InetAddress.getByName("224.0.0.0"));
            while (true) {
                socket.receive(dg);
                String str = new String(dg.getData(), dg.getOffset(), dg.getLength());
                System.out.println(str);
                // socket.close();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
