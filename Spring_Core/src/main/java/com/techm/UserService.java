package com.techm;


public class UserService {
    private UserRepository userRepository;

    // Constructor for constructor-based DI
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Setter for setter-based DI
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Custom initialization method
    public void init() {
        System.out.println("UserService bean is being initialized");
    }

    // Custom destruction method
    public void cleanup() {
        System.out.println("UserService bean is being destroyed");
    }

    public void performService() {
        userRepository.getData();
    }
}
