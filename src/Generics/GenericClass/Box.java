package Generics.GenericClass;

// Generic class
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

 class Main {
    public static void main(String[] args) {
        // Create a Box for storing an Integer
        Box<Integer> intBox = new Box<>();
        intBox.setItem(10);
        System.out.println("Integer in the box: " + intBox.getItem()); // Output: Integer in the box: 10

        // Create a Box for storing a String
        Box<String> strBox = new Box<>();
        strBox.setItem("Hello");
        System.out.println("String in the box: " + strBox.getItem()); // Output: String in the box: Hello
    }
}
