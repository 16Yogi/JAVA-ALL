import java.util.*;
public class booleanpro {
    public static void main(String args[]){
        System.out.println("Boolean Program in Java");
        // Declare a Boolean variable and
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter first value:");
        int a = sc.nextInt();
        System.out.print("Enter second value:");
        int b = sc.nextInt();
        Boolean aa=true;
        Boolean bb=false;
        int cc = 1;
        int dd =0;

        System.out.println("Result:"+(a>b));
        System.out.println("Result:"+(a==b));
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);
    }
}
