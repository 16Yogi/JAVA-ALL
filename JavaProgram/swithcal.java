import java.util.*;
public class swithcal {
    public static void main(String args[]){
        System.out.println("Simple calcultor");
        System.out.println("========================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Total number:");
        int totalnum=sc.nextInt();
        System.out.print("First number:");
        int num1=sc.nextInt();
        System.out.print("Second number:");
        int num2=sc.nextInt();
        System.out.println("1. Addition\n 2. Substraction\n 3. Multiplication \n 4. Division\n 5. Modulas");
        System.out.print("Enter task:");        
        int task = sc.nextInt();
        switch(task){
            case 1:
            System.out.println("Result:"+(num1+num2));
            break;

            case 2:
            System.out.println("Result:"+(num1-num2));
            break;

            case 3:
            System.out.println("Result:"+(num1*num2));
            break;

            case 4:
            System.out.println("Result:"+(num1/num2));
            break;

            case 5:
            System.out.println("Result:"+ (num1%num2));
            break;

            default:
            System.out.println("No result found");
            break;
        }
        // for(int i=0;i<totalnum;i++){
        //     System.out.print("Enter number:");
        //     num1 = sc.nextInt();
        // }
        // num2 = 0;
        // num2 = num1;


    }
}
