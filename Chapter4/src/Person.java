/**
 * Created by PuFan on 2016/10/26.
 */
public class Person {
    public static int id = 0;
    private static int age = 10;

    static {
        System.out.println("Static call");
    }

    private String name;

    public Person() {
        ++id;
        age = id;

    }

    public static int getId() {
        return id;
    }

    static public void main(String[] args) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return "Name:" + name + "age:";
    }

}
