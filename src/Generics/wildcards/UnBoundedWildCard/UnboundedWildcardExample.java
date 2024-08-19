package Generics.wildcards.UnBoundedWildCard;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcardExample {
    // Method with unbounded wildcard
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // List of integers
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        printList(intList); // Output: 1 2 3 4 5

        // List of strings
        List<String> strList = Arrays.asList("Apple", "Banana", "Cherry");
        printList(strList); // Output: Apple Banana Cherry

        // List of doubles
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        printList(doubleList); // Output: 1.1 2.2 3.3
    }
}
