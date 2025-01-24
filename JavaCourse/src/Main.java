
public class Main {

    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        // Useful for storing matrix of data

        // 1D arrays
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        // 2D array or grid/matrix (dosen't need to be the array name could also just be the array itself)
        String[][] groceries = {fruits, vegetables, meats};

        // changing something inside the 2D array you should use both indexes of the array and then the item
        groceries[0][0] = "pineapple";
        groceries[1][0] = "celery";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }

}
