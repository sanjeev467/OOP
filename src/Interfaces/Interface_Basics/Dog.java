package Interfaces.Interface_Basics;

/*
Implementing an Interface:
To use an interface, a class must implement it and provide concrete implementations
for all abstract methods defined in the interface.
 */

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Barking...");
    }
}


