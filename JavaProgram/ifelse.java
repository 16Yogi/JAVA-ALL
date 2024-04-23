import java.util.*;
public class ifelse {
    public static void main(String args[]){
        System.out.println("If else statement in java");
        System.out.println("==============================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Hey! Younger man welcome here...!");
        }else if(age>18){
            System.out.println("Hey! Little you are not eligibale");
        }else if(age<=30){
            System.out.println("Hey! Extra meture peple welcome here");
        }else if((age<=50) && (age>=160)){
            System.out.println("Hey! Old citizen, very warn welcome");
        }else{
            System.out.println("No age found");
        }
    }    
}
