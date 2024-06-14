/*Define a Java class Person with instance variables name (private), age (protected), and address (default/package-private). Provide getter and setter methods 
 for name and demonstrate accessing age and address from a subclass in a different package.
 */

package constructors;
public class Person {
    private String name;
    protected int age;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class SubPerson extends Person {
    public static void main(String[] args) {
        SubPerson person = new SubPerson();
        person.age = 25;
        person.address = "123 Main St";
        person.setName("John Doe");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.age);
        System.out.println("Address: " + person.address);
    }
}
