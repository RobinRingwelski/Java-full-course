
public class Main {

    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier
        //               It can be overridden to provide meaningful details/info.

        Car car1 = new Car("Toyota", "Aygo", 2009, "Red");
        Car car2 = new Car("Ford", "Mustang", 2015, "Blue");

        System.out.println(car1);
        System.out.println(car2);

    }

}
