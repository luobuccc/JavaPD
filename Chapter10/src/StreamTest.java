import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by PuFan on 2016/12/21.
 */

public class StreamTest {
    /*
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

    public static void main(String[] args) {
        byte[] buffer=new byte[1024];
        ByteBuffer BF=ByteBuffer.allocate(1024);

        try {
            BufferedInputStream BI=new BufferedInputStream(new FileInputStream("E:\\Windows10壁纸\\10-1.jpg"));
            BufferedOutputStream OS=new BufferedOutputStream(new FileOutputStream("H:\\test\\10.bmp"));
            //Channel N=new FileInputStream("").getChannel();
            while(BI.read(buffer)!=-1){
                OS.write(buffer);
                //System.out.println(Arrays.toString(buffer));
            }
            BI.close();
            OS.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            String temp;
            BufferedReader BR=new BufferedReader(new FileReader("H:\\test\\10.jpg"));
            try (BufferedWriter BW = new BufferedWriter(new FileWriter("H:\\test\\te.jpg"))) {

                while ((temp = BR.readLine()) != null) {
                    BW.write(temp);
                    BW.flush();
                }
                BR.close();
                BW.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        ByteBuffer B = ByteBuffer.allocate(1024);
        try {
            FileChannel in = new FileInputStream("H:\\\\test\\\\10.jpg").getChannel();
            FileChannel out = new FileOutputStream("H:\\\\test\\\\te1.jpg").getChannel();
            BufferedReader X = new BufferedReader(new FileReader("H:\\\\test\\\\10.jpg"));
            BufferedWriter BW = new BufferedWriter(new FileWriter("H:\\\\test\\\\10.jpg"));
            // ByteBuffer B=ByteBuffer.allocate(1024);
            // IntBB.asIntBuffer();
            //BufferedWriter BW=new BufferedWriter();
            //B//W.
            while (in.read(B) != -1) {
                B.flip();
                out.write(B);
                B.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






