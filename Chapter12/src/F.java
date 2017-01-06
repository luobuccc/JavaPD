import javax.swing.*;

/**
 * Created by PuFan on 2017/1/6.
 */
public class F {
    private JPanel F;
    private JButton checkButton;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JCheckBox checkBox1;
    private JTextArea thisIsAJavaTextArea;
    private JList list1;
    private JTable table1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("F");
        frame.setContentPane(new F().F);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
