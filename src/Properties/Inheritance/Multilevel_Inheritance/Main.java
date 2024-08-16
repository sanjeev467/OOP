package Properties.Inheritance.Multilevel_Inheritance;

// Main class to test multilevel inheritance
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog dog = new Dog();

        // Access methods from all classes in the hierarchy
        dog.eat();  // Inherited from Animal class
        dog.walk(); // Inherited from Mammal class
        dog.bark(); // Defined in Dog class
    }
}
