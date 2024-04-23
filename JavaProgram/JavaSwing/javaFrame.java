// import java.awt.event.ActionListener;
// import java.util.*;
// import javax.swing.*;
// public class javaFrame {
//     public static void main(String[] args){
//         JFrame fr = new JFrame("Text Label");

//         JLabel l1 = new JLabel("User Name");
//         l1.setBounds(120,60,150,40);

//         JTextField tf1 = new JTextField("");
//         tf1.setBounds(120,90,150,40);

//         JLabel l2 = new JLabel("Password");
//         l2.setBounds(120,120,150,40);

//         JTextField tf2 = new JTextField("Password");
//         tf2.setBounds(120,150,150,40);

//         JButton b1 = new JButton("Login Here");
//         b1.setBounds(120,190,150,40);

//         b1.addActionListener(new ActionListener(){
//             public void actionPerformed(ActionEvent e){
//                 tf1.setText("Here there, Where are you !");
//             }
//         });

//         // ButtonHandler handler = new ButtonHandler();
//         fr.add(tf2);
//         fr.add(l2);
//         fr.add(tf1);
//         fr.add(l1);
//         fr.add(b1);

//         fr.setSize(600,600);
//         fr.setLayout(null);
//         fr.setVisible(true);
//     }
// }



import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
public class javaFrame {
    public static void main(String[] args){
        JFrame fr = new JFrame("Text Label");

        JLabel l1 = new JLabel("User Name");
        l1.setBounds(120,60,150,40);

        JTextField tf1 = new JTextField("");
        tf1.setBounds(120,90,150,40);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(120,120,150,40);

        JTextField tf2 = new JTextField("Password");
        tf2.setBounds(120,150,150,40);

        JButton b1 = new JButton("Login Here");
        b1.setBounds(120,190,150,40);

        // b1.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e){
        //         tf1.setText("Here there, Where are you!");
        //     }
        // });

        // ButtonHandler handler = new ButtonHandler();
        fr.add(tf2);
        fr.add(l2);
        fr.add(tf1);
        fr.add(l1);
        fr.add(b1);

        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);
    }
}