import java.awt.Checkbox;
import java.awt.Frame;

public class Question_No_02{
    Question_No_02(){
        Frame f = new Frame();
        f.setTitle("Checkbox");

        Checkbox c1 = new Checkbox("Marathi",true);
        c1.setBounds(50,100,100,30);
        Checkbox c2 = new Checkbox("Hindi",false);
        c2.setBounds(50,150,100,30);
        Checkbox c3 = new Checkbox("English",false);
        c3.setBounds(50,200,100,30);
        Checkbox c4 = new Checkbox("Sanskrit",false);
        c4.setBounds(50,250,100,30);

        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);

        f.setSize(500,500);
		f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Question_No_02();
    }
}