class A{
    void fun1(){
        System.out.println("This is function 1");
    }
}
class B extends A{
    void fun2(){
        System.out.println("This is function 2");
    }
}
class C extends A{
    void fun3(){
        System.out.println("This is function 3");
    }
}
public class hieriracalInheritacne {
    public static void main(String[] args){
        B obj1 = new B();
        obj1.fun1();
        obj1.fun2();
        
        C obj2 = new C();
        obj2.fun1();
        obj2.fun3();
    }
}
