
import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Main_Ques_01 {
    Main_Ques_01(){
        JFrame f = new JFrame();
        f.setTitle("JComboBox");

        Vector <String> v = new Vector <>();
        v.add("Mumbai");
        v.add("Solapur");
        v.add("Pune");
        v.add("Banglore");
        v.add("Mumbai");

        JLabel l = new JLabel();
        l.setText("You are in Mumbai");

        JComboBox<String> j = new JComboBox<>(v);

        f.add(j);
        f.add(l);

        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Main_Ques_01();
    }
}
