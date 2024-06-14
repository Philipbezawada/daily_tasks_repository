package com.example.other;

import com.example.company.Manager;

public class OtherPackage {
    public void testManager() {
         Manager manager = new Manager("Alice"); // Uncommenting this line will cause a compilation error
        // because Manager class is not public and cannot be accessed from another package
        System.out.println("Unable to create an instance of Manager from a different package.");
    }

    public static void main(String[] args) {
        new OtherPackage().testManager();
    }
}

