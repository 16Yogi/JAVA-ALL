public class methodoverloading {
    // Function name same but diffrent paramiter
    static void fun(int a,int b){
        System.out.println("Function 1");
        System.out.println("First:"+a+" "+"Second:"+b);
    }
    static void fun(double a,double b){
        System.out.println("Function 2");
        System.out.println("First:"+a+" "+"Second:"+b);
    }
    static void fun(String a,String b){
        System.out.println("Function 3");
        System.out.println("First:"+a+" "+"Second:"+b);
    }
    public static void main(String[] args){
        System.out.println("method overloading");
        fun(10,20);// calling function 1
        fun(12.3,12.6);
        fun("Hello", "World");
    } 
}
