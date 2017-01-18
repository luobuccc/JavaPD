import java.io.*;

/**
 * Created by PuFan on 2016/12/23.
 */
public class serialize {
    public static void main(String[] args) {
        try {
            ObjectOutputStream OS = new ObjectOutputStream(new FileOutputStream("H:\\test\\obj.test"));
            OS.writeObject(new person("Me", 20));
            OS.flush();
            OS.close();
            ObjectInputStream OI = new ObjectInputStream(new FileInputStream("H:\\test\\obj.test"));
            System.out.println(OI.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class person implements Serializable {

    private int count = 0;
    private String name;
    private int age;
    private int id = ++count;
    private transient int t = 8;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}