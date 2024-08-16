package Interfaces.Multiple_Interface;

interface Movable {
    void move();
}

interface Eatable {
    void eat();
}

class Robot implements Movable, Eatable {
    @Override
    public void move() {
        System.out.println("Moving...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
}

