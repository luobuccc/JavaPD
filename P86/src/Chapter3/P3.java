package Chapter3;

/**
 * Created by PuFan on 2016/10/14.
 */
public class P3 {
    static public void main(String[] args) {
        Rectangle rc = new Rectangle(2, 5);
        System.out.println(rc.calculateArea());
        System.out.println(rc.calculateGirth());

    }
}

class Rectangle {
    private double len;
    private double width;

    public Rectangle() {
        len = 0;
        width = 0;
    }

    public Rectangle(double l, double w) {
        len = l;
        width = w;
    }

    public double calculateArea() {
        return len * width;
    }

    public double calculateGirth() {
        return 2 * (len + width);
    }


}