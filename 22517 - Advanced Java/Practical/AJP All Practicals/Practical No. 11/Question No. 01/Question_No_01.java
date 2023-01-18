import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Question_No_01 extends Applet implements MouseListener {
    public void init(){
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        setBackground(Color.RED);
    }

    public void mousePressed(MouseEvent e) {
        setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setBackground(Color.BLACK);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.CYAN);
    }

}

/*
<applet code = "Question_No_01.class" width = "500" height = "500">
</applet>
 */
