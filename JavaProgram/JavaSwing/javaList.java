import javax.swing.*;
public class javaList {
    javaList(){
        JFrame fr = new JFrame();
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item 1");
        l1.addElement("Item 2");

        JList<String> list = new JList<>(l1);
        list.setBounds(100,100,75,75);

        fr.add(list);
        fr.setSize(400,400);
        fr.setLayout(null);
        fr.setVisible(true);
    }

    public static void main(String[] args){
        new javaList();
    }
}
