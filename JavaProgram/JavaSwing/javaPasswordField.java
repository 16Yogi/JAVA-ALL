import javax.swing.*;

public class javaPasswordField {
    public static void main(String[] args){
        JFrame fr = new JFrame("Java Password Field");
        
        JLabel l1 = new JLabel("Enter your password");
        l1.setBounds(50,25,100,30);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(50,50,100,30);

        fr.add(l1);
        fr.add(pf);

        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);

    }    
}
