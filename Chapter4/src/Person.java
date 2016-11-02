/**
 * Created by PuFan on 2016/10/26.
 */
public class Person {
    private String name;
    private static int age = 10;

    public static int getId() {
        return id;
    }

    public static int id = 0;

    static {
        System.out.println("Static call");
    }

    public Person() {
        ++id;
        age = id;

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
