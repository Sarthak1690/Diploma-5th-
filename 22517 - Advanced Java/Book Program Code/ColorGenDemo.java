import java.awt.*;

import javafx.event.ActionEvent;
  class ColorGenDemo extends Frame implements ActionListener
    {
        Button b1 , b2 , b3;
        ColorGenDemo()
         {
            FlowLayout f1 = new FlowLayout();
            setLayout(f1);
            b1 = new Button("Yellow");
            b2 = new Button("Green");
            b3 = new Button("Pink");
            add(b1);
            add(b2);
            add(b3);

            b1.addActionListener((java.awt.event.ActionListener) this);
            b2.addActionListener((java.awt.event.ActionListener) this);
            b3.addActionListener((java.awt.event.ActionListener) this);
         }
           public void actionPerFormed(ActionEvent ae)
             {
                if(ae.getSource()==b1)
                 {
                    setBackground(Color.yellow);
                 }
                else if (ae.getSource()==b2)
                 {
                    setBackground(Color.green);
                 }
                else if(ae.getSource()==b3)
                 {
                    setBackground(Color.yellow);
                 }
                
             }
        public static void main(String [] args)
          {
             ColorGenDemo f1 = new ColorGenDemo();
             f1.setVisible(true);
             f1.setSize(800,800);
             f1.setTitle("ColorDemo");
          }
    }