
public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent("Robin", "Ringwelski");
        Child child = new Child("Bob", "Scones");

        System.out.println(child.firstname + " " + child.lastname);

        System.out.println(parent.firstname + " " + parent.lastname);

        parent.yelling();
        child.yelling();

    }

}
