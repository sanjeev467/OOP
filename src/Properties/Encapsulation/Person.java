package Properties.Encapsulation;

class Person {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

/*
Explanation:
Encapsulation: In this example, the Person class encapsulates the name and age fields by making them private.
This means they cannot be accessed directly from outside the class.
Instead, you must use the public getter and setter methods to access and modify these fields.
Data Protection: The setter methods allow you to control how the data is modified (e.g., ensuring age is positive),
thereby protecting the object's internal state from invalid or harmful data.
 */
