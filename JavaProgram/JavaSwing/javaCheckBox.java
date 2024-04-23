import javax.swing.*;
public class javaCheckBox {
    public static void main(String[] args){
        JFrame fr = new JFrame();
        
        JLabel l1 = new JLabel("Java:");
        l1.setBounds(50,25,70,40);
        JCheckBox rb1 = new JCheckBox();
        rb1.setBounds(100,25,70,40);

        fr.add(l1);
        fr.add(rb1);


        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);
    }
}
