import createpkg.*;
public class mainpkg{
    public static void main(String[] args){
        System.out.println("Java PKG");
        pkg obj1 = new pkg();
        obj1.fun6();

        // protected access
        // protectedaccc obj2 = new protectedaccc();
        // obj2.fun1();

        // public access
        publicaccess obj3 = new publicaccess();
        obj3.fun2();

        // default
        defaultaccess obj4 = new defaultaccess();
        obj4.fun4();
    }
}
