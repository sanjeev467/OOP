package OOPs2.Static_Nested_Class;

public class OuterClass {
    private static String staticData = "Static Data";

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            // Can access static members of the outer class
            System.out.println("Accessing static member: " + staticData);
        }
    }

    public static void main(String[] args) {
        // Instantiate static nested class without needing an instance of the outer class
        OuterClass.StaticNestedClass nestedInstance = new OuterClass.StaticNestedClass();
        nestedInstance.display(); // Output: Accessing static member: Static Data
    }
}

