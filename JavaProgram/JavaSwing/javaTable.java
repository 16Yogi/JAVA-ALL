import javax.swing.*;
public class javaTable{
    public static void main(String[] args){
        JFrame fr = new JFrame();
        
        String data[][]={
            {"1","Mohan","456"},
            {"2","Sohan","623"},
            {"3","Shaym","789"}
        };
        String col[]={"ID","Name","Paisa"};

        JTable t = new JTable(data,col);
        t.setBounds(10,20,350,300);
        
        fr.add(t);

        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);
    }
}