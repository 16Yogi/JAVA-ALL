import java.util.*;
class myclass{
    int a = 10;
    int b = 20;
    int c;
}
public class proclass {
    int a=20;
    public static void main(String args[]){
        myclass obj = new myclass();
        proclass obj2 = new proclass();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value:");
        obj.c=sc.nextInt();

        System.out.println("HEllo");
        System.out.println("Access the class member");
        System.out.println("Result:"+obj2.a);
        System.out.println("Result:"+obj.a);
        System.out.println("User INput:"+obj.c);

    }    
}
