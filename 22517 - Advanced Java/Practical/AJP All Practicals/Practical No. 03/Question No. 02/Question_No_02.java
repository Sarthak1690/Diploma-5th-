import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;

public class Question_No_02{
	Question_No_02(){
		Frame f = new Frame();
		f.setTitle("GridLayout");
		
		GridLayout g = new GridLayout(4,3);
		f.setLayout(g);
		
		int i;
		for(i=0;i<=9;i++){
			f.add(new Button(""+i));
		}
		
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new Question_No_02();
	}
}