public class detailsstu {
    // private variables
    private String name;
    private int age;
    private String department;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Constructor
    public detailsstu(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        // Creating a new Student object
        detailsstu student1 = new detailsstu("John", 20, "Computer Science");

        // Accessing private variables using getter methods
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Department: " + student1.getDepartment());

        // Modifying private variables using setter methods
        student1.setAge(21); // valid age
        student1.setAge(-5); // invalid age

        // Displaying information using display method
        student1.displayInfo();
    }
}

