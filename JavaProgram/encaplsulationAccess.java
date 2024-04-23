// import createpkg.*;
// public class encaplsulationAccess {
//     public static void main(String[] args){
//         encaplsulationAccess obj = new encaplsulationAccess();
//         obj.setAcc_no(7491861465418L);

//         System.out.println(getAcc_name());
        
//     }
// }  



public class encaplsulationAccess{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public encaplsulationAccess(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void output(){
        System.out.println("Student Name:"+name);
        System.out.println("Student Age:"+age);
    }
    public static void main(String args[]){
        System.out.println("Encapsulation java");
        encaplsulationAccess obj = new encaplsulationAccess("Mohan pandey",69);
        obj.output();
    }
}