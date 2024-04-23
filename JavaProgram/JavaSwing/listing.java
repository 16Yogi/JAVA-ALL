import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class listing {
    public static void main(String[] args){
        Frame fr = new Frame("Listing function");

        JButton b1 = new JButton("Click me");
        b1.setBounds(50,75,100,50);
        
        fr.add(b1);
        
        b1.addActionListener(new ActionListener(){
            
        });

        fr.setLayout(null);
        fr.setSize(600,600);
        fr.setVisible(true);
    }
    
}
