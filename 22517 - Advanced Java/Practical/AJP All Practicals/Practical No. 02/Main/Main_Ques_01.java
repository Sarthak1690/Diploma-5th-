import java.awt.*;
import java.applet.*;

public class Main_Ques_01 extends Applet {
    public void init() {
        List l = new List(3);
        l.add("Summer");
        l.add("Winter");
        l.add("Rainy");

        add(l);
    }

    public static void main(String[] args) {
        new Main_Ques_01();
    }
}

/*
 * <applet code = "Main_Ques_01.class" width = "500" height = "500">
 * </applet>
 */