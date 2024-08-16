package Interfaces.Interface_Inheritance;

// Parent Interface
interface Vehicle {
    void start();
}

// Child Interface extending Vehicle
interface Car extends Vehicle {
    void drive();
}

// Implementing Class
class Sedan implements Car {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void drive() {
        System.out.println("Car driving.");
    }
}


