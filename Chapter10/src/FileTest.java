import java.io.*;

/**
 * Created by PuFan on 2016/12/21.
 */
public class FileTest {
    public static void main(String[] args) {
        //printlist(new File("H:\\"),0);
        showFile("H:\\test\\test.jva");

    }

    public static void printlist(File file, int level) {
        StringBuffer sb = new StringBuffer("|--");
        for (int i = 0; i < level; ++i) sb.insert(0, "| ");
        File[] cd = file.listFiles();
        int length = cd == null ? 0 : cd.length;
        for (int i = 0; i < length; ++i) {
            try {
                System.out.println(sb.toString() + cd[i].getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (cd[i].isDirectory())
                printlist(cd[i], level++);
        }
    }

    public static void showFile(String filename) {
        //byte[] contest=new byte[1024];
        String s;
        try {
            BufferedReader bi = new BufferedReader(new FileReader(filename));
            while ((s = bi.readLine()) != null)
                System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
