import javax.swing.*;
import java.awt.*;

public class Question_No_02 {
    Question_No_02(){
        JFrame f = new JFrame();
        f.setTitle("ScrollPane");

        JTextArea t = new JTextArea("Hii, This is a JTextArea",4,5);

        JScrollPane s = new JScrollPane(t,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        s.setBounds(50,100,200,100);

        f.add(s);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Question_No_02();
    }
}
