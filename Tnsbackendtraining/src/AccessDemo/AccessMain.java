package AccessDemo;

public class AccessMain {

	public static void main(String[] args) {
	        // Creating object
	        AccessDemo ob = new AccessDemo();

	        // Accessing public and default members directly
	        ob.name = "Sreeja";
	        ob.address = "Hyderabad";
	        ob.branch = "CSM";

	        // Accessing private variable through getter & setter
	        ob.setContactno(987654321);

	        // Display the values
	        ob.display();

	        // Or print individually
	        System.out.println("Contact number (via getter): " + ob.getContactno());
	    

	}

}
