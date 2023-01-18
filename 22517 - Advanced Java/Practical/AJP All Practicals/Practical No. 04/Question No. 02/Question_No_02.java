import java.awt.*;

public class Question_No_02{
    Question_No_02(){
        Frame f = new Frame();
        f.setTitle("GridBagLayout in Java Example");

        f.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        
        Label l1 = new Label("     Name");
        g.gridx = 0;
        g.gridy = 0;
        f.add(l1, g);
        
        g.ipadx = 40;
        TextField t1 = new TextField();
        g.insets = new Insets(10,10,10,10);
        g.gridx = 1;
        g.gridy = 0;
        f.add(t1,g);

        g.ipadx = 0;
        Label l2 = new Label("Comments");
        g.gridx = 0;
        g.gridy = 1;
        f.add(l2, g);


        TextArea t2 = new TextArea();
        g.gridx = 1;
        g.gridy = 1;
        f.add(t2,g);

        Button b = new Button("Submit");
        g.gridx = 1;
        g.gridy = 2;
        f.add(b,g);

        f.setSize(800, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Question_No_02();
    }
}