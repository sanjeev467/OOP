package Generics.wildcards.UpperBoundedWildCard;

import java.util.Arrays;
import java.util.List;

class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

 class UpperBoundedWildcardExample {
    // Method with upper-bounded wildcard
    public static void makeAnimalsSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sound(); // Allowed, since all elements are at least Animal
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        makeAnimalsSound(dogs); // Output: Bark Bark
        makeAnimalsSound(cats); // Output: Meow Meow
    }
}
