import java.awt.Frame;
import java.awt.List;

public class Question_No_01{
	Question_No_01(){
		Frame f = new Frame();
		f.setTitle("List");
		
		List l = new List(3);
		l.setBounds(100,100,100,200);
		
		l.add("Pune");
		l.add("Ahmednagar");
		l.add("Nashik");
		l.add("Mumbai");
		l.add("Delhi");
		l.add("Latur");
		l.add("Kolhapur");
		l.add("Beed");
		l.add("Chennai");
		l.add("Satara");
		
		f.add(l);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new Question_No_01();
	}
}