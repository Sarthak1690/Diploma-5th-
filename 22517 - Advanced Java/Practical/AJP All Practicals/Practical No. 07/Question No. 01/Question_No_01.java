import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Question_No_01 {
    Question_No_01(){
        JFrame f = new JFrame();
        f.setTitle("JTree Class");

        DefaultMutableTreeNode main = new DefaultMutableTreeNode("Windows C:");

        DefaultMutableTreeNode A = new DefaultMutableTreeNode("Intel");
        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("PerfLogs");
        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("Program Files");
        DefaultMutableTreeNode A3 = new DefaultMutableTreeNode("Program Files(x86)");
        DefaultMutableTreeNode A4 = new DefaultMutableTreeNode("Users");
        DefaultMutableTreeNode A5 = new DefaultMutableTreeNode("Windows");
        DefaultMutableTreeNode A6 = new DefaultMutableTreeNode("XboxGames");


        main.add(A);
        main.add(A1);
        main.add(A2);
        main.add(A3);
        main.add(A4);
        main.add(A5);
        main.add(A6);

        JTree tree = new JTree(main);
        tree.setBounds(5, 0, 300, 300);

        f.add(tree);
        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Question_No_01();
    }
}
