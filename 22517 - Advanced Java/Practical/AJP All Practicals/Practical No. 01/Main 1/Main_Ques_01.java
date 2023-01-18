import java.awt.*;

public class Main_Ques_01 {
    public Main_Ques_01() {
        Frame f = new Frame();
        f.setTitle("Checkbox and RadioButton");

        Checkbox c1 = new Checkbox("Apple",true);
        Checkbox c2 = new Checkbox("Mango",false);
        Checkbox c3 = new Checkbox("Grapes",false);
        Checkbox c4 = new Checkbox("Guava",false);

        CheckboxGroup ch = new CheckboxGroup();
        Checkbox r1 = new Checkbox("Male",true,ch);
        Checkbox r2 = new Checkbox("Female",false,ch);
        Checkbox r3 = new Checkbox("Other",false,ch);

        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(r1);
        f.add(r2);
        f.add(r3);

        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Main_Ques_01();
    }
}
