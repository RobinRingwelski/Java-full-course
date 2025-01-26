
public class Car{

    String make = "Peugeot";
    String model = "107";
    int year = 2009;
    double price = 30000;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You turn off the engine");
    }
    void drive(){
        System.out.println("Your driving the " + make + " " + model);
    }
    void brake(){
        System.out.println("You brake");
    }

}
