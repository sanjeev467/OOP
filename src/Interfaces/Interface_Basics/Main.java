package Interfaces.Interface_Basics;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Output: Barking...
        dog.sleep();  // Output: Sleeping...

        // Calling static method from interface
        Animal.info();  // Output: This is an animal interface.

        // Accessing the constant from the interface
        System.out.println("A dog has " + Animal.LEGS + " legs.");  // Output: A dog has 4 legs.
    }
}
