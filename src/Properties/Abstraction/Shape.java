package Properties.Abstraction;

// Abstract class defining a general concept of a shape
abstract class Shape {
    // Abstract method (no implementation)
    abstract void draw();

    // Concrete method
    void commonFunctionality() {
        System.out.println("Common functionality for all shapes");
    }
}

// Concrete class extending abstract class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}


