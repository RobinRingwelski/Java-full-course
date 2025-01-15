import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // for loop = execute a code a CERTAIN amount of time

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds for the countdown?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year!");

        scanner.close();
    }
}
