import java.util.*;
import javax.swing.*;
public class javaTextArea {
    public static void main(String[] args){
        JFrame fr = new JFrame();

        JTextArea ta = new JTextArea();
        ta.setBounds(50,50,400,300);

        fr.add(ta);
        
        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);
    }
}
