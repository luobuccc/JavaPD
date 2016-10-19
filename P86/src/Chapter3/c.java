package Chapter3;

/**
 * Created by PuFan on 2016/10/19.
 */

public class c {
    static public void main(String[] args) {
        Person0 p = new Person0();
        System.out.println(p.getAge());
        Student0 s = new Student0();
        System.out.println(s.age);
        System.out.println(s.getAge());
        System.out.println(s.getInfo());
    }
}

class Person0 {
    int age = 5;

    public int getAge() {
        return age;
    }

    public int getInfo() {
        return age;
    }
}

class Student0 extends Person0 {
    int age = 6;

    public int getAge() {
        return age;
    }
}