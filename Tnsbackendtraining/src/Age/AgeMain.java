package Age;

public class AgeMain {
    public static void main(String[] args) {
        try {
            AgeChecker ac = new AgeChecker(66); // Test with invalid age
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
    }
}
