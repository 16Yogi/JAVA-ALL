public class instance_initializer_block {
    int a;
    instance_initializer_block(){
        System.out.println("Output:"+a);
    }    
    {
        a=4840;
        a=780;
    }
    public static void main(String[] args){
        instance_initializer_block obj1 = new instance_initializer_block();
        instance_initializer_block obj2 = new instance_initializer_block();
    }

}
