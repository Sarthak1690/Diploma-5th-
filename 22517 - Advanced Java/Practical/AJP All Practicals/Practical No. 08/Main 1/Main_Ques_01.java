import javax.swing.*;
import java.awt.*;

public class Main_Ques_01 {
    Main_Ques_01(){
        JFrame f = new JFrame();
        f.setTitle("JTree Class");

        BorderLayout b1 = new BorderLayout();

        final String[] Headings = { "Roll No", "Student Name", "Address" };

        final Object[][] data = {
                { "1", "Suraj Tapkir", "Karjat" },
                { "2", "Prashant Jadhav", "Aurangabad" },
                { "3", "Siddesh Naik", "Manchar" },
                { "4", "Gandharv Adsare", "Narayangaon" }
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
        new Main_Ques_01();
    }
}
