import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // If statements = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.hasNextBoolean();


        // Name checker
        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        // Age checker
        if(age >= 18){
            if (age >= 65){
                System.out.println("You are a Senior");
            } else if (age >= 18) {
                System.out.println("You are an adult!");
            }
        }
        else if(age < 0){
            System.out.println("You haven't been born yet");
        }
        else if(age == 0) {
            System.out.println("You are a baby");
        }
        else{
            System.out.println("You are a child!");
        }

        // isStudent checker
        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }

        scanner.close();
    }
}
