package Interfaces.Interface_Basics;

// Declaring an Interface:

interface Animal {
    // Abstract method (no implementation)
    void sound();

    // Default method (provides a default implementation)
    default void sleep() {
        System.out.println("Sleeping...");
    }

    // Static method (can be called on the interface itself)
    static void info() {
        System.out.println("This is an animal interface.");
    }

    // Constant (static final variable)
    int LEGS = 4;  // By default, public, static, and final
}
