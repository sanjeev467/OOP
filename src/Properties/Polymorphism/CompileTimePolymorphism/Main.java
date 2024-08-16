package Properties.Polymorphism.CompileTimePolymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20)); // Output: 30
        System.out.println(calc.add(10, 20, 30)); // Output: 60
    }
}

/*
In this example, the add method is overloaded, meaning there are multiple versions
of the method with different parameter lists.
The correct version of the method is selected based on the arguments provided.


 */