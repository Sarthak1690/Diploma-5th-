import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Question_No_02 {
    Question_No_02(){
        JFrame f = new JFrame("MouseEvent");

        JLabel l = new JLabel("Hello");
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l.setText("Count: "+e.getClickCount());
            }
        });

        f.add(l);

        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Question_No_02();
    }
}
