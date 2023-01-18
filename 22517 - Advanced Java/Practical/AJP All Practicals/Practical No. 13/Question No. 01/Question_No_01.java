import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Question_No_01 {
    Question_No_01(){
        JFrame f = new JFrame();
        f.setTitle("WindowAdapter Class");

        Font f1 = new Font("Times New Roman", Font.BOLD, 32);

        Label t = new Label("Type here..",Label.CENTER);
        t.setFont(f1);
        t.setBounds(100, 100, 300, 90);

        f.addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent w) {
                t.setText("Window Opened");
            }
        });

        f.add(t);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Question_No_01();
    }
}
