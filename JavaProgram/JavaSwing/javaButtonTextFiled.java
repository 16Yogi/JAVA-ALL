import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class javaButtonTextFiled {
    public static void main(String[] args){
        JFrame fr = new JFrame("Button and Text Input");
        
        final JTextField tf = new JTextField();
        tf.setBounds(130,100,100,30);
        
        JButton b = new JButton("Click me");
        b.setBounds(130, 150, 100, 30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to java");
            }
        });
        fr.add(tf);
        fr.add(b);
        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);


    }
}
