class A{
    String a = "Hello";
}
class B extends A{
    String a = "Hi";

    void colorprint(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class keywordSuper {
    public static void main(String[] args){
        System.out.println("Super keyword");

        B obj = new B();
        obj.colorprint();
    }
    
}
