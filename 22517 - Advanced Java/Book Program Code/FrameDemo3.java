// Creating frame in java
  import java.awt.*;
    class FrameDemo3 extends Frame
      {
         FrameDemo3(String str)
          {
            super(str);
            setBackground(Color.cyan);
            setForeground(Color.red);
          }
        public static void main(String args[])
          {
            FrameDemo3 f1 = new FrameDemo3("My Frame");
            f1.setVisible(true);
            f1.setSize(500,500);
          }
      }
