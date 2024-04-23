class A{
    void fun1(){
        System.out.println("I am first function");
    }
}
public class singleInheritance extends A {
    void fun2(){
        System.out.println("Hello I am second function");
    }
    public static void main(String[] args){
        singleInheritance obj = new singleInheritance();
        obj.fun1();
        obj.fun2();
    }
}
