package Generics.Generic_Interfaces;

// Generic interface
interface Container<T> {
    void add(T item);
    T get();
}

// Implementing the generic interface with a specific type
class Box<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}

 class Main {
    public static void main(String[] args) {
        // Using Box with Integer
        Container<Integer> intBox = new Box<>();
        intBox.add(10);
        System.out.println("Integer in the box: " + intBox.get()); // Output: Integer in the box: 10

        // Using Box with String
        Container<String> strBox = new Box<>();
        strBox.add("Hello");
        System.out.println("String in the box: " + strBox.get()); // Output: String in the box: Hello
    }
}
