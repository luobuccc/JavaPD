import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by PuFan on 2017/2/7.
 */
public class SwingDemo2 {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Hello");
        JLabel label = new JLabel("hehe");
        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TimeUnit.MILLISECONDS.sleep(1000);
        //l.setText("hahahahahaha");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("Hey!!!");
            }
        });

    }

}
