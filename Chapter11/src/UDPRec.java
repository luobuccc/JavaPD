import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by PuFan on 2017/1/4.
 */
public class UDPRec {
    public static void main(String[] args) {
        byte[] buffer = new byte[65600];
        DatagramPacket dg = new DatagramPacket(buffer, buffer.length);
        try {
            DatagramSocket socket = new DatagramSocket(6789);
            while (true) {
                socket.receive(dg);
                String str = new String(dg.getData(), dg.getOffset(), dg.getLength());
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
