
public class Main {

    public static void main(String[] args) {

        // Polymorphism = "POLY" = "Many"
        //                "MORPH" = "Shape"
        //                Object can identify as other objects.
        //                Object can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }


    }

}
