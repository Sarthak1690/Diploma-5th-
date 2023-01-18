import javax.swing.*;
import java.awt.*;

public class Main_Ques_01 {
    JProgressBar p;
    int i = 0;

    Main_Ques_01(){
        JFrame f = new JFrame();
        f.setTitle("JProgressBar Class");

        p = new JProgressBar(0, 10000);
        p.setValue(0);
        p.setStringPainted(true);
        p.setBounds(100,100,200,50);

        f.add(p);
        f.setSize(400, 300);
        f.setLayout(null);
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
        new Main_Ques_01().progress();
    }
}
