import java.awt.*;

// Label Demo
  class LabelDemo extends Frame 
    {
       LabelDemo()
         {
            FlowLayout f1 = new FlowLayout();
            setLayout(f1);
            setBackground(Color.cyan);
            setForeground(Color.red);
            Label L1 = new Label("India");
            Label L2 = new Label("America");
            Label L3 = new Label("China");
            add(L1);
            add(L2);
            add(L3);

         }
       public static void main(String []args)
         {
            LabelDemo f1=new LabelDemo();
            f1.setVisible(true);
            f1.setSize(500,500);
            f1.setTitle("LableDemo");
         } 
    }