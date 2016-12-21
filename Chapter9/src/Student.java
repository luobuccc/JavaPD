import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by PuFan on 2016/12/16.
 */
public class Student {
    private String name;
    private String id;
    private double score;

    public Student(String name, String id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", score=" + score +
                '}';
    }
}

class scoreComp implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore() > o2.getScore())
            return 1;
        else if (o1.getScore() < o2.getScore())
            return -1;
        else return 0;
    }
}


class nameeComp implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class test {
    public static void main(String[] args) {
        Set<Student> S = new TreeSet<>(new scoreComp());
        S.add(new Student("zhangsan", "120121", 100));
        S.add(new Student("lisi", "120122", 20));
        S.add(new Student("liji", "120123", 50));
        System.out.println(S);

    }
}