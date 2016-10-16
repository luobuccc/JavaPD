package Chapter3;

/**
 * Created by PuFan on 2016/10/14.
 */
public class P1 {
    static public void main(String[] args) {
        Student st = new Student("ZhangSan", "20150000", "1", 'M', 20);
        System.out.println(st);
        st.setAge(22);
        System.out.println(st.getAge());
    }
}

class Student {
    private String Name;
    private String Num;
    private String Clas;
    private char Gender;
    private int Age;

    public Student() {
    }

    public Student(String name, String num, String cla, char gender, int age) {
        Name = name;
        Num = num;
        Clas = cla;
        Gender = gender;
        Age = age;
    }

    public String getNum() {
        return Num;
    }

    public char getGender() {
        return Gender;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int i) {
        Age = i;
    }

    public String toString() {
        return "Student: " + Name + " Num: " + Num + " Class: " + Clas + " Gender: " + Gender + " Age: " + Age;
    }

}
