/**
 * Created by PuFan on 2016/10/26.
 */
public class Student extends Person {
    private String num;
    private double Score;

    static public void main(String[] args) {
        Person.id = 100;
        Person p = new Student();
        System.out.println(p.getAge());
        Person q = new Person();
        p.getAge();
        System.out.println(q.getAge());
        p.setAge(20);
        p.setName("Hello");
        System.out.println(p.getInfo());
        //Student s= (Student)p;
        //s.setScore(100);
        //System.out.println(s.getInfo());
        System.out.println(p instanceof Person);
        Class pe = Person.class;
        try {
            Object o = pe.newInstance();
            Person a = (Person) o;
            a.setAge(20);
            a.setName("hearse");
            a.getInfo();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "num:" + num;
    }


}
