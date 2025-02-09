
public class Main {

    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        //               For example, an Engine is "part of" a Car.
        //               Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Dodge", 1985, "V8");

        System.out.println(car.model + " " + car.year + " " + car.engine.type);

        car.start();
    }

}
