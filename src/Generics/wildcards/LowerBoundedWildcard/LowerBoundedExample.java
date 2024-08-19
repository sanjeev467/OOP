package Generics.wildcards.LowerBoundedWildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedExample {

    // Method that accepts a list with lower-bounded wildcard
    public static void addNumbers(List<? super Integer> list) {
        // You can add Integer or any subclass of Integer to the list
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        // List of Integer (exact match)
        List<Integer> intList = new ArrayList<>();
        addNumbers(intList);
        System.out.println(intList); // Output: [10, 20, 30]

        // List of Number (superclass of Integer)
        List<Number> numList = new ArrayList<>();
        addNumbers(numList);
        System.out.println(numList); // Output: [10, 20, 30]

        // List of Object (superclass of Number and Integer)
        List<Object> objList = new ArrayList<>();
        addNumbers(objList);
        System.out.println(objList); // Output: [10, 20, 30]
    }
}
