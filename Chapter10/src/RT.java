import java.io.*;
import java.util.Scanner;

/**
 * Created by PuFan on 2016/12/23.
 */
public class RT {
    //public static void main(String[] args) {
    //    InputStreamReader IR=new InputStreamReader(new BufferedInputStream(System.in));
    //    BufferedReader BR=new BufferedReader(IR);
    //    System.out.println("Please input:");
    //    String str;
    //    try {
    //        while((str=BR.readLine())!=null){
    //            if(str.equals("exit"))
    //                break;
    //            System.out.println(str);}
    //
    //    } catch (IOException e) {
    //        e.printStackTrace();
    //    }
    //}
    public static void main(String[] args) {
        try (BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("H:\\test\\te.jv", true), "UTF-8"))) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String str = sc.nextLine();
                if (str.equals("exit"))
                    break;
                BW.write(str);
            }
            BW.flush();
            BW.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
