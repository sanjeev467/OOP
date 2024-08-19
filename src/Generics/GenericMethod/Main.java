package Generics.GenericMethod;

public class Main {
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World"};

        printArray(intArray); // Output: 1 2 3 4 5
        printArray(strArray); // Output: Hello World
    }
}
