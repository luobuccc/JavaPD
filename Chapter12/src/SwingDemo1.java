import javax.swing.*;
import java.awt.*;

/**
 * Created by PuFan on 2017/1/6.
 */
public class SwingDemo1 extends JFrame {
    public SwingDemo1() {
        this.setTitle("Demo1");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cnt = this.getContentPane();
        //cnt.setBackground(new Color(200,50,255));
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingDemo1 sw = new SwingDemo1();
    }

}
