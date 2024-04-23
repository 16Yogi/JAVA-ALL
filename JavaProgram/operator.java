import java.util.*;
public class operator {
    public static void arth(){
        System.out.println("Arithmetic Operator");
        System.out.println("=====================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value:");
        int a = sc.nextInt();
        System.out.print("Enter second value:");
        int b = sc.nextInt();

        System.out.println("Result");
        System.out.println("=====================================");
        System.out.println("Result:"+(a+b));
        System.out.println("Result:"+(a-b));
        System.out.println("Result:"+(a*b));
        System.out.println("Result:"+(a/b));
        System.out.println("Result:"+(a%b));

    }

    public static void ass(){
        System.out.println("Assingment Operator");
        System.out.println("=====================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value:");
        int a = sc.nextInt();

        System.out.println("Result");
        System.out.println("=====================================");
        a+=5;
        System.out.println("Result:"+a);
        a-=2;
        System.out.println("Result:"+a);
        a*=5;
        System.out.println("Result:"+a);
        a/=2;
        System.out.println("Result:"+a);
        a%=3;
        System.out.println("Result:"+a);
    }
    
    public static void com(){
        System.out.println("Comaprison Operators");
        System.out.println("=====================================");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first value:");
        int a = sc.nextInt();
        System.out.print("Enter second value:");
        int b = sc.nextInt();
        System.out.println("Result:"+(a>b));
        System.out.println("Result:"+(a<b));
        System.out.println("Result:"+(a==b));
        System.out.println("Result:"+(a<=b));
        System.out.println("Result:"+(a>=b));
        System.out.println("Result:"+(a!=b));
        System.out.println("Result:"+(a%=b));
    }

    public static void log(){
        System.out.println("Logical Operators");
        System.out.println("======================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("First value:");
        int a = sc.nextInt();
        System.out.print("Second value:");
        int b = sc.nextInt();
        System.out.println("AND:"+((a==b)&&(a!=b)));
        System.out.println("OR:"+((a==b)||(a!=b)));
        System.out.println("NOT:"+(!(a==b)));
    }

    public static void main(String args[]){
        System.out.println("Operators Program");
        System.out.println("===================================================");
        arth();
        ass();
        log();
        com();
    }
}
