import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Question_No_01 {
    Question_No_01(){
        JFrame f = new JFrame();
        f.setTitle("JComboBox");

        Vector<String> v = new Vector<>();
        v.add("Pune");
        v.add("Delhi");
        v.add("Mumbai");
        v.add("Patna");
        v.add("Baramati");
        v.add("Ratnagiri");
        v.add("Latur");
        v.add("Kolhapur");
        v.add("Satara");

        JComboBox<String> j = new JComboBox<>(v);

        f.add(j);

        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Question_No_01();
    }
}
