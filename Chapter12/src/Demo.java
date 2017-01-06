import javax.swing.*;
import java.awt.*;

/**
 * Created by PuFan on 2017/1/6.
 */
public class Demo extends JFrame {
    private JButton bt1, bt2, bt3, bt4;

    public Demo() {
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        Container ctn = this.getContentPane();
        ctn.setLayout(new BorderLayout());
        ctn.add(bt1, BorderLayout.NORTH);
        ctn.add(bt2, BorderLayout.NORTH);
        ctn.add(bt3, BorderLayout.CENTER);
        ctn.add(bt4);
        this.setSize(300, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Demo();

    }
}
