import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class passwordActionEvent {
    public static void main(String[] args){
        JFrame fr = new JFrame();

        JLabel l1 =new JLabel("Username");
        l1.setBounds(50,25,100,30);
        JTextField tf1 = new JTextField();
        tf1.setBounds(50,70,100,30);
        JLabel l2 = new JLabel("Password");
        l2.setBounds(50,120,100,30);
        JPasswordField pf1 = new JPasswordField();
        pf1.setBounds(50,160,100,30);
        JButton b1 = new JButton("Login");
        b1.setBounds(50,200,100,30);
        JLabel l3 = new JLabel();
        l3.setBounds(50,250,100,30);
        JLabel l4 = new JLabel();
        l3.setBounds(50,300,100,30);

        fr.add(l1);
        fr.add(tf1);
        fr.add(l2);
        fr.add(pf1);
        fr.add(b1);

        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String data = "Username:"+tf1.getText();
                data +=",Password:"
                + new String(pf1.getPassword());
                l4.setText(data);
            }
        });
    }
}
