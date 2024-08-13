package OOPs2.Static_Variable;


public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.count); // Output: 2
    }

}

/*
A static variable is shared among all instances of a class.
 It is created when the class is loaded and destroyed when the class is unloaded.
Useful for defining constants or variables that should have the same value across all instances.
*/
