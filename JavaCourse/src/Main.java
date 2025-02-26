import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.println("What day of the week is it?: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            switch(day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday!");
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend!");
            }
        } catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day!");
        }

        scanner.close();
    }
}
