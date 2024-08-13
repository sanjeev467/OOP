package OOPs2.Static_Method;

public class Main {
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 10); // Call static method without an instance
        System.out.println(sum); // Output: 15
    }
}
/*
A static method belongs to the class rather than any specific instance.
 It can be called without creating an instance of the class.
Static methods can only directly access other static members (variables or methods) and
 cannot access instance variables or methods directly.
Often used for utility or helper methods that perform operations without needing object state.
*/
