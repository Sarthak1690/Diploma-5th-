import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Question_No_02 extends JFrame implements ActionListener {
    JProgressBar p;
    JButton b ;
    Question_No_02(){
        b = new JButton("Show");
        b.addActionListener(this);
        b.setBounds(20, 20, 80, 25);

        p = new JProgressBar(0, 1000);
        p.setValue(0);
        p.setStringPainted(true);
        p.setBounds(100,100,200,50);
        p.setVisible(false);

        add(b);
        add(p);

        setSize(400,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent a){
        int i = 0;
        p.setVisible(true);
        while (i <= 1000) {
            p.setValue(i);
            i = i + 100;
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        new Question_No_02();
    }
}