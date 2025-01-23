import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Arrays

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        int numOfFruits = fruits.length;

        System.out.println("Number of fruits in list: " + numOfFruits);


        // Printing each fruit in the fruits array
        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // Can also be done like this with enhanced forloop
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        Arrays.sort(fruits);

        for(int j = 0; j < fruits.length; j++) {
            System.out.println(fruits[j]);
        }

    }
}
