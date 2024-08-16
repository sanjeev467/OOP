package Properties.Inheritance.Single_Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();   // Create an instance of the Dog class
        dog.name = "Buddy";    // Set the inherited property
        dog.eat();             // Call the inherited method
        dog.bark();            // Call the child class's method
    }
}
