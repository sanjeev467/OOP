package Properties.Polymorphism.RunTimePolymorphism;

public class Main {
    public static void main(String[] args) {
        // Reference of type Animal, object of type Dog
        Animal myDog = new Dog();
        myDog.sound(); // Output: Dog barks

        // Reference of type Animal, object of type Cat
        Animal myCat = new Cat();
        myCat.sound(); // Output: Cat meows

        // Reference of type Animal, object of type Animal
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Output: Animal makes a sound
    }
}


/*
Explanation:
Superclass (Animal): Defines a sound() method that prints a generic message.
Subclass (Dog): Overrides the sound() method to provide a specific implementation that prints "Dog barks."
Subclass (Cat): Overrides the sound() method to provide a specific implementation that prints "Cat meows."
In the main method:

When myDog.sound() is called, the sound() method of the Dog class is executed, even though the reference type is Animal.
Similarly, myCat.sound() calls the sound() method of the Cat class.
When myAnimal.sound() is called, the sound() method of the Animal class is executed because the object is of type Animal.
 */