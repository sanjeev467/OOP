package Properties.Inheritance.Multilevel_Inheritance;

// Grandparent class (Base class)
class Animal {
    // Constructor of Animal class
    Animal() {
        System.out.println("Animal constructor called");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

// Parent class (Subclass of Animal)
class Mammal extends Animal {
    // Constructor of Mammal class
    Mammal() {
        // Calls the constructor of the Animal class (implicitly)
        System.out.println("Mammal constructor called");
    }

    public void walk() {
        System.out.println("Mammal walks");
    }
}

// Child class (Subclass of Mammal)
class Dog extends Mammal {
    // Constructor of Dog class
    Dog() {
        // Calls the constructor of the Mammal class (implicitly)
        System.out.println("Dog constructor called");
    }

    public void bark() {
        System.out.println("Dog barks");
    }
}



