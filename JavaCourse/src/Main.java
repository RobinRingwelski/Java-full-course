
public class Main {

    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.


        // Deprecated method using wrapper classes
        /*
        Integer a = new Integer(123);
        double b = new Double(3.15);
        Character c = new Character('€');
        Boolean d = new Boolean(true); */

        // New or standard version of using Wrapper classes:
        // called Autoboxing
        Integer a = 134;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing
        int x = a;

    }
}
