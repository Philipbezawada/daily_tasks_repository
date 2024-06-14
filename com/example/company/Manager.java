/*Define a class Manager in the package com.example.company. Attempt to create an object of this 
 class from a different package and observe the compilation result.
 */
package com.example.company;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        com.example.other.OtherPackage otherPackage = new com.example.other.OtherPackage();
        otherPackage.testManager();
    }
}
