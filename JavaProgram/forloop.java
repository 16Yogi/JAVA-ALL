import java.util.*;
public class forloop {
    public static void main(String args[]){
        System.out.println("For loop in Java");
        System.out.println("================================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value:");
        int a = sc.nextInt();

        for(int i=0;i<=a;i++){
            System.out.println("Result:"+i);
        }
        for(int aa=1;aa<=10;aa++){
            for(int b=1;b<=10;b++){
                System.out.print(aa*b+" ");
            }
            System.out.println();

        }
    }
}
