import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question_No_01 {
    Question_No_01(){
        JFrame f = new JFrame();
        f.setTitle("Multiply Example");

        Font f1 = new Font("Times New Roman", Font.BOLD,22);
        Font f2 = new Font("Times New Roman", Font.BOLD,18);
        Font f3 = new Font("Times New Roman", Font.PLAIN,14);

        JLabel l1 = new JLabel("Multiply");
        l1.setFont(f1);
        l1.setForeground(Color.RED);
        l1.setBounds(170,70,150,30);
        f.add(l1);

        Label l2 = new Label("1st Number: ");
        l2.setForeground(Color.black);
        l2.setFont(f2);
        l2.setBounds(50,120,130,30);
        TextField t1 = new TextField();
        t1.setFont(f3);
        t1.setBounds(180, 120, 250, 30);
        f.add(l2);
        f.add(t1);

        Label l3 = new Label("2st Number: ");
        l3.setForeground(Color.black);
        l3.setFont(f2);
        l3.setBounds(50,180,130,30);
        TextField t2 = new TextField();
        t2.setFont(f3);
        t2.setBounds(180, 180, 250, 30);
        f.add(l3);
        f.add(t2);

        Label l4 = new Label("Answer: ");
        l4.setForeground(Color.black);
        l4.setFont(f2);
        l4.setBounds(50,240,130,30);
        TextField t3 = new TextField();
        t3.setFont(f3);
        t3.setBounds(180, 240, 250, 30);
        f.add(l4);
        f.add(t3);

        JButton b = new JButton("Calculate");
        b.setFont(f1);
        b.setBounds(180,300,150,50);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i,j;
                i = Integer.parseInt(t1.getText());
                j = Integer.parseInt(t2.getText());

                int k = (i*j);

                t3.setText(Integer.toString(k));
            }
        });

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Question_No_01();
    }
}
