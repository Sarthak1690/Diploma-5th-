import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Question_No_02 extends JFrame
{
    public static void main(String[] args) {
        Question_No_02 ai = new Question_No_02();

        JButton jb = new JButton(" Don't Click Me Bro ");

        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                System.out.println("Action Event:"+ae);
            }
        });

        ai.add(jb);
        ai.pack();
        ai.setSize(400,400);
        ai.setVisible(true);
    }
}