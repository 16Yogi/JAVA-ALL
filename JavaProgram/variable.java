import java.util.*;
public class variable{
    public static void main(String args[]){
        System.out.println("Variable in java");
        System.out.println("===============================================");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int value:");
        int a = sc.nextInt();
        System.out.print("Enter float value:");
        float b = sc.nextFloat();
        System.out.print("Enter char value:");
        char c = sc.next().charAt(0);
        System.out.print("Enter float value:");
        float d = sc.nextFloat();
        System.out.print("Enter double value:");
        double e = sc.nextDouble();

        System.out.println("Result");
        System.out.println("===============================================");
        System.out.println("Result:"+a);
        System.out.println("Result:"+b);
        System.out.println("Result:"+c);
        System.out.println("Result:"+d);
        System.out.println("Result:"+e);
    }
}