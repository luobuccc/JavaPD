import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by PuFan on 2016/12/28.
 */
public class GetIp {
    public static void main(String[] args) {
        try {
            InetAddress Local = InetAddress.getLocalHost();
            InetAddress go = InetAddress.getByName("www.baidu.com");
            InetAddress gp1 = InetAddress.getByName("www.baidu.com");
            System.out.println(gp1);
            //InetAddress AD=InetAddress.getByAddress("192.168.10.3");
            System.out.println(Local.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
