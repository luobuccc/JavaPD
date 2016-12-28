import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by PuFan on 2016/12/23.
 */
public class AR {
    public static void main(String[] args) {
        try (RandomAccessFile RD = new RandomAccessFile("H:\\test\\10.jpg", "rw")) {

            double[] d = new double[10];
            for (int i = 0; i < 10; i++) {
                d[i] = i + 1;
                RD.writeDouble(d[i]);
            }
            RD.seek(5);
            System.out.println(RD.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
