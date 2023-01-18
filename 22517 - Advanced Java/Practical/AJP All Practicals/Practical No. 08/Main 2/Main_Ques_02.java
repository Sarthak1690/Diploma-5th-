import javax.swing.*;
import java.awt.*;

public class Main_Ques_02 {
    Main_Ques_02(){
        JFrame f = new JFrame();
        f.setTitle("JTree Class");

        BorderLayout b1 = new BorderLayout();

        final String[] Headings = { "ID", "NAME", "SALARY" };

        final Object[][] data = {
                { "101", "Amit", "670000" },
                { "102", "Jai","780000"},
                { "101", "Sachin", "700000" }
        };

        JTable table = new JTable(data, Headings);
        // table.setBounds(30, 100, 1020, 300);

        JScrollPane s1 = new JScrollPane(table,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        f.setLayout(b1);
        f.add(s1, b1.CENTER);
        f.setSize(500, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main_Ques_02();
    }
}
