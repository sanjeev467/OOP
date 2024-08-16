package Properties.Inheritance.Hierarchical_Inheritance;

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Another subclass of Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Another subclass of Animal
class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying");
    }
}


