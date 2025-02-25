import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args)  {

        // Java COUNTDOWN TIMER PROGRAM

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of seconds for countdown: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count <= 0){
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);

    }
}
