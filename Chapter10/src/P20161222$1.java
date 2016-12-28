import java.io.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by PuFan on 2016/12/22.
 */
public class P20161222$1 {
    private static Set<Integer> CreateInteger(int n) {
        Set<Integer> S = new HashSet<>();
        Random ram = new Random();
        while (S.size() != n) {
            S.add(1000 + ram.nextInt(1000));
        }
        return S;
    }

    public static void main(String[] args) {
        try {
            DataOutputStream OS = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("H:\\test\\data.dat")));
            DataInputStream IS = new DataInputStream(new BufferedInputStream(new FileInputStream("H:\\test\\data.dat")));
            for (Integer integer : CreateInteger(10)) {
                OS.writeInt(integer);
            }
            OS.flush();
            OS.close();
            for (int i = 0; i < 10; i++) System.out.println(IS.readInt());
            IS.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
