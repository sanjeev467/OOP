package OOPs2.Static_Block;

public class SimpleExample {
    public static int count;

    // Static block to initialize the static variable
    static {
        count = 10;
        System.out.println("Static block executed. Count initialized to " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("Count value is: " + count);
    }
}

/*
Static Variable: The class SimpleExample has a static variable count.
Static Block: The static block initializes the count variable to 10 and prints a message.
This block is executed once when the class is loaded into memory.
Main Method: When the program runs,
it first executes the static block (before the main method) because the class must
be initialized before the main method executes.

Output will be in sequence
Static block executed. Count initialized to 10
Main method executed.
Count value is: 10
 */

