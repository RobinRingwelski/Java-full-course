import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Runtime Polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object.

        Animal animal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want a cat or a dog? ");
        String choice = scanner.next();

        if(choice.equals("Cat") || choice.equals("cat")){
            animal = new Cat();
        }
        else if(choice.equals("Dog") || choice.equals("dog")){
            animal = new Dog();
        }
        else{
            System.out.println("You did not choose between a cat or dog!");
            return;
        }

        animal.speak();
    }
}
