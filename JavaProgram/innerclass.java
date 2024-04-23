class A {
    int a = 10;
    class B {
        int b = 30;
    }
}

public class innerclass {
    public static void main(String[] args) {
        innerclass innerClass = new innerclass();
        innerClass.printSum();
    }

    public void printSum() {
        A obj1 = new A();
        A.B obj2 = obj1.new B();
        System.out.println(obj1.a + obj2.b);
    }
}
