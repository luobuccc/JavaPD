import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by PuFan on 2016/12/22.
 */
public class P20161222$2 {
    public static boolean compareFile(String file1, String file2) throws IOException {
        boolean flag = false;
        ByteBuffer buffer1 = ByteBuffer.allocate(2048);
        ByteBuffer buffer2 = ByteBuffer.allocate(2048);
        FileChannel f1 = new FileInputStream(file1).getChannel();
        FileChannel f2 = new FileInputStream(file2).getChannel();

        while (f1.read(buffer1) != -1 && f2.read(buffer2) != -1) {
            if (!buffer1.equals(buffer2)) {
                flag = false;
                return flag;
            } else {
                flag = true;
                buffer1.clear();
                buffer2.clear();
            }
        }
        return flag;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(compareFile("H:\\test\\10.jpg", "H:\\test\\10.bmp"));
    }
}
