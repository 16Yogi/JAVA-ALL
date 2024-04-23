import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class wordCounter implements ActionListener{
    JLabel l1,l2;
    JTextArea area;
    JButton b1;

    wordCounter(){
        JFrame fr = new JFrame();
        
        l1 = new JLabel();
        l1.setBounds(50,25,100,40);
        l2 = new JLabel();
        l2.setBounds(150,25,130,40);
        area =new JTextArea();
        area.setBounds(50,50,300,250);
        b1=new JButton("Count");
        b1.setBounds(50,300,50,50);
        
        b1.addActionListener(this);
        
        fr.add(l1);
        fr.add(l2);
        fr.add(area);
        fr.add(b1);

        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String text = area.getText();
        String words[] = text.split("\\s");
        l1.setText("Words:"+words.length);
        l2.setText("Characters:"+text.length());
    }
    public static void main(String[] args){
        new wordCounter();
    }
}
