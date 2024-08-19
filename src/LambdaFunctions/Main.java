package LambdaFunctions;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Task is running");
        Thread thread = new Thread(task);
        thread.start();
    }
}
