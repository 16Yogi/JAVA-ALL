// abstract class A{
//     void fun1(){
//         System.out.println("Hello I am Function 1");
//     }
//     abstract void fun2();
// }
// // class B extends A{
// //     void fun2(){
// //         System.out.println("Function 2 inside of B class");
// //     }
// // }
// public class abstraction extends A {
//     void fun2(){
//         System.out.println("Hello I am function 2 inside of main class");
//     }
//     // B obj = new B();
//     // obj.fun1();
//     // obj.fun2();

//     A obj = new abstraction();
//     obj.fun2();

// }



abstract class A {
    void fun1() {
        System.out.println("Hello I am Function 1");
    }

    abstract void fun2();
}

public class abstraction extends A {
    void fun2() {
        System.out.println("Hello I am function 2 inside of main class");
    }

    public static void main(String[] args) {
        abstraction obj = new abstraction();
        obj.fun1();
        obj.fun2();
    }
}
