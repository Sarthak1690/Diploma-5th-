import javax.swing.*;
import java.awt.*;

public class Question_No_01 {
    Question_No_01(){
        JFrame f = new JFrame();
        f.setTitle("JTree Class");

        BorderLayout b1 = new BorderLayout();

        final String[] Headings = { "Name of Student", "Percentage", "Grade" };

        final Object[][] data = {
                {"Suraj Tapkir","99.99%","A+"},
                { "Prashant Jadhav", "95.00%", "A+"},
                { "Siddhesh Naik", "98.00%", "A+"},
                { "Gandharv Adsare", "90.00%", "A"},
                { "Pranav Jadhav", "90.90%", "A"},
                { "Saurabh Jadhav", "89.87%", "B+"},
                { "Ganesh Tapkir", "86.77%", "B+"},
                { "Aniket Gangarde", "82.00%", "B"},
                { "Shivam Gangarde", "80.00%", "C"},
                { "Sarthak Kakade", "75.00%", "C-"}
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
        new Question_No_01();
    }
}
