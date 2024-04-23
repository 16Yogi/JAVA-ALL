class A{
    void fun(){
        System.out.println("This is my A class function");
    }
}
class B extends A{
    void fun(){
        System.out.println("This is my B class function");
    }
}
public class methodOverriding {
    public static void main(String[] args){
        B obj = new B();
        obj.fun();
        A obj2 = new A();
        obj2.fun();
    }    
}
