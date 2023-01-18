
import javax.swing.*;

public class Main_Ques_01 {
    Main_Ques_01(){
        JFrame f = new JFrame("JPasswordField");

        JPasswordField p = new JPasswordField();
        p.setEchoChar('#');

        JLabel l1=new JLabel("Password:");
        l1.setBounds(20,100, 80,30);
        p.setBounds(100,100,100,30);
        f.add(p);
        f.add(l1);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Main_Ques_01();
    }
}
