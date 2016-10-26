/**
 * Created by PuFan on 2016/10/26.
 */
public class Person {
    private String name;
    private int age;

    public Person() {

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
