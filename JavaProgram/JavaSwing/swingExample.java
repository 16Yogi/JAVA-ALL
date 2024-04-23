import javax.swing.*;
public class swingExample {
    public static void main(String[] args){
        JFrame f;
        f = new JFrame();

        JButton b = new JButton("Click me");
        b.setBounds(100,150,100,60);
        f.add(b);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
