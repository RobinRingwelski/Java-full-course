import java.util.HashMap;

public class Main {

    public static void main(String[] args)  {

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 0.50);
        map.put("Orange", 0.75);
        map.put("Banana", 0.25);
        map.put("Coconut", 1.00);

        //map.remove("Apple");
        //System.out.println(map.get("coconut"));
        //System.out.println(map.containsKey("Apple"));
        //System.out.println(map.containsValue(1.00));
        //System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : €" + map.get(key));
        }

    }
}
