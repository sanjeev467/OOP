public class Main {
    public static void main(String[] args) {

        Student sanjeev = new Student("Sanjeev", 13, 85.6f);
        System.out.println(sanjeev.rollNo);
        System.out.println(sanjeev.name);
        System.out.println(sanjeev.marks);
        sanjeev.greeting();


    }


    /*
  create a class
  for every single student
*/
    static class Student{
        int rollNo;
        String name;
        float marks;

        // we need a way to add the values of the above
        // properties object by object

        // we need one word to access every object

        void greeting() {
            System.out.println("Hello! My name is " + this.name);
        }

        Student(String Naam, int rollN, float mark ){
            this.name = Naam;
            this.rollNo = rollN;
            this.marks = mark;

        }
    }
}