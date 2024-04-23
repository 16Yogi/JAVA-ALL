class student{
    int a;
    int b;
    int c;
    student(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;    
    }

    void display(){
        System.out.println(a+" "+b+" "+c);      
    }
}
public class thiskeyword {
    public static void main(String args[]){
        student obj1 = new student(1,2,3);
        student obj2 = new student(11,22,33);
        obj1.display();
        obj2.display();
    }
}
