import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Question_No_03 {
    Question_No_03(){
        JFrame f = new JFrame();
        f.setTitle("MouseMotionListener Interface");

        Font f1 = new Font("Times New Roman", Font.BOLD, 32);

        Button b = new Button("Click here..");
        b.setFont(f1);
        b.setBounds(100, 100, 300, 90);

        b.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent m) {
                b.setLabel("Mouse Dragged");
            }

            public void mouseMoved(MouseEvent m) {
                b.setLabel("Mouse Moved");
            }

        });
        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Question_No_03();
    }
}
