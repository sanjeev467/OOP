package OOPs1;

// Class and Constructor

public class Classes {
    public static void main(String[] args) {

        Student sanjeev = new Student("Sanjeev", 13, 85.6f);
//        System.out.println(sanjeev.rollNo);
//        System.out.println(sanjeev.name);
//        System.out.println(sanjeev.marks);
//        sanjeev.greeting();
//        sanjeev.changeName("Sansay"); // now if i do greeting() name will be sansay
//        sanjeev.greeting();

        Student random = new Student(sanjeev); // a constructor that takes values from another object
        // here the object is sanjeev
        System.out.println(random.name);
        // here this.name will be random.name and other.name will be sanjeev.name





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

        void changeName(String newName){
            this.name = newName;
        }

        Student (Student other){
            this.name = other.name;
            this.rollNo = other.rollNo;
            this.marks = other.marks;
        }   // here this.name will be random.name and other.name will be sanjeev.name


        Student(){
            this.rollNo = 13;
            this.name = "Sanjeev Pandey";
            this.marks = 88.5f;

        }

        Student(String name, int rollN, float mark ){
            this.rollNo = rollN;
            this.name = name;
            this.marks = mark;

        }
    }
}
