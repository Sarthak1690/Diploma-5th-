import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

public class Question_No_04{
	Question_No_04(){
		Frame f = new Frame();
		f.setTitle("BorderLayout");
		
		BorderLayout b = new BorderLayout();
		f.setLayout(b);
		
		Button b1 = new Button("North");
		Button b2 = new Button("South");
		Button b3 = new Button("East");
		Button b4 = new Button("West");
		Button b5 = new Button("Center");
		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new Question_No_04();
	}
}