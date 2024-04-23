import java.util.*;
public class prostring {
    public static void main(String args[]){
        System.out.println("String program");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string:");
        String a = sc.next();
        System.out.println("Result:"+a);
        System.out.println("String length:"+a.length());
        System.out.println("String to upper:"+a.toUpperCase());
        System.out.println("String to lower:"+a.toLowerCase());
        System.out.println("String length:"+a.indexOf("l"));
        

    }    
}
