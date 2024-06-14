package com.example;

import com.example.operations.CRUDOperations;

public class Main {

    public static void main(String[] args) {
        // Create a new user
//        CRUDOperations.createUser("john", "password123");

        // Retrieve user by ID
        CRUDOperations.getUserById(2L);
//
//        // Update user password
//        CRUDOperations.updateUser(2L, "newpassword123");
////
//        // Delete user by ID
//        CRUDOperations.deleteUser(1L);
    }
}
