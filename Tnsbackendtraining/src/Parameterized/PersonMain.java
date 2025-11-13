package Parameterized;

public class PersonMain {
    public static void main(String[] args) {
        Person[] p = { new Person("Sree", 21), new Person("Sam", 20) };

        for (Person person : p) {
            System.out.println(person);  // calls toString()
        }
    }
}
