package Interfaces.Multiple_Interface_Inheritance;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Duck extends Flyable, Swimmable {
    void quack();
}

class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }

    @Override
    public void quack() {
        System.out.println("Quacking...");
    }
}


