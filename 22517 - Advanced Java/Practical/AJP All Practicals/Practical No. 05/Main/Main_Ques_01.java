import java.awt.*;

public class Main_Ques_01{
    Main_Ques_01(){
        Frame f = new Frame("Menubar");
        MenuBar b = new MenuBar();

        Menu m = new Menu("Colors");

        MenuItem i1 = new MenuItem("Red");
        MenuItem i2 = new MenuItem("Blue");
        MenuItem i3 = new MenuItem("Green");
        MenuItem i4 = new MenuItem("Black");
        MenuItem i5 = new MenuItem("Violet");

        //Disabling the black color
        i4.setEnabled(false);

        m.add(i1);
        m.add(i2);
        m.add(i3);
        m.add(i4);
        m.add(i5);

        b.add(m);

        f.setMenuBar(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Main_Ques_01();
    }
}