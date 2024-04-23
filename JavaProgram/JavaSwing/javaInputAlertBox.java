import javax.swing.*;
public class javaInputAlertBox {
    JFrame fr;
    javaInputAlertBox(){
        fr = new JFrame();
        String name = JOptionPane.showInputDialog(fr,"Enter Your Name:");
    }
    public static void main(String[] args){
        new javaInputAlertBox();
    }
    
}
