
public class Main {

    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE
        // SETTERS = Methods that make a field WRITEABLE

        Car car = new Car("Charger", "Yellow", 15000);

        car.setColor("Red");
        car.setPrice(-1);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
