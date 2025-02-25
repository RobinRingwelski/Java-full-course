
public class Main {

    public static void main(String[] args)  {

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        Box<Integer> box = new Box<>();
        Product<String, Double> product1 = new Product<>("Banana", 1.25);
        Product<String, Integer> product2 = new Product<>("MovieTicket", 15);

        System.out.println("The first product is a " + product1.getItem() + " and it costs: " + product1.getPrice());
        System.out.println("The second product is a " + product2.getItem() + " and it costs: " + product2.getPrice());

    }
}
