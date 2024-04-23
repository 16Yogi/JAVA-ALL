import javax.swing.*;

public class loginform{
    public static void main(String[]args){
        JTextField t1,t2;  
        
        JFrame f = new JFrame("Login form");

        JLabel l1, l2;
        l1 = new JLabel("User Name");
        l1.setBounds(50,50,100,30);
        
        t1=new JTextField("User Name");
        t1.setBounds(50,100,100,30);
                
        l2 = new JLabel("Password");
        l2.setBounds(50,150,100,30);
        
        t2 = new JTextField("Password");
        t2.setBounds(50,200,100,30);

        f.add(l1); f.add(l2);  
        f.setSize(300,300);  

        JButton b = new JButton("Login");
        b.setBounds(50,320,100,40);
        
        f.add(t1); f.add(t2);  
        f.add(b);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
 
    }
}