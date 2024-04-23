import java.util.*;
public class dowhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        int j = sc.nextInt();
        int i = 0;
        do{
            System.out.println(i);
            i++;            
        }
        while(i<=j);
    }
}
