/*Write a Java class Student with a default constructor that
initializes name to "Unknown" and age to 0. Create an object
of this class and print its name and age.*/



package constructors;
public class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "Jack";
        this.age = 30;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}
