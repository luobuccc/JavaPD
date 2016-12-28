import java.io.*;
import java.util.Date;

/**
 * Created by PuFan on 2016/12/23.
 */
public class P297$4 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream OS = new ObjectOutputStream(new FileOutputStream("H:\\account.dat"));
            OS.writeObject(new Account("0001", "ZhangSan", "123456", new Date(), "12345@.com"));
            ObjectInputStream IS = new ObjectInputStream(new FileInputStream("H:\\account.dat"));
            System.out.println(IS.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Account implements Serializable {
    private String id;
    private String name;
    private String password;
    private Date registedTime;
    private transient String email;

    public Account(String id, String name, String password, Date registedTime, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.registedTime = registedTime;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", registedTime=" + registedTime +
                ", email='" + email + '\'' +
                '}';
    }
}
