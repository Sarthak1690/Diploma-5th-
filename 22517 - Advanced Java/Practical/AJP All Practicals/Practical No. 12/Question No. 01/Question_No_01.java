import javax.swing.*;

public class Question_No_01 {
    Question_No_01(){
        JFrame f = new JFrame("JPasswordField");

        JPasswordField p = new JPasswordField();
        p.setEchoChar('*');

        JTextField t = new JTextField();

        JLabel l1=new JLabel("JPasswordField Password:");
        JLabel l2=new JLabel("JTextField Password:");
        l1.setBounds(20,100, 180,30);
        l2.setBounds(20,150, 150,30);
        p.setBounds(200,100,100,30);
        t.setBounds(200,150,100,30);
        f.add(p);
        f.add(l1);
        f.add(t);
        f.add(l2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Question_No_01();
    }
}
