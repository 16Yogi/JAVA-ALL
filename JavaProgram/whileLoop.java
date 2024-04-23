import java.util.*;
public class whileLoop {
    public static void main(String[] args){
        System.out.println("While loop in Java");
        System.out.println("==============================");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length:");
        int j = sc.nextInt();
        int i=0;
        while(i<=j){
            System.out.println(i);
            i++;
        }
    }
}
