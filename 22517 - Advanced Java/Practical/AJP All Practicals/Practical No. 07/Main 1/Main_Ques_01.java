import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Main_Ques_01 {
    Main_Ques_01(){
        JFrame f = new JFrame();
        f.setTitle("JTree Class");

        DefaultMutableTreeNode main = new DefaultMutableTreeNode("IT-Developer");

        DefaultMutableTreeNode A = new DefaultMutableTreeNode("IT-DEVELOPER");
        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("C");
        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("C++");

        DefaultMutableTreeNode B = new DefaultMutableTreeNode("SOFTWARE");
        DefaultMutableTreeNode B1 = new DefaultMutableTreeNode("Android Studio");
        DefaultMutableTreeNode B2 = new DefaultMutableTreeNode("JDK");
        DefaultMutableTreeNode B3 = new DefaultMutableTreeNode("Office Activator");

        main.add(A);
        main.add(B);
        A.add(A1);
        A.add(A2);
        B.add(B1);
        B.add(B2);
        B.add(B3);

        JTree tree = new JTree(main);
        tree.setBounds(5, 0, 300, 300);

        f.add(tree);
        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main_Ques_01();
    }
}
