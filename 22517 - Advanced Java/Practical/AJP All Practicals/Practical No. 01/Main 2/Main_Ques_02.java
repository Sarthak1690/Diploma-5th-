import java.awt.*;

public class Main_Ques_02{
    Main_Ques_02(){
        Frame f = new Frame();
        f.setTitle("Form");

        Font f1 = new Font("Times New Roman",Font.BOLD,22);
        Font f2 = new Font("Times New Roman",Font.BOLD,16);
        Font f3 = new Font("Times New Roman",Font.PLAIN,14);

        Label l1 = new Label("Login Form");
        l1.setForeground(Color.red);
        l1.setFont(f1);
        l1.setBounds(170,70,150,30);

        Label l2 = new Label("Name: ");
        l2.setForeground(Color.black);
        l2.setFont(f2);
        l2.setBounds(70,120,50,30);
        TextField t1 = new TextField();
        t1.setFont(f3);
        t1.setBounds(130, 120, 250, 30);

        Label l3 = new Label("Branch: ");
        l3.setForeground(Color.black);
        l3.setFont(f2);
        l3.setBounds(70,170,70,30);
        TextField t2 = new TextField();
        t2.setFont(f3);
        t2.setBounds(140, 170, 250, 30);

        Label l4 = new Label("Email: ");
        l4.setForeground(Color.black);
        l4.setFont(f2);
        l4.setBounds(70,220,50,30);
        TextField t3 = new TextField();
        t3.setFont(f3);
        t3.setBounds(130, 220, 250, 30);

        Label l5 = new Label("About Yourself: ");
        l5.setForeground(Color.black);
        l5.setFont(f2);
        l5.setBounds(70,270,130,30);
        TextArea t4 = new TextArea();
        t4.setFont(f3);
        t4.setBounds(130, 300, 250, 200);

        Button b = new Button("Submit");
        b.setBounds(180,550,150,50);
        
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(l4);
        f.add(t3);
        f.add(l5);
        f.add(t4);
        f.add(b);

        f.setSize(500,800);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Main_Ques_02();
    }
}