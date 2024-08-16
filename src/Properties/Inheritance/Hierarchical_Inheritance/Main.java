package Properties.Inheritance.Hierarchical_Inheritance;

public class Main {
    public static void main(String[] args) {
        // Create instances of each subclass
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        // Each subclass can access the method of the parent class
        dog.eat();  // Output: Animal is eating
        dog.bark(); // Output: Dog is barking

        cat.eat();  // Output: Animal is eating
        cat.meow(); // Output: Cat is meowing

        bird.eat();  // Output: Animal is eating
        bird.fly();  // Output: Bird is flying
    }
}