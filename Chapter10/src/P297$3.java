import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by PuFan on 2016/12/23.
 */
public class P297$3 {
    public static void main(String[] args) {
        ByteBuffer BF = ByteBuffer.allocate(1024);
        try {
            FileChannel src = new FileInputStream("H:\\test\\data.dat").getChannel();
            FileChannel dst = new FileOutputStream("H:\\test\\data2.dat").getChannel();
            src.transferTo(0, src.size(), dst);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
