import java.util.*;
public class paramiterConstructor {
    paramiterConstructor(int c,int d){
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First value:");
        a = sc.nextInt();
        System.out.print("Second value:");
        b = sc.nextInt();
        System.out.println("Result:"+(a+c)+" "+(b+d));
    }    

    public static void main(String[] args){
        paramiterConstructor obj = new paramiterConstructor(10,20);
        
    }
}
