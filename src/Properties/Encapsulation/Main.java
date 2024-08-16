package Properties.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

        System.out.println("Name: " + person.getName()); // Output: Name: John Doe
        System.out.println("Age: " + person.getAge());   // Output: Age: 30
    }
}