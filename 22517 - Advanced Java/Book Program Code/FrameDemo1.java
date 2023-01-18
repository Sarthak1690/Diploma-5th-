// Creating frame in java
  import java.awt.*;
     class FrameDemo1 extends FrameDemo 
       {
          FrameDemo1()
            {
                setVisible(true);
                setSize(500,500);
                setTitle("FrameDemo1");
            }
           public static void main(String[] args)
             {
                FrameDemo1 f1 = new FrameDemo1();
             }
       }