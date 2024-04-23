public class javaExceptionDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        try{
            int result = dividend/divisor;
            System.out.println("Your answer is:"+result);
        }catch(ArithmeticException e){
            System.out.println("Divisor can't be 0!!");
        }
    }
}