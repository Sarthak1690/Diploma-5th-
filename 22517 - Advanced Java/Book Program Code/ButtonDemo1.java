// Button Control 
import java.awt.*;
class ButtonDemo1 extends FrameDemo
  {
     ButtonDemo1()
       {
          FlowLayout f1 = new FlowLayout(FlowLayout.LEFT);
          setLayout(f1);
          Button b1=new Button("OK");
          Button b2=new Button("Cancel");
          Button b3=new Button("Retry");
          add(b1);
          add(b2);
          add(b3);
       }
    public static void main(String [] args)
      {
         ButtonDemo1 f1 = new ButtonDemo1();
         f1.setVisible(true);
         f1.setSize(500,500);
         f1.setTitle("Button Demo");
      }
  }  
