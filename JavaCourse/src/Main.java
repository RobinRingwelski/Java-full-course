
public class Main {

    public static void main(String[] args) {

        // making Car objects
        Car car1 = new Car("Peugeot", "Yellow");
        Car car2 = new Car("Corvette", "Red");
        Car car3 = new Car("Charger", "Green");

        // making object array
        Car[] cars = {car1, car2, car3};

        // Could also be done like this
/*        Car[] cars = {new Car("Peugeot", "Yellow"),
                        new Car("Corvette", "Red"),
                        new Car("Charger", "Green")};
*/

        // for every Car object in our car array do method
        for (Car car : cars) {
            car.drive();
        }

    }

}
