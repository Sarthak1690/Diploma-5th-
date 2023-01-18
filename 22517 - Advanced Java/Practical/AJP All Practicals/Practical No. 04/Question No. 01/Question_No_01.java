import java.awt.*;

public class Question_No_01{
    Question_No_01(){
        Frame f = new Frame();
        f.setTitle("GridBag Layout Example");

        f.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        g.fill = GridBagConstraints.HORIZONTAL;

        Button b1 = new Button("Button One");
        g.gridx = 0;
        g.gridy = 0;
        f.add(b1, g);

        Button b2 = new Button("Button two");
        g.gridx = 1;
        g.gridy = 0;
        f.add(b2, g);

        g.fill = GridBagConstraints.HORIZONTAL;
        g.ipady = 20;

        Button b3 = new Button("Button Three");
        g.gridx = 0;
        g.gridy = 1;
        f.add(b3, g);

        Button b4 = new Button("Button Four");
        g.gridx = 1;
        g.gridy = 1;
        f.add(b4, g);

        g.fill = GridBagConstraints.HORIZONTAL;

        Button b5 = new Button("Button Five");
        g.gridx = 0;
        g.gridy = 2;
        g.gridwidth = 3;
        g.gridheight = 2;
        f.add(b5, g);

        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Question_No_01();
    }
}