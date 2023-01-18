import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Question_No_03 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JButton b1;
    JTextField t1;
    JPasswordField t2;
    Question_No_03()
    {
        Container c=getContentPane();

        Font f1=new Font("Times New Roman",Font.ITALIC|Font.BOLD,30);

        setLayout(null);

        l1=new JLabel("Tech_Prashant_Suraj pvt. lmt.");
        l1.setFont(f1);
        l2=new JLabel("USERNAME");
        t1=new JTextField(20);
        l3=new JLabel("PASSWORD");
        t2=new JPasswordField(20);
        b1=new JButton("LOGIN");
        l4=new JLabel();

        l1.setBounds(150,150,400,40);
        l2.setBounds(100,220,100,20);
        t1.setBounds(220,220,100,20);
        l3.setBounds(100,250,100,20);
        t2.setBounds(220,250,100,20);
        b1.setBounds(200,300,100,20);
        l4.setBounds(100,350,300,20);

        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(t1);
        c.add(t2);
        c.add(b1);
        c.add(l4);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String un=t1.getText();
        String pass=t2.getText();
        if(pass.length()>6)
        {
            l4.setText("Password Length must be less Then 6 Characters");
        }
    }
    public static void main(String args[])
    {
        Question_No_03 ld=new Question_No_03();
        ld.setVisible(true);
        ld.setSize(500,500);
        ld.setTitle("Login Form");
    }
}
