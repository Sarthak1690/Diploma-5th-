
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Main_Ques_02 extends Applet implements KeyListener
{
    String msg = "";

    public void init()
    {
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent k)
    {
        int key = k.getKeyCode();

        switch(key)
        {
            case KeyEvent.VK_F1:
                msg = msg + "F1 ";
                break;
            case KeyEvent.VK_F2:
                msg = msg + "F2 ";
                break;
            case KeyEvent.VK_F3:
                msg = msg + "F3 ";
                break;
            case KeyEvent.VK_F4:
                msg = msg + "F4 ";
                break;
            case KeyEvent.VK_RIGHT:
                msg = msg + "RIGHT ";
                break;
            case KeyEvent.VK_LEFT:
                msg = msg + "LEFT ";
                break;
            case KeyEvent.VK_UP:
                msg = msg + "UP ";
                break;

            case KeyEvent.VK_DOWN:
                msg = msg + "DOWN ";
                break;

        }

        repaint();
    }

    public void keyReleased(KeyEvent k){}

    public void keyTyped(KeyEvent k){}

    public void paint(Graphics g)
    {
        g.drawString(msg, 10, 10);
    }
}

/*
<applet code = "Main_Ques_02.class" width = "500" height = "500">
</applet>
 */