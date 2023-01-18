import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Main_Ques_02 {
    Main_Ques_02(){
        JFrame f = new JFrame();
        f.setTitle("JTree Class");

        DefaultMutableTreeNode main = new DefaultMutableTreeNode("India");

        DefaultMutableTreeNode A = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode A3 = new DefaultMutableTreeNode("Nashik");
        DefaultMutableTreeNode A4 = new DefaultMutableTreeNode("Nagpur");

        DefaultMutableTreeNode B = new DefaultMutableTreeNode("Gujrath");


        main.add(A);
        main.add(B);
        A.add(A1);
        A.add(A2);
        A.add(A3);
        A.add(A4);

        JTree tree = new JTree(main);
        tree.setBounds(5, 0, 300, 300);

        f.add(tree);
        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main_Ques_02();
    }
}
