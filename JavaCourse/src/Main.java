import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pear");

        fruits.remove(3);

        fruits.set(0, "Pineapple");

        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.size());

    }
}
