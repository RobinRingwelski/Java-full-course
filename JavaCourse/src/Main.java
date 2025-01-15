
public class Main {

    public static void main(String[] args) {

        // continue and break

        for (int i = 0; i < 15; i++){

            if(i == 5){
                continue;
            }

            if(i == 11) {
                break;
            }

            System.out.print(i + " ");
        }
    }
}
