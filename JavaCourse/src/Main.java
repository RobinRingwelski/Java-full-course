
public class Main {

    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()


        String name = "Robin";
        int age = 20;

        happyBirthday(name, age);

        System.out.println(square(3));

        System.out.println(cube(3));

        String fullName = getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must be 18+ to sign up!");
        }

    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday " + name + " You are " + age + " years old!");
    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String name, String lastName){
        return name + " " + lastName;
    }

    static boolean ageCheck(int age){
        return age >= 18;
    }

}
