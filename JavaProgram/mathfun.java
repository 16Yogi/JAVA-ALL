import java.util.*;
public class mathfun {
    public static void main(String args[]){
        System.out.println("Math function in java");
        System.out.println("==================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value:");
        int a = sc.nextInt();
        System.out.print("Enter second value:");
        int b = sc.nextInt();

        int aa = Math.max(a,b);
        int bb = Math.min(a,b);
        double cc = Math.sqrt(a);
        double dd = Math.random();

        System.out.println("Result:"+aa);
        System.out.println("Result:"+bb);
        System.out.println("Result:"+cc);
        System.out.println("Result:"+dd);
    }    
}
