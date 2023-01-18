// Creating frame in java
import java.awt.*;
class FrameDemo4 extends Frame
  {
     public void paint(Graphics g)
      {
        Font f1 = new Font("Times New Roman" , Font.BOLD ,24);
        setBackground(Color.cyan);
        setForeground(Color.red);
        g.drawString("Welcome to World of Sarthak",150,250);
      }
    public static void main(String args[])
      {
        FrameDemo4 f1 = new FrameDemo4();
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setTitle("FrameDemo4");
      }
  }