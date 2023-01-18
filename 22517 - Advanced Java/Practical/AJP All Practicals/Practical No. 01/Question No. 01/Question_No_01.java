import java.awt.Label;
import java.awt.Frame;

public class Question_No_01{
    Question_No_01(){
        Frame f = new Frame();
        f.setTitle("Label");

        Label l = new Label("Welcome to Java",Label.CENTER);
        
        f.add(l);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Question_No_01();
    }
}