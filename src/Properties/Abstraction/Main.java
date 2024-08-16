package Properties.Abstraction;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();  // Output: Drawing a circle
        shape.commonFunctionality(); // Output: Common functionality for all shapes
    }
}
