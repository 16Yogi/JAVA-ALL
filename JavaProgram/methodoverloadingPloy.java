class A{
    void fun(int age){
        if(age>=18){
            System.out.println("Hey! Young man welcome");
        }else{
            System.out.println("Hey! chaild Your are not eligible");
        }
    }
}
class B{
    void fun(String name){
        System.out.println("Name:"+name);
    }
}
class C{
    void fun(float salar){
        System.out.println("Result:"+salar);
    }
}

class D{
    void fun1(int aa){
        System.out.println("Output"+aa);
    }
    void fun1(String bb){
        System.out.println("Output:"+bb);
    }
    void fun1(float cc){
        System.out.println("Output:"+cc);
    }
}
public class methodoverloadingPloy {
    public static void main(String[] args){
        A objA = new A();
        B objB = new B();
        C objC = new C();
        objA.fun(78);
        D objD = new D();
        objD.fun1(8878F);
        
    }
}
