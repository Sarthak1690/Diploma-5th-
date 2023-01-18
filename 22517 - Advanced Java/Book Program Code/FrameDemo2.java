// Creating Frame in java
  import java.awt.*;
   class FrameDemo2 extends Frame
      {
         FrameDemo2 (String str)
           {
            super(str);
           }
          public static void main(String args[])
           {
            FrameDemo2 f1 = new FrameDemo2 ("My Frame");
              f1.setVisible(true);
              f1.setSize(500,500);       
           }
      }