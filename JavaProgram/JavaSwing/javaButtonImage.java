import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class javaButtonImage {
    public static void main(String[] args){
        JFrame fr = new JFrame("BUtton IMg");
        
        JTextField tf = new JTextField("");
        tf.setBounds(120,60,150,30);
        fr.add(tf);

        JButton b = new JButton("Click me");
        b.setBounds(120,100,150,30);
        fr.add(b);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Here there, Where are you !");
            }
        });

        JButton b2 = new JButton(new ImageIcon("C:\\Users\\yogen\\Desktop\\Data\\MCA\\2sem\\Java\\Java Program\\JavaSwing"));
        b2.setBounds(120,150,200,100);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        fr.add(b2);

        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);
    }    
}
