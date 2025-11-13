package Scanner;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter the following details");

        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the name");
        String name = sc.nextLine(); 
        
        System.out.println("Enter id");
        int id = sc.nextInt();

        System.out.println("The entered details are");
        System.out.println("Entered name is " + name);
        System.out.println("Entered id is " + id);

        
    }
}
