import java.util.*;

import javax.swing.*;
public class javaButton {
    public static void main(String[] args){
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Java Button");
        b.setBounds(130,100,100,50);
        f.add(b);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
