import java.util.*;

/**
 * Created by PuFan on 2016/12/16.
 */
public class P20161216_1 {
    public static void main(String[] args) {
        employee e[] = {new employee("101", "A", "S", 4000),
                new employee("102", "B", "Z", 5000),
                new employee("103", "C", "S", 5500),
                new employee("104", "D", "X", 3000),
                new employee("105", "E", "S", 8000)
        };
        HashSet<employee> HS = new HashSet<>(Arrays.asList(e));
        for (employee t : HS)
            System.out.println(t);
        TreeSet<employee> TS = new TreeSet<>(new employeeSalaryCmp());
        TS.addAll(Arrays.asList(e));
        for (employee t : TS)
            System.out.println(t);
        ArrayList<employee> L = new ArrayList<>(Arrays.asList(e));
        System.out.println(L);
    }
}

class employee {
    private String id;
    private String name;
    private String position;
    private double salary;

    public employee(String id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee employee = (employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class employeeSalaryCmp implements Comparator<employee> {
    @Override
    public int compare(employee o1, employee o2) {
        if (o1.getSalary() < o2.getSalary())
            return 1;
        else if (o1.getSalary() > o2.getSalary())
            return -1;
        else
            return 0;
    }
}
