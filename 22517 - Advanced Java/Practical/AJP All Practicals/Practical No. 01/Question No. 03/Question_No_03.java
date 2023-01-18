import java.awt.Button;
import java.awt.Frame;

public class Question_No_03{
	Question_No_03(){
		Frame f = new Frame();
		f.setTitle("Button");
		
		Button b1 = new Button("OK");
		b1.setBounds(50,100,100,30);
		Button b2 = new Button("RESET");
		b2.setBounds(170,100,100,30);
		Button b3 = new Button("CANCEL");
		b3.setBounds(290,100,100,30);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new Question_No_03();
	}
}