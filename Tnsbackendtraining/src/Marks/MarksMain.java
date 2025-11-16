package Marks;

public class MarksMain {
    public static void main(String[] args) {
        try {
            Markschecker m = new Markschecker(101); 
        } catch (InvalidMarks | ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
