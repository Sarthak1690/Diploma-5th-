import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;

public class Question_No_03{
	Question_No_03(){
		Frame f = new Frame();
		f.setTitle("GridLayout");
		
		GridLayout g = new GridLayout(3,2,20,20);
		f.setLayout(g);
		
		int i;
		for(i=1;i<=5;i++){
			f.add(new Button("Button "+i));
		}
		
		f.setSize(800,300);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new Question_No_03();
	}
}