import javax.swing.*;

public class mypractice {
    public static void main(String[] args){
        // create frame
        JFrame frame = new JFrame("My Practice");
        
        // create button on top side
        JButton button1 = new JButton("Preview");
        button1.setBounds(0,10,100,30);
        JButton button2 = new JButton("Next");
        button2.setBounds(370,10,100,30);

        frame.add(button1);
        frame.add(button2);

        // create headline
        JLabel headline = new JLabel("Hey! Welcome here....");
        headline.setBounds(15,40,200,30);
        frame.add(headline);


        // form label
        JLabel luser = new JLabel("Username");
        luser.setBounds(15,65,200,30);
        frame.add(luser);

        JTextField Iuser = new JTextField("Username");
        Iuser.setBounds(15,95,200,30);
        frame.add(Iuser);

        JLabel lpassword = new JLabel("Password");
        lpassword.setBounds(15,125,200,30);
        frame.add(lpassword);

        JTextField Ipassword = new JTextField("Password");
        Ipassword.setBounds(15,155,200,30);
        frame.add(Ipassword); 

        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);


    }
}
