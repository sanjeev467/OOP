package OOPs2.NonStatic_Nested_Class;

public class OuterClass {
    private String instanceData = "Instance Data";

    // Non-static inner class
    public class InnerClass {
        public void display() {
            // Can access instance members of the outer class
            System.out.println("Accessing instance member: " + instanceData);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outerInstance = new OuterClass();

        // Instantiate the inner class using the outer class instance
        OuterClass.InnerClass innerInstance = outerInstance.new InnerClass();
        innerInstance.display(); // Output: Accessing instance member: Instance Data
    }
}

