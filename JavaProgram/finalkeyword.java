public class finalkeyword {
    final int A = 4545;
    void fun(){
        // A=780;
        System.out.println("Print this:"+A);
        A=7844;
        System.out.println("Print this:"+A);

    }

    public static void main(String[] args){
        finalkeyword obj = new finalkeyword();
        obj.fun();
    }

    
}
