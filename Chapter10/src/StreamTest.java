import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by PuFan on 2016/12/21.
 */
public class StreamTest {
    public static void main(String[] args) {
        BufferedInputStream b = null;
        byte[] contents = new byte[1024];
        int s = 0;
        try {
            b = new BufferedInputStream(new FileInputStream("H:\\test\\test.jva"));
            String strFileContents = "";
            while ((s = b.read(contents)) != -1)
                strFileContents = new String(contents, 0, s);
            System.out.println(strFileContents);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
