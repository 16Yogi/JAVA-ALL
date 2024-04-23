import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;
public class javaComboBox {
    javaComboBox(){
        String state[] = {"MP","CG","MH","UK","JK"};
        JFrame fr = new JFrame("Combo Box");
        
        JLabel l1 = new JLabel("CHoose your State");
        l1.setBounds(50,25,100,30);

        JComboBox cb1 = new JComboBox(state);
        cb1.setBounds(50,65,100,30);
        
        fr.add(l1);
        fr.add(cb1);

        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);
    }
    public static void main(String[] args){
        new javaComboBox();  
    }
}
