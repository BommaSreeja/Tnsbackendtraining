 package Marks;

// Class to check marks
class Markschecker {
    public Markschecker(int marks) throws InvalidMarks, ArithmeticException {
        if (marks <= 0 || marks > 100) {
            throw new InvalidMarks("Enter the values b/w 1 to 100");
        } else {
            System.out.println("marks are valid");
        }
    }
}
