package Controlstatement;

public class ControlStatementExample {
    public static void main(String[] args) {

        // For loop — executes a fixed number of times
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // While loop — runs while condition is true
        int j = 1;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }

        // Do-while loop — executes at least once, then checks condition
        int k = 1;
        do {
            System.out.println("Value: " + k);
            k++;
        } while (k <= 5);

        // Enhanced For loop — used for arrays or collections
        int[] arr = {10, 20, 30, 40, 50};
        for (int num : arr) {
            System.out.println(num);
        }

        
    }
}
