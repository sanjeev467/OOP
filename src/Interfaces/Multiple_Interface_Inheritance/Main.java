package Interfaces.Multiple_Interface_Inheritance;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();    // Output: Flying...
        duck.swim();   // Output: Swimming...
        duck.quack();  // Output: Quacking...
    }
}
