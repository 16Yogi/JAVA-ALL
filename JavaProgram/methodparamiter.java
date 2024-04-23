public class methodparamiter {
    static void fun(int age,String name){
        System.out.println("Full Name:"+name);
        System.out.println("Age:"+age);        
    }
    static int retun_fun(int age){
        if(age>18){
            return age;
        }else{
            return age;
        }
        
    }
    public static void main(String args[]){
        fun(20,"Ramlal");
        fun(18,"Krishna");
        
        System.out.println(retun_fun(10));
    }
    
}
