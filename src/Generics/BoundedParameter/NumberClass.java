package Generics.BoundedParameter;

class NumberBox<T extends Number> {
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }
}

 class Main {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setNumber(10);
        System.out.println("Number in the box: " + intBox.getNumber()); // Output: Number in the box: 10

        // NumberBox<String> strBox = new NumberBox<>(); // This will cause a compile-time error
    }
}
