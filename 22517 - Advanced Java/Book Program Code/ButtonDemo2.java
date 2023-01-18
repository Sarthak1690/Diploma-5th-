// Button Control 
import java.awt.*;
class ButtonDemo2 extends FrameDemo
  {
     ButtonDemo2()
       {
          FlowLayout f1 = new FlowLayout(FlowLayout.LEFT);
          setLayout(f1);
          Button b1=new Button("OK");
          Button b2=new Button("Cancel");
          Button b3=new Button();

    // By Using Set Label : 
          b3.setLabel("Retry");
    // By Using Set Bounds :
          b1.setBounds(10,50,100,150);
          b2.setBounds(10,50,100,150);
          b3.setBounds(10,50,100,150);
          add(b1);
          add(b2);
          add(b3);
       }
    public static void main(String [] args)
      {
         ButtonDemo2 f1 = new ButtonDemo2();
         f1.setVisible(true);
         f1.setSize(500,500);
         f1.setTitle("Button Demo");
      }
  }  

