import java.util.*;
public class classmethod {
    static void idcard(){
        System.out.println("Enter information for ID card");
        System.out.println("*********************************");
        Scanner sc = new Scanner(System.in);
        String name,father_name,mother_name,blood_group,state,distic,address,mobile,email;
        int age;

        System.out.print("Full Name:");
        name=sc.next();
        System.out.print("Father Name:");
        father_name=sc.next();
        System.out.print("Mother Name:");
        mother_name=sc.next();
        System.out.print("Blood Group:");
        blood_group=sc.next();
        System.out.print("Age:");
        age=sc.nextInt();
        System.out.print("Mobile");
        mobile=sc.next();
        System.out.print("Email:");
        email=sc.next();
        System.out.print("State:");
        state=sc.next();
        System.out.print("Distric:");
        distic=sc.next();
        System.out.print("Address:");
        address=sc.next();
        
        System.out.println("Name:"+name);
        System.out.println("Father Name:"+father_name+"\t\t"+"Mother Name:"+mother_name);
        System.out.println("Age:"+age+" "+"\t\t\t"+"Blood Group:"+blood_group);
        System.out.println("Mobile:"+mobile);
        System.out.println("State:"+state+"\t\t\t"+"Dist.:"+distic);

    }
    public static void main(String[] args){
        System.out.println("ID Card");
        System.out.println("*********************************");

        idcard();
    }    
}
