package Arrays;

public class MultiArray {

    public static void main(String[] args) {

        int aar[][] = {{2, 3, 4}, {5, 6, 7}};

        for (int i = 0; i < aar.length; i++) {          // loop over rows
            for (int j = 0; j < aar[i].length; j++) {   // loop over columns
                System.out.print(aar[i][j] + " ");      // print each element
            }
            System.out.println(); // move to next line after each row
        }
    }
}
