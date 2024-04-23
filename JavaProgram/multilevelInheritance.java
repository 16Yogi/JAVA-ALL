class A{
    void fun1(){
        System.out.println("I am function 1");
    }
}
class B extends A{
    void fun2(){
        System.out.println("I am function 2");
    }
}
class C extends B{
    void fun3(){
        System.out.println("I am function 3");
    }
}
public class multilevelInheritance {
    public static void main(String[] args){
        C obj = new C();
        obj.fun1();
        obj.fun2();
        obj.fun3();
    }
}
