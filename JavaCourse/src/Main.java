
public class Main {

    static int x = 3; // Class variable

    public static void main(String[] args) {

        // variable scope = where a variable can be

        int x = 1; // Local variable

        doesSomething();
    }

    static void doesSomething(){

        int x = 2; // Local variable

        System.out.println(x);
    }


}
