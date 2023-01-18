import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main_Ques_01 {
    Main_Ques_01(){
        JFrame f = new JFrame();
        f.setTitle("KeyListener Interface");

        Font f1 = new Font("Times New Roman", Font.BOLD, 32);

        Label t = new Label("Type here..");
        t.setFont(f1);
        t.setBounds(100, 100, 300, 50);

        f.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                t.setText("Key Pressed");
            }
        });
        f.add(t);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main_Ques_01();
    }
}
