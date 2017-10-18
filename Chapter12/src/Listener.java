import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by PuFan on 2017/1/6.
 */
public class Listener extends JFrame implements ActionListener {
    private JLabel lb;
    private JButton bt1;

    public Listener() throws HeadlessException {
        lb = new JLabel("T");
        bt1 = new JButton("Check");
        Container ctn = this.getContentPane();
        ctn.setLayout(new BorderLayout());
        ctn.add(lb, BorderLayout.CENTER);
        ctn.add(bt1, BorderLayout.SOUTH);
        bt1.addActionListener(this);
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Listener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lb.setText("110");
    }
}
