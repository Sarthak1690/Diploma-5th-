import java.awt.*;

// Label Demo
  class TextFieldDemo extends Frame 
    {
        TextFieldDemo()
         {
            FlowLayout tf1 = new FlowLayout();
            setLayout(tf1);
            setBackground(Color.cyan);
            setForeground(Color.red);
            TextField tf4 = new TextField(50);
            TextField tf2 = new TextField("America");
            TextField tf3 = new TextField("China",50);
            add(tf4);
            add(tf2);
            add(tf3);

         }
       public static void main(String []args)
         {
            TextFieldDemo f1 = new TextFieldDemo();
            f1.setVisible(true);
            f1.setSize(500,500);
            f1.setTitle("TextFieldDemo");
         } 
    }