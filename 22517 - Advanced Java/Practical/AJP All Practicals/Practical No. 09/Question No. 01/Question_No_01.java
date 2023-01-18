import javax.swing.*;
import java.awt.*;

public class Question_No_01 {
    JProgressBar p;
    int i = 0;

    Question_No_01(){
        JFrame f = new JFrame();
        f.setTitle("JProgressBar Class");

        BorderLayout b1 = new BorderLayout();

        p = new JProgressBar(0, 10000);
        p.setValue(0);
        p.setStringPainted(true);

        f.setLayout(b1);
        f.add(p, b1.CENTER);
        f.setSize(500, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void progress() {
        while (i <= 10000) {
            p.setValue(i);
            i = i + 100;
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        new Question_No_01().progress();
    }

}
