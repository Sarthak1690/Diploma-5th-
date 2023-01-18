import java.awt.Frame;
import java.awt.List;

public class Question_No_02{
	Question_No_02(){
		Frame f = new Frame();
		f.setTitle("List");
		
		List l = new List(3,true);
		l.setBounds(100,100,100,150);
		
		l.add("Lokmat");
		l.add("Sakal");
		l.add("Divya Marathi");
		l.add("Dainik");
		l.add("Bhaskar");
		l.add("Punya Nagari");
		l.add("Indian Times");
		
		f.add(l);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new Question_No_02();
	}
}