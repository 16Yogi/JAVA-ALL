import javax.swing.*;

public class javaTextField{
    public static void main(String[] args){
        JFrame fr = new JFrame("Java Text Field");
        
        JTextField tf = new JTextField("Hello I am text Field");
        tf.setBounds(100,150,150,40);
        fr.add(tf);
        

        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);
    }
}