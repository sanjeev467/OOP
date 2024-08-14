package Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        // calling the constructor which has 3 arguments
        Box box1 = new Box(4, 5, 6);
//        System.out.println(box1.h + " " + box1.l  + " " + box1.w);

        // Calling the constructor which takes object of type Box
        Box box2 = new Box(box1); // its takes box1 as argument
        System.out.println(box2.h + " " + box2.l  + " " + box2.w);


    }

}
