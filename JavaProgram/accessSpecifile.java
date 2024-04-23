class A{
    // private
    private int a = 10;
    private String b = "Hello Mohan";

    private void fun1(){
        System.out.println("Private function");
        System.out.println("First:"+a+" "+"Second:"+b);
    }
    public static void fun2(){
        System.out.println("Inside or private class make public function");
        System.out.println("First:"+a+" "+"second:"+b);
    }
}
public class accessSpecifile {
    A obj1 = new A();
    // obj1.fun1(); //error
    // obj1.fun2();
    // System.out.println(obj1.a) //error


}
