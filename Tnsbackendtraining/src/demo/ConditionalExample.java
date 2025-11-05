package demo;

public class ConditionalExample {
    public static void main(String[] args) {

        int marks = 85;
        int age = 20;
        String citizenship = "Indian";
       

        // Simple if statement
        if (marks > 50) {
            System.out.println("You have passed the exam!");
        }

        //  if-else statement
        if (marks >= 90) {
            System.out.println("Excellent performance!");
        } else {
            System.out.println("Good, but can improve!");
        }

        //  if-else-if ladder
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        //  Nested if statement
        if (age >= 18) {
            if (citizenship.equals("Indian")) {
                System.out.println("eligible to vote in India.");
            } else {
                System.out.println("not an Indian citizen, cannot vote here.");
            }
        } else {
            System.out.println("under 18, not eligible to vote.");
        }

        
    }
}