// class A{
//     void fun1(){
//         System.out.println("Function 1");
//     }
// }
// class B{
//     void fun2(){
//         System.out.println("Function 2");
//     }
// }
// class C extends A, B {
//     void fun3(){
//         System.out.println("Function 3");
//     }
// }
// public class multipleInheritance {
//     public static void main(String args[]){
//         C obj = new C();
//         obj.fun1();
//         obj.fun3();
//     }
// }


interface A {
    void fun1();
}

interface B {
    void fun2();
}

class C implements A, B {
    public void fun1() {
        System.out.println("Function 1");
    }

    public void fun2() {
        System.out.println("Function 2");
    }

    void fun3() {
        System.out.println("Function 3");
    }
}

public class multipleInheritance {
    public static void main(String args[]) {
        C obj = new C();
        obj.fun1();
        obj.fun2();
        obj.fun3();
    }
}
