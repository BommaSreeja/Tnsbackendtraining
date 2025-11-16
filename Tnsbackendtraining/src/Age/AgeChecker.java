package Age;

// Class to check age
class AgeChecker {
    public AgeChecker(int age) throws InvalidAge {
        if (age <=18  || age > 100) {
            throw new InvalidAge("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }
}
