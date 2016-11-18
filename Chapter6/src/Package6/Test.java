package Package6;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by PuFan on 2016/11/16.
 */
public class Test {
    static public void main(String[] args) {
        Integer oj = 3;
        Integer.toBinaryString(oj);
        Integer oj1 = 3;
        //Object oj2 = oj;
        System.out.println(oj == oj1);
        int i = 5;
        double t = 5;
        System.out.println(t);
        int[] x = {1, 2, 3, 4};
        int[] y = new int[10];
        System.arraycopy(x, 0, y, 2, 4);
        System.out.println(Arrays.toString(y));


    }

}

class Student {
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);

    }
}
