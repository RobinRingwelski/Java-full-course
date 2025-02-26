
public class Main {

    public static void main(String[] args) {

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations

        Thread thread1 = new Thread(new MyRunnable("ping"));
        Thread thread2 = new Thread(new MyRunnable("pong"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println("MultiThreading was interrupted!");
        }
        System.out.println("Game Over!");
    }
}
